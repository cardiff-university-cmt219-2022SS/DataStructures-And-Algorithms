package cn.allwayz.DataStructures.LinkedList;

/**
 * 单向链表缺点分析：
 * <li>单向链表查找方向只能是一个方向，双向链表可以向前或向后查找</li>
 * <li>单向链表不能自我删除，需要依靠辅助节点，双向链表可以自我删除。所以之前删除单项链表节点时，总是找到带删除节点的前一个节点来删除</li>
 *
 * @author allwayz
 */
public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        DoubleNode node1 = new DoubleNode(0, "0");
        DoubleNode node2 = new DoubleNode(1, "1");
        DoubleNode node3 = new DoubleNode(2, "2");
        DoubleNode node4 = new DoubleNode(3, "3");
        DoubleNode node5 = new DoubleNode(4, "4");
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(node1);
        doubleLinkedList.add(node2);
        doubleLinkedList.add(node3);
        doubleLinkedList.add(node4);
        doubleLinkedList.add(node5);

        doubleLinkedList.delete(2);
        doubleLinkedList.update(new DoubleNode(4, "9"));
        doubleLinkedList.list();


    }
}

/**
 * 双向链表操作思路:<br>
 *
 * <ul>
 *     <li><b>Foreach</b></li>
 *     <ol>
 *         <li>方法和单链表一样，只不过可以向前也可以向后</li>
 *     </ol>
 *     <li><b>Add(默认添加到双向链表的最后)</b></li>
 *     <ol>
 *         <li>先找到双向链表最后的节点</li>
 *         <li><code>temp.next=newNode;</code></li>
 *         <li><code>newNode.pre=temp;</code></li>
 *     </ol>
 *     <li><b>Update</b></li>
 *     <ol>
 *         <li>和单项链表一样</li>
 *     </ol>
 *     <li><b>Delete</b></li>
 *     <ol>
 *         <li>因为是双向链表，因此可以实现自我删除</li>
 *         <li>直接找到要删除的节点，比如<code>temp</code></li>
 *         <li><code>temp.pre.next=temp.next;</code></li>
 *         <li><code>temp.next.pre=temp.pre;</code></li>
 *     </ol>
 * </ul>
 */
class DoubleLinkedList {
    private DoubleNode head = new DoubleNode(0, "");

    public DoubleNode getHead() {
        return head;
    }

    public void list() {
        if (head.next == null) {
            System.out.println("LinkedList is null");
            return;
        }
        DoubleNode temp = head.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void add(DoubleNode node) {
        DoubleNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        node.pre = temp;
        temp.next = node;
    }

    public void update(DoubleNode doubleNode) {
        if (head.next == null) {
            return;
        }
        DoubleNode temp = head;
        while (temp != null) {
            if (temp.id == doubleNode.id) {
                break;
            }
            temp = temp.next;
        }
        temp.name = doubleNode.name;
    }

    public void delete(int id) {
        DoubleNode temp = head.next;
        while (temp != null) {
            if (temp.id == id) {
                temp.pre.next = temp.next;
                if (temp.next != null) {
                    temp.next.pre = temp.pre;
                }
                break;
            }
            temp = temp.next;
        }
    }
}

class DoubleNode {
    public int id;
    public String name;
    public DoubleNode pre;
    public DoubleNode next;

    public DoubleNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node:[id=" + id + ",name=" + name + "]";
    }
}

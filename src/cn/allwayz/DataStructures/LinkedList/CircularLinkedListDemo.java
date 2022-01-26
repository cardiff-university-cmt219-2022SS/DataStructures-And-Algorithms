package cn.allwayz.DataStructures.LinkedList;

/**
 * Josephus Puzzle: 设编号为1,2 ... n的n个人围坐一圈，约定编号为k(1<=k<=n)的人从1开始报数，
 * 数到m的那个人出列，他的下一位又从1开始报数。直到所有人出列为止，由此产生一个出列编号的序列。
 *
 * @author allwayz
 */
public class CircularLinkedListDemo {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.add(5);

        circularLinkedList.list();
        circularLinkedList.JosephusPuzzle(2);
    }
}

/**
 * 构建一个单项环形链表
 * 先创建第一个节点，让first指向该节点，并形成环形
 * 后面每创建一个新的节点，就让
 */
class CircularLinkedList {
    private CircularNode first = null;


    public void add(int nodeNum) {
        CircularNode current = null;
        for (int i = 0; i < nodeNum; i++) {
            CircularNode node = new CircularNode(i + 1);
            if (i == 0) {
                first = node;
                first.next(first);
                current = first;
            } else {
                current.next = node;
                node.next = first;
                current = node;
            }
        }
    }

    public void list() {
        System.out.println("=====List=====");
        CircularNode temp = first;
        while (true) {
            System.out.println(temp);
            if (temp.next == first) {
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * 思路：
     * <ol>
     *     <li>创建一个辅助变量，最初指向环形链表的最后一个节点</li>
     *     <li>当循环进行时，让first和temp同时移动m-1次</li>
     *     <li>然后从环形链表中去除节点。 <i>first = first.next; temp.next = first</i></li>
     * </ol>
     *
     * @param i
     */
    public void JosephusPuzzle(int i) {
        System.out.println("=====Josephus Puzzle=====");
        CircularNode temp = first;
        while (temp.next != first) {
            temp = temp.next;
        }

        while (true){
            if (first.next == first){
                System.out.println(first);
                break;
            }
            for (int j = 0; j < i-1; j++) {
                first = first.next;
                temp = temp.next;
            }
            System.out.println(first);
            first = first.next;
            temp.next = first;
        }
    }
}


class CircularNode {
    public int id;
    public CircularNode next;

    public CircularNode(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Node:[id=" + id + "]";
    }

    public void next(CircularNode node) {
        this.next = node;
    }
}

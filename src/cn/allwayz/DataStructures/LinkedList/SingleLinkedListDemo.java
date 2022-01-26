package cn.allwayz.DataStructures.LinkedList;

import java.util.Stack;

/**
 * - 链表是以节点的方式来存储的
 * - 每个节点包含data域和next域：指向下一个节点
 * - 链表的特点：链表的各个节点不一定是连续存放的
 * - 链表分为带头节点的链表和没有头节点的链表（根据实际需求来确定）
 * <p>
 * 实际案例：{
 * 需求：管理在线用户，每隔一段时间，把某个人的好友发给服务器，但是好友的ID号并不是连续的。
 * 要求服务器按照好友ID的顺序返回来。 不允许查数据库，直接在内存中完成。
 * （要求占用资源少，速度快）
 * }
 *
 * @author allwayz
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        /*
        1、头节点不存放具体的数据，作用就是表示单链表的头
        头节点的next域指向下一个节点
        2、后面每添加一个节点，就直接加入到链表的最后
        3、遍历时，通过一个辅助变量，帮助遍历整个单链表
         */
        SingleNode node0 = new SingleNode(1, "0");
        SingleNode node1 = new SingleNode(2, "1");
        SingleNode node2 = new SingleNode(3, "2");
        SingleNode node3 = new SingleNode(4, "3");
        SingleNode node4 = new SingleNode(5, "4");
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(node0);
        singleLinkedList.add(node1);
        singleLinkedList.add(node2);
        singleLinkedList.add(node3);
        singleLinkedList.add(node4);
        singleLinkedList.update(new SingleNode(4,"9"));
        singleLinkedList.list();

        singleLinkedList.getCount();
        System.out.println("====================");
        singleLinkedList.getConvertK(3);
        System.out.println("====================");
        SingleLinkedList.getReverseByStack(singleLinkedList.getHead());
        System.out.println("====================");
        SingleLinkedList.reverseSingleLinkedList(singleLinkedList.getHead());
        singleLinkedList.list();
    }
}

/**
 * 定义一个SingleLinkedList管理TempNode
 */
class SingleLinkedList {
    /**
     * 先初始化一个头节点
     */
    private SingleNode head = new SingleNode(0, "");

    /**
     * 添加节点到单向链表
     * 思路：
     * - 当不考虑ID的顺序时
     * - 找到当前链表的最后一个节点
     * - 将最后这个节点的next域 指向新的节点
     */
    public void add(SingleNode node) {
        // 因为头节点不能动，所以需要一个辅助指针 temp
        SingleNode temp = head;
        // 遍历列表，找到最后
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }

    public void list() {
        // 判断链表是否为空
        if (head.next == null) {
            return;
        }
        // 头节点不能动，所以需要辅助变量来遍历
        SingleNode temp = head.next;
        while (true) {
            System.out.println(temp);
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * 修改节点信息，根据newTempNode的Id来修改，即Id不能修改
     * @param newSingleNode
     */
    public void update(SingleNode newSingleNode) {
        if(head.next == null){
            System.out.println("LinkedList Is Null");
            return;
        }
        // 找到需要修改的节点
        // 先定义一个辅助变量
        SingleNode temp = head.next;
        boolean flag = false;
        while (true){
            if (temp == null){
                break;
            }
            if (temp.id == newSingleNode.id){
                flag = true;
                temp.name = newSingleNode.name;
                break;
            }
            temp = temp.next;
        }
        if (!flag){
            System.out.println("Unknown Node");
        }
    }

    /**
     * <b>从单链表中删除一个节点</b>
     * <lu>
     *  <li>辅助变量指向待删除节点的前一个节点</li>
     *  <li>temp.next = temp.next.next</li>
     *  <li>被删除的节点没有其他引用，会被垃圾回收机制回收掉</li>
     * </lu>
     * @param id
     */
    public void delete(int id){
        SingleNode temp = head;
        while (true){
            if (temp.next == null){
                break;
            }
            if (temp.next.id == id){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }


    /**
     * 求单链表中节点个数
     * 头节点算不算？
     */
    public int getCount(){
        SingleNode temp = head;
        int count = 0;
        while (temp.next != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    /**
     * 查找单链表中的倒数第k个节点
     * <lu>
     *     <li><b>思路</b></li>
     *     <li>接收head节点，同时接收index，index表示倒数第index个节点</li>
     *     <li>链表从头到尾遍历，得到链表的总长度</li>
     *     <li>得到size之后，从链表的第一个开始遍历，遍历size-index个</li>
     * </lu>
     * @param k
     * @return
     */
    public SingleNode getConvertK(int k){
        int count = 0;
        SingleNode temp = head.next;
       while (count != this.getCount()-k){
            count++;
            temp = temp.next;
        };
        System.out.println(temp);
        return temp;
    }

    /**
     * 单链表的反转
     * <lu>
     *     <li>先定义一个节点 reverseHead = new TempNode()</li>
     *     <li>Foreach the LinkedList, get each node and put in the front of the new reverseHead</li>
     *     <li>head.next of original LinkedList equals reverseHead.next</li>
     * </lu>
     */
    public static void reverseSingleLinkedList(SingleNode head){
//        如果当前链表为空或只有一个节点，则无需反转
        if (head.next == null || head.next.next == null){
            return;
        }
//        先定义一个辅助指针，帮助便利原来的链表
        SingleNode current = head.next;
//        指向当前节点(current)的下一个
        SingleNode next = null;
        SingleNode reverseHead = new SingleNode(0,"");

        while (current != null){
            next = current.next;
            current.next = reverseHead.next;
            reverseHead.next = current;
            current = next;
        }
        head.next = reverseHead.next;

    }

    /**
     * 从尾到头打印单链表 【方式1：反向遍历(不推荐，因为会破坏原本链表的结构)，方式2：Stack栈】
     * 思路：将单链表遍历，并压入栈中。因为栈遵循先入后出原则，所以使用while循环对栈进行pop，可以得到单链表反转打印
     * Stack Like a put bullet into a mag, The first bullet in the magazine will be fired last
     * @param head
     */
    public static void getReverseByStack(SingleNode head){
        Stack<SingleNode> singleNodeStack = new Stack<>();
        SingleNode temp = head;
        while (temp.next!=null){
            temp = temp.next;
            singleNodeStack.push(temp);
        }
        while (!singleNodeStack.isEmpty()){
            System.out.println(singleNodeStack.pop());
        }
    }

    /**
     * 合并两个有序链表，合并之后的连标依然有序
     * @return
     */
    public SingleLinkedList mergeList(){

        return new SingleLinkedList();
    }

    public SingleNode getHead() {
        return head;
    }
}

class SingleNode {
    public int id;
    public String name;
    public SingleNode next;

    public SingleNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 为了显示方便，重写(Override)ToString()方法
     *
     * @return
     */
    @Override
    public String toString() {
        return "TempNode:[id=" + id + ",name=" + name + "]";
    }
}

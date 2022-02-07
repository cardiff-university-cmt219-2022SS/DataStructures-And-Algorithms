package cn.allwayz.DataStructures.LinkedList.LeetCode;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * @author allwayz
 * @create 2022-02-07 00:39
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        while (l1.next != null) {
//            ListNode temp = l1.next.next;
//            l1.next.next = l1;
//            l1.next = temp;
//        }
//        while (l2.next != null) {
//            ListNode temp = l2.next.next;
//            l2.next.next = l2;
//            l2.next = temp;
//        }
        l1.list();
        l2.list();

        return null;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public void list() {
            ListNode temp = this;
            while (this.next != null) {
                System.out.println("Val: " + temp.val);
                temp = temp.next;
            }
        }
    }

}




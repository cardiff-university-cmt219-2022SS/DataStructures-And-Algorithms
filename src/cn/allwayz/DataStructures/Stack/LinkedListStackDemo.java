package cn.allwayz.DataStructures.Stack;

import java.util.Scanner;

/**
 * @author allwayz
 */
public class LinkedListStackDemo {
    public static void main(String[] args) {
        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push(new StackNode(1, "0"));
        linkedListStack.push(new StackNode(2, "1"));
        linkedListStack.push(new StackNode(3, "2"));
        linkedListStack.push(new StackNode(4, "3"));
        linkedListStack.push(new StackNode(5, "4"));

        linkedListStack.pop();
        linkedListStack.pop();
    }

}

/**
 * 用链表实现栈，就是头插法
 */
class LinkedListStack {
    private StackNode top = new StackNode(0, "");

    public void push(StackNode node) {
        if (top.next == null) {
            top.next = node;
            return;
        }
        node.next = top.next;
        top.next = node;
    }

    public void pop() {
        if (top.next == null) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(top.next);
        top.next = top.next.next;
    }

    public void list() {
        if (top.next == null) {
            System.out.println("Stack is Empty");
            return;
        }
        StackNode temp = top.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

}

class StackNode {
    public int id;
    public String name;
    public StackNode next;

    public StackNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 为了显示方便，重写(Override)ToString()方法
     */
    @Override
    public String toString() {
        return "Node:[id=" + id + ",name=" + name + "]";
    }
}






















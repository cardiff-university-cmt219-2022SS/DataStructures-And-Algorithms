package cn.allwayz.DataStructures.Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Stack
 * <ol>
 *     <li>栈是一个<b>先入后出</b>的有序列表</li>
 *     <li>栈是限制线性表中元素的插入和删除<b>只能在线性表的同一端</b>进行的一种特殊线性表。允许插入和删除的一端，为变化的一端，称为栈顶(Top)，另一端为固定的一端，称为栈底(bottom)</li>
 *     <li>根据栈的定义可知，最先放入栈中的元素在栈底，最后放入的元素在栈顶，而删除元素刚好相反，最后放入的元素最先删除，最先放入的元素最后删除</li>
 *     <li>入栈:(push)  出栈:(pop)</li>
 * </ol>
 *
 * <hr>
 * 应用场景
 * <ol>
 *     <li>子程序的调用：在跳往子程序前，会先将下个指令的地址存到堆栈中，直到子程序执行完后再将地址取出，以回到原来的程序中。</li>
 *     <li>处理递归调用：和子程序的调用类似，只是除了储存下一个指令的地址外，也将参数、区域变量等数据存入堆栈中。表达式的转换与求值（实际解决）。[中缀表达式转后缀表达式]</li>
 *     <li>二叉树的遍历。</li>
 *     <li>图形的深度优先(Depth-First)搜索法。</li>
 * </ol>
 *
 * @author allwayz
 */
public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(4);
        // arrayStack.action();
        ArrayStack.calculator("3+2*6-2");
    }
}

/**
 * 实现栈的思路分析
 * <ol>
 *     <li>使用数组来模拟栈</li>
 *     <li>定义一个top来表示栈顶，初始化为-1</li>
 *     <li>入栈操作：当有数据加入栈时， top++; stack[top]=data</li>
 *     <li>出栈操作：临时变量先拿到栈顶数据，再top--;return data</li>
 * </ol>
 */
class ArrayStack {
    private int maxSize;
    private int[] stack;
    private int top = -1;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    public Boolean isFull() {
        return top == maxSize - 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (isFull()) {
            return;
        }
        top++;
        stack[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty.");
        }
        int temp = stack[top];
        top--;
        return temp;
    }

    /**
     * 遍历时需要从栈顶开始显示数据
     */
    public void list() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d]=%d\n", i, stack[i]);
        }
    }

    public void action() {
        String key = "";
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        while (loop) {
            key = scanner.next();
            switch (key) {
                case "show":
                    list();
                    break;
                case "push":
                    int value = scanner.nextInt();
                    push(value);
                    break;
                case "pop":
                    try {
                        int res = pop();
                        System.out.printf("data: %d", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "exit":
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }

    public void peek() {
        System.out.printf("stack[%d]=%d\n", top, stack[top]);
    }

    /**
     * 使用栈完成计算一个表达式的结果
     * <ul>
     *     <li>初始化两个栈</li>
     *     <ul>
     *         <li>数栈</li>
     *         <li>符号栈</li>
     *     </ul>
     *     <li>思路</li>
     *     <ol>
     *         <li>通过一个index值(索引)，来遍历表达式</li>
     *         <li>如果我们发现是一个数字，就压入数栈</li>
     *         <li>如果是符号，分如下两种情况：</li>
     *         <ol>
     *             <li>如果当前符号栈为空，直接入栈</li>
     *             <li>
     *                 如果符号栈不为空，就进行比较，如果当前的操作符的优先级小于或者等于栈中的操作符，
     *                 就需要从数栈中pop出两个数，在从符号栈中pop出一个符号，进行运算，将得到结果，压入数栈，
     *                 然后将当前的操作符压入符号栈，如果当前的操作符的优先级大于栈中的操作符，直接压入符号栈。
     *             </li>
     *         </ol>
     *         <li>当表达式扫描完毕，就顺序地从两个栈中pop出相应的数和符号并运行</li>
     *         <li>最后在数栈中只有一个数字，就是表达式的结果</li>
     *     </ol>
     * </ul>
     */
    public static void calculator(String expression) {
        System.out.println(expression.length());
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

        }
//        peek();
    }

}


package cn.allwayz.DataStructures.Stack;

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
 *
 * @author allwayz
 */
public class Calculator {
    public static void main(String[] args) {
        String expression = "70+10*6-2";
        MyArrayStack numberStack = new MyArrayStack(10);
        MyArrayStack operatorStack = new MyArrayStack(10);
        int offsetValue = -1;
        int num1, num2, operator, res;
        char ch;
        for (int i = 0; i < expression.length(); i++) {
            if (i < offsetValue) {
                continue;
            }
            ch = expression.charAt(i);
            if (operatorStack.isOperator(ch)) {
                if (operatorStack.isEmpty()) {
                    operatorStack.push(ch);
                } else {
                    if (operatorStack.priority(ch) <= operatorStack.priority(operatorStack.peek())) {
                        num1 = numberStack.pop();
                        num2 = numberStack.pop();
                        operator = operatorStack.pop();
                        res = numberStack.cal(num1, num2, operator);
                        numberStack.push(res);
                        operatorStack.push(ch);
                    } else {
                        operatorStack.push(ch);
                    }
                }
            } else {
                if (i == expression.length() - 1) {
                    numberStack.push(Integer.parseInt(String.valueOf(ch)));
                } else {
                    StringBuilder joinString = new StringBuilder();
                    int offsetCount = 0;
                    char tempChar = expression.charAt(i + offsetCount);
                    while (!operatorStack.isOperator(tempChar)) {
                        joinString.append(tempChar);
                        offsetCount++;
                        tempChar = expression.charAt(i + offsetCount);
                    }
                    offsetValue = i + offsetCount;
                    numberStack.push(Integer.parseInt(joinString.toString()));
                }
            }
        }
        while (!operatorStack.isEmpty()) {
            res = numberStack.cal(numberStack.pop(), numberStack.pop(), operatorStack.pop());
            numberStack.push(res);
        }
        numberStack.list();
    }
}

class MyArrayStack {
    private int maxSize;
    private int[] stack;
    private int top = -1;

    public MyArrayStack(int maxSize) {
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

    public int priority(int operator) {
        if (operator == '*' || operator == '/') {
            return 1;
        } else if (operator == '+' || operator == '-') {
            return 0;
        } else {
            return -1;
        }
    }

    public boolean isOperator(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    public int cal(int num1, int num2, int operator) {
        int res = 0;
        switch (operator) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num2 - num1;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num2 / num1;
                break;
            default:
        }
        return res;
    }

    public int peek() {
        System.out.printf("stack[%d]=%d\n", top, stack[top]);
        return stack[top];
    }
}

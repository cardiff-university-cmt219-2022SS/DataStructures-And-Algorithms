package cn.allwayz.DataStructures.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * <ul>
 *     <li>前缀表达式(波兰表达式)</li>
 *     <ul>
 *         <li>前缀表达式的运算符位于操作数之前</li>
 *         <li>例子：(3+4)*5-6对应前缀表达式为：- * + 3 4 5 6</li>
 *         <li>
 *             计算过程：从右至左扫描表达式，遇到数字时，将数字压入堆栈，遇到运算符时，弹出栈顶的两个数，
 *             用运算符对它们做相应的计算（栈顶元素和次顶元素），并将结果入栈；重复上述过程直到表达式最左端，
 *             最后运算得出的值即为表达式的结果
 *         </li>
 *     </ul>
 *     <li>中缀表达式</li>
 *     <ul>
 *         <li>就是最普通的人用的表达式</li>
 *         <li>对于计算机来说，需要判断运算符号的优先级，所以往往会转成其他表达式来操作</li>
 *     </ul>
 *     <li>后缀表达式(逆波兰表达式)</li>
 *     <ul>
 *         <li>运算符位于操作数之后</li>
 *         <li>(3+4)*5-6 转换为后缀表达式为：3 4 + 5 * 6 - </li>
 *         <li>
 *             计算过程：从左至右扫描表达式，遇到数字时，将数字压入堆栈，遇到运算符时，弹出栈顶的两个数，
 *             用运算符对它们做相应的计算（次顶元素和栈顶元素），并将结果入栈；重复上述过程直到表达式最右端，
 *             最后运算得出的值即为表达式的结果
 *         </li>
 *         <ol>
 *             <li>从左至右扫描，将3和4压入堆栈；</li>
 *             <li>遇到 + 运算符，因此弹出4和3（4为栈顶元素，3为次顶元素），计算出3+4的值，得7，再将7入栈；</li>
 *             <li>将5入栈；</li>
 *             <li>接下来是×运算符，因此弹出5和7，计算出7×5=35，将35入栈：将6入栈；</li>
 *             <li>最后是-运算符，计算出35-6的值，即29，由此得出最终结果。</li>
 *         </ol>
 *     </ul>
 * </ul>
 *
 * @author allwayz
 */
public class ReversePolandExpression {
    public static void main(String[] args) {
        // 3 4 + 5 * 6 -
        String expression = "1+((2+3)*4)-5";
        calculator(parseSuffixExpression(expression));
    }

    /**
     * 将后缀表达式放入到一个list中
     *
     * @param suffixExpression
     * @return
     */
    public static List<String> getListString(String suffixExpression) {
        String[] split = suffixExpression.split(" ");
        List<String> list = new ArrayList<>();
        for (String element : split) {
            list.add(element);
        }
        return list;
    }

    /**
     * 将中缀表达式转换成后缀表达式
     * <p>思路</p>
     * <ol>
     *     <li>初始化两个栈：运算符栈(s1)和存储中间结果的栈(s2)</li>
     *     <li>从左至右扫描中缀表达式</li>
     *     <li>遇到操作数时，压入s2</li>
     *     <li>遇到运算符时，比较与s1栈顶运算符的优先级</li>
     *     <ol>
     *         <li>如果s1为空，或栈顶的运算符为左括号'('，直接将此运算符压入栈中</li>
     *         <li>否则，若优先级比栈顶的运算符搞，也直接压入栈中</li>
     *         <li>否则将s1栈顶弹出并压入到s2中，再次转到4.1，与s1中新的栈顶运算符相比较</li>
     *     </ol>
     *     <li>遇到括号时</li>
     *     <ol>
     *         <li>如果是左括号'('，直接压入s1</li>
     *         <li>如果是右括号')'，一次弹出s1栈顶的运算符，并压入s2，直到遇到左括号位置。此时将这对括号丢弃</li>
     *     </ol>
     *     <li>重复2-5步骤，知道表达式结束</li>
     *     <li>一次弹出s2中的元素。结果的逆序极为中缀表达式对应的后缀表达式</li>
     * </ol>
     *
     * @param infixExpression
     * @return
     */
    public static List<String> parseSuffixExpression(String infixExpression) {
        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();
        List<String> suffixExpressionList = new ArrayList<>();

        for (int i = 0; i < infixExpression.length(); i++) {
            char ch = infixExpression.charAt(i);
            if (!isOperator(ch)) {
                if (ch == '(') {
                    s1.push(String.valueOf(ch));
                } else if (ch == ')') {
                    while (!s1.peek().equals("(")) {
                        s2.push(s1.pop());
                    }
                    s1.pop();
                } else {
                    s2.push(String.valueOf(ch));
                }
            } else {
                if (s1.isEmpty() || s1.peek().equals("(")) {
                    s1.push(String.valueOf(ch));
                } else if (priority(ch) > priority(s1.peek().charAt(0))) {
                    s1.push(String.valueOf(ch));
                } else if (priority(ch) == priority(s1.peek().charAt(0))) {
                    s2.push(s1.pop());
                    s1.push(String.valueOf(ch));
                }
            }
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        while (!s2.isEmpty()) {
            suffixExpressionList.add(s2.pop());
        }
        Collections.reverse(suffixExpressionList);
        return suffixExpressionList;
    }

    public static boolean isOperator(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    public static int priority(char operator) {
        if (operator == '*' || operator == '/') {
            return 1;
        } else if (operator == '+' || operator == '-') {
            return 0;
        } else {
            return -1;
        }
    }

    public static int calculator(List<String> list) {
        Stack<String> stack = new Stack<>();
        for (String item : list) {
            // 使用正则表达式来取出数
            if (item.matches("\\d+")) {
                stack.push(item);
            } else {
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if (item.equals("+")) {
                    res = num1 + num2;
                } else if (item.equals("-")) {
                    res = num1 - num2;
                } else if (item.equals("*")) {
                    res = num1 * num2;
                } else if (item.equals("/")) {
                    res = num1 / num2;
                } else {
                    throw new RuntimeException("OperatorError");
                }
                stack.push(String.valueOf(res));
            }

        }
        System.out.println(stack.peek());
        return Integer.parseInt(stack.peek());
    }
}

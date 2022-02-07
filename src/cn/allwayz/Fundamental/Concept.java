package cn.allwayz.Fundamental;

import java.util.HashMap;
import java.util.Map;

/**
 * Java 基础:
 * <ul>
 *     <li>数据类型：</li>
 *     <ul>
 *         <li>基本数据类型(primitive type)</li>
 *         <ul>
 *             <li>数值型  (整数类型[byte(-128~127), short, int, long] 浮点类型[float, double])</li>
 *             <li>字符型  (char)</li>
 *             <li>布尔型  (boolean)</li>
 *         </ul>
 *     </ul>
 *     <li>引用数据类型(reference type)</li>
 *     <ul>
 *         <li>类     (class)</li>
 *         <li>接口   (interface)</li>
 *         <li>数组   ([])</li>
 *     </ul>
 * <p>
 * 数据结构：
 *  <table>
 *      <tr>
 *          <td>基础:</td>
 *          <td>int, double, Boolean</td>
 *      </tr>
 *      <tr>
 *          <td>Collections:</td>
 *          <td>Array,List,LinkedList,Table,HashTable,HashMap,Map</td>
 *      </tr>
 *  </table>
 *  <br>
 * <p>
 * Java 高级
 *      <ol>
 *          <li>关键字: Atomic，Volatile</li>
 *          <li>多线程</li>
 *          <li>锁</li>
 *          <li>堆，栈</li>
 *      </ol>
 * </ul>
 *
 * @author allwayz
 */
public class Concept {
    /**
     * <b>1. Use of Identifier</b>
     * <hr>
     * <b>标识符：凡是自已可以起名字的地方都叫标识符</b>
     * <ul>
     *     <li>类名、变量名、方法名、接口名、包名</li>
     *     <li>class name,variable name, method name, interface name and package name</li>
     * </ul>
     *
     * <b>2. Rule of identifier naming</b>
     * <ul>
     *     <li>由26个英文字母大小写，0-9，或$组成</li>
     *     <li>数字不可以开头</li>
     *     <li>不可以使用关键字和保留字，但能包含关键字和保留字</li>
     *     <li>Java中严格区分大小写，长度无限制</li>
     *     <li>标识符不能包含空格</li>
     * </ul>
     *
     * <b>3. Guide of Naming in Java</b>
     * <ul>
     *     <li>包名：多单词组成时所有字母都小写：xxxyyyzzz</li>
     *     <li>类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz</li>
     *     <li>变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz</li>
     *     <li>常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ</li>
     *
     * </ul>
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            res[0] = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[1] = j;
                    break;
                }
            }
            if (res[1] != 0){
                break;
            }
        }

        System.out.println(res[0] +""+ res[1]);
    }
}

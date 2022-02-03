package cn.allwayz.Algorithm.search;

import java.util.Arrays;

/**
 * @author allwayz
 * @create 2022-02-02 23:36
 */
public class FibonacciSearchDemo {
    public static int maxSize = 20;

    public static void main(String[] args) {

        int[] array = {1, 8, 10, 89, 1000, 1234};
        System.out.println(fibonacciSearch(array, 8));
    }

    /**
     * 斐波那契查找原理与前两种相似，仅仅改变了midIndex<br>
     * midIndex不再通过中间或差值得到，而是位于黄金分割点附近<br>
     * 公式为：midIndex = leftIndex + F(k - 1) - 1<br>
     * F为斐波那契数列<br>
     * <p>
     * 对F(k-1)的理解：<br>
     * (1)由斐波那契数列F[k] = F[K-1] + F[K-2]的性质可得，(F[k - 1]) = (F[k - 1] - 1) + (F[k - 2] - 1) + 1。说明，只要顺序表长度为F[k] - 1，<br>
     * 则可以讲该表分成长度为F[k-1]和F[k-2]的两段，所以midIndex为leftIndex + F(k - 1) - 1<br>
     *
     * @param findValue
     * @param array
     */
    public static int fibonacciSearch(int[] array, int findValue) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int k = 0;
        int midIndex = 0;
        int[] fibonacci = fibonacciSequence();
        while (rightIndex > fibonacci[k] - 1) {
            k++;
        }
        // 因为fibonacci[k]值可能大于array的长度，所以需要使用Arrays类，构造一个新的数组，并指向array[]
        // 不足的部分会用0填充
        int[] temp = Arrays.copyOf(array, fibonacci[k]);
        // temp = {1, 8, 10, 89, 1000, 1234, 0, 0, 0} => {1, 8, 10, 89, 1000, 1234, 1234, 1234, 1234}
        for (int i = rightIndex + 1; i < temp.length; i++) {
            temp[i] = array[rightIndex];
        }
        while (leftIndex <= rightIndex) {
            midIndex = leftIndex + fibonacci[k - 1] - 1;
            if (findValue < temp[midIndex]) {
                rightIndex = midIndex - 1;
                k--;
            } else if (findValue > temp[midIndex]) {
                leftIndex = midIndex + 1;
                k -= 2;
            } else {
                if (midIndex <= rightIndex) {
                    return midIndex;
                } else {
                    return rightIndex;
                }
            }
        }
        return -1;

    }

    public static int[] fibonacciSequence() {
        int[] fibonacci = new int[maxSize];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < maxSize; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
}

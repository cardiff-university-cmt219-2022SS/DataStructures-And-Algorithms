package cn.allwayz.Algorithm.sort;

import java.sql.Array;
import java.util.Arrays;

/**
 * 1）基数排序(radix sort)属于“分配式排序”(distribution sort)，又称“桶子法”(bucket sort)或 bin sort，
 * 它是通过值的各个位的值，将要排序的元素分配至某些“桶”中，达到排序的作用<br>
 * 2）基数排序法是属于稳定性的排序，基数排序法的是效率高的稳定性排序法<br>
 * 3）基数排序是桶排序的扩展<br>
 * 4）基数排序是1887年赫尔曼发明。 将整数按位数切割成不同的数字，然后按每个位数分别比较。<br>
 * >稳定性：比如 [2, 1(第一个), 3, 1(第二个)]
 * ->      排序后：[1(第一个), 1(第二个), 2, 3]
 * <hr>
 * 将所有待比较数值统一为同样的数位长度，数位较短的数前面补零。
 * 然后，从最低位开始，依次进行一次排序。这样从最低位排序一直到最高位排序完成以后，数列就变成一个有序序列。
 *
 * @author allwayz
 * @create 2022-01-26 04:24
 */
public class RadixSortDemo {
    public static void main(String[] args) {
        int[] array = {53, 3, 542, 748, 14, 214};
        radixSort(array);
    }

    /**
     * 定义一个二维数组来表示10个桶，每个桶就是一个一维数组，为了防止OutOfBoundException(),每个桶的大小定为array.length(空间换时间)<br>
     * 定义一个一维数组，记录每个桶里实际存放了多少个数据。
     * 将数据放入对应桶
     * 从桶中一次取出数据，放回原数组<br><hr>
     *
     * 基数排序的问题：如果说排序80000000个数据，需要多少内存？<br>
     * 80000000✖11✖4➗1024➗1024➗1024=3.3GB<br>
     * 可能会报错：java.lang.OutOfMemoryError: Java heap space<br>
     * 所以基数排序是典型的空间换时间的排序。效率极高但是内存占用大。
     *
     *
     * @param array
     * @return
     */
    public static int[] radixSort(int[] array) {
        int[][] bucket = new int[10][array.length];
        int[] bucketElementCounts = new int[10];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int times = 0; times < (max + "").length(); times++) {
            for (int i = 0; i < array.length; i++) {
                int digitOfElement = (int) (array[i] / (Math.pow(10, times)) % 10);
                //放入对应桶中
                bucket[digitOfElement][bucketElementCounts[digitOfElement]] = array[i];
                bucketElementCounts[digitOfElement]++;
            }
            int index = 0;
            for (int i = 0; i < bucketElementCounts.length; i++) {
                if (bucketElementCounts[i] != 0) {
                    for (int j = 0; j < bucketElementCounts[i]; j++) {
                        array[index++] = bucket[i][j];
                    }
                }
                bucketElementCounts[i] = 0;
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
}










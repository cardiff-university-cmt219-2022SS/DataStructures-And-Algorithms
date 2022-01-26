package cn.allwayz.Algorithm.sort;

import java.sql.Array;
import java.util.Arrays;

/**
 * 快速排序（Quicksort）是对冒泡排序的一种改进。<br>
 * 基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，<br>
 * 其中一部分的所有数据都比另外一部分的所有数据都要小，<br>
 * 然后再按此方法对这两部分数据分别进行快速排序，<br>
 * 整个排序过程可以递归进行，以此达到整个数据变成有序序列<br>
 *
 * @author allwayz
 * @create 2022-01-26 02:23
 */
public class QuickSortDemo {
    public static void main(String[] args) {
        int[] array = {-9, 78, 0, 23, -567, 70};
        quickSort(0, array.length - 1, array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * pivot 中轴
     *
     * @param left  左索引
     * @param right 右索引
     * @param array
     * @return
     */
    public static int[] quickSort(int left, int right, int[] array) {
        int l = left;
        int r = right;
        int pivot = array[(left + right) / 2];
        int temp = 0;
        //while循环让比pivot小的值放到左边，大的放到右边
        while (l < r) {
            //在pivot的左边一直找，直到找到大于等于pivot的值。
            while (array[l] < pivot) {
                l += 1;
            }
            //在pivot的左边一直找，直到找到大于等于pivot的值。
            while (array[r] > pivot) {
                r -= 1;
            }
            if (l >= r) {
                break;
            }
            temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            if (array[l] == pivot) {
                r -= 1;
            }
            if (array[r] == pivot) {
                l += 1;
            }
        }
        if (l == r) {
            l += 1;
            r -= 1;
        }
        if (left < r) {
            quickSort(left, r, array);
        }
        if (right > l) {
            quickSort(l, right, array);
        }
        return array;
    }
}

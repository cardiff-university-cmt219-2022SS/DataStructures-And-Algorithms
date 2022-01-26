package cn.allwayz.Algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序(select sorting)也是一种简单的排序方法。<br>
 * 选择排序(的基本思想是：<br>
 * 第1次从array[0] ~ array[n-1]中选取最小值，与array[0]交换，<br>
 * 第2次从array[1] ~ array[n-1]中选取最小值，与array[1]交换，<br>
 * 第3次从array[2] ~ array[n-1]中选取最小值，与array[2]交换…<br>
 * ……<br>
 * 第i次从array[i-1] ~ array[n-1]中选取最小值，与array[i-1]交换<br>
 * ……<br>
 * 第n-1次从array[n-2] ~ array[n-1]中选取最小值，与array[n-2]交换，<br>
 * 总共通过n-1次，得到一个按排序码从小到大排列的有序序列。<br>
 *
 * @author allwayz
 * @create 2022-01-24 03:44
 */
public class SelectSortDemo {
    public static void main(String[] args) {
        int[] array = {3, 9, -1, 14, -2, 5, 4, 26, 8, 23, -45, 77, 2};
        System.out.println(Arrays.toString(selectSort(array)));
    }

    /**
     * 时间复杂度为O(n<sup>2</sup>)
     * @param array
     * @return
     */
    public static int[] selectSort(int[] array) {
        int i = 0;
        while (i < array.length-1) {
            int temp = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[temp]) {
                    temp = j;
                }
            }
            if (temp!=i){
                int swap = array[i];
                array[i] = array[temp];
                array[temp] = swap;
            }
            i++;
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
}

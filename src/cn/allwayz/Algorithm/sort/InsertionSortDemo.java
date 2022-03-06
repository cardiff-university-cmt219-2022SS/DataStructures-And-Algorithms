package cn.allwayz.Algorithm.sort;

import java.io.OutputStream;
import java.util.Arrays;

/**
 * 插入式排序属于内部排序法，是对于待排序的元素以插入的方式找寻该元素的适当位置，以达到排序的目的。<br>
 * Insertion Sorting的基本思想是：<br>
 * 把n个待排序的元素看成为个有序表和一个无序表，<br>
 * 开始时有序表中只包含一个元素，无序表中包含有n-1个元素，<br>
 * 排序过程中每次从无序表中取出第一个元素，把它的排序码依次与有序表元素的排序码进行比较，<br>
 * 将它插入到有序表中的适当位置，使之成为新的有序表。<br>
 *
 * @author allwayz
 * @create 2022-01-24 04:13
 */
public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] array = {3, 9, -1, 14, -2, 5, 4, 26, 8, 23, -45, 77, 2};
        System.out.println(Arrays.toString(insertionSort(array)));
    }

    /**
     * 定义一个待插入的数，和一个下标
     * 给insertVal，找到插入的位置
     * insertIndex >= 0 保证在给insertVal找插入位置，不越界
     * insertVal < array[insertIndex]带插入的数，还没有找到插入位置
     * 就需要将array[insertIndex]后移
     *
     * @param array
     * @return
     */
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int val = array[i];
            int index = i - 1;
            while (index >= 0 && val < array[index]) {
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = val;
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
}

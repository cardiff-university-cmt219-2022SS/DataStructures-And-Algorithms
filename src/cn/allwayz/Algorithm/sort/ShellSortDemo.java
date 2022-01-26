package cn.allwayz.Algorithm.sort;

import java.util.Arrays;

/**
 * 希尔排序是希尔(Donald Shell)于1959年提出的一种排序算法。希尔排序也是种插入排序，
 * 它是简单插入排序经过改进之后的一个更高效的版本，也称为缩小增量排序(Diminishing Increment Sort)<br>
 * 希尔排序法基本思想<br>
 * 希尔排序是把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；<br>
 * 随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1时，整个文件恰被分成一组，算法终止<br>
 *
 * @author allwayz
 * @create 2022-01-24 13:14
 */
public class ShellSortDemo {
    public static void main(String[] args) {
        int[] array = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        // Arrays.toString(switchShellSort(array));
        Arrays.toString(moveShellSort(array));
    }

    /**
     * 交换法
     *
     * @param array
     * @return
     */
    public static int[] switchShellSort(int[] array) {
        int temp = 0;
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (array[j] > array[j + gap]) {
                        temp = array[j + gap];
                        array[j + gap] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }

    /**
     * 移位法:<br>
     * 从第gap个元素，逐个对其所在的组进行直接插入排序
     *
     * @param array
     * @return
     */
    public static int[] moveShellSort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int j = i;
                int temp = array[i];
                if (array[j] < array[j - gap]) {
                    while (j - gap >= 0 && temp < array[j - gap]) {
                        array[j] = array[j - gap];
                        j -= gap;
                    }
                    array[j] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
}









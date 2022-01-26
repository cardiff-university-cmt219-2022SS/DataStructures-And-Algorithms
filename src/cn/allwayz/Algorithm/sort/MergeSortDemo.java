package cn.allwayz.Algorithm.sort;

import java.util.Arrays;

/**
 * 归并排序(MERGE-SORT)是利用归并的思想实现的排序方法，<br>
 * 该算法采用经典的分治(divide-and-conquer)策略<br>
 * 分治法将问题分(divide)成一些小的问题然后递归求解，<br>
 * 而治(conquer)的阶段则将分的阶段得到的各答案"修补"['
 * 在起，即分而治之。
 *
 * @author allwayz
 * @create 2022-01-26 03:29
 */
public class MergeSortDemo {
    public static void main(String[] args) {
        int[] array = {8, 4, 5, 7, 1, 3, 6, 2};
        int[] temp = new int[array.length];
        mergeSort(array, 0, array.length - 1, temp);
        System.out.println(Arrays.toString(array));
    }

    /**
     * @param array
     * @param left
     * @param right
     * @param temp
     * @return
     */
    public static int[] mergeSort(int[] array, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid, temp);
            mergeSort(array, mid + 1, right, temp);
            merge(array,left,mid,right,temp);
        }
        return array;
    }

    /**
     * [8,4,5,7,1,3,6,2]           <br>
     * ↙         ↘              <br>
     * [8,4,5,7]     [1,3,6,2]      <br>
     * ↙    ↘         ↙   ↘        <br>
     * [8,4] [5,7]   [1,3] [6,2]     <br>
     * ↙  ↘  ↙  ↘    ↙ ↘   ↙  ↘     <br>
     * [8][4][5][7]  [1][3][6][2]    <br>
     * ↘  ↙  ↘  ↙    ↘  ↙  ↘  ↙     <br>
     * [4,8][5,7]     [1,3] [2,6]    <br>
     * ↘    ↙         ↘     ↙      <br>
     * [4,5,7,8]     [1,2,3,6]      <br>
     * ↘            ↙          <br>
     * [1,2,3,4,5,6,7,8]         <br>
     *
     * @param array 原始数组
     * @param left  左边有序序列的初始索引
     * @param mid   中间索引
     * @param right 右边索引
     * @param temp  中转数组
     * @return 返回已排序数组
     */
    public static int[] merge(int[] array, int left, int mid, int right, int[] temp) {
        //右边有序序列的初始索引
        int i = left;
        //左边有序序列的初始索引
        int j = mid + 1;
        //指向temp数组的当前索引
        int t = i;
        //(1) 先把所有两边数据按照规则填充到temp数组，直到左右两边有一边处理完成
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[t] = array[i];
                t += 1;
                i += 1;
            } else {
                temp[t] = array[j];
                t += 1;
                j += 1;
            }
        }
        //(2) 把有剩余数据的一边一次填充到temp中
        while (i <= mid) {
            temp[t] = array[i];
            i++;
            t++;
        }
        while (j <= right) {
            temp[t] = array[j];
            j++;
            t++;
        }
        //(3)  将temp数组的元素copy到array中
        int tempLeft = left;
        while (tempLeft <= right) {
            array[tempLeft] = temp[tempLeft];
            tempLeft++;
        }
        System.out.println(Arrays.toString(temp)+Arrays.toString(array));
        return array;
    }
}

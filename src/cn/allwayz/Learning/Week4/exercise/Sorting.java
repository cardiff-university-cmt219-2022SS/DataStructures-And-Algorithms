package cn.allwayz.Learning.Week4.exercise;


import java.util.Arrays;
/**
 * @author allwayz
 * @create 2022-02-19 03:46
 */
public class Sorting {
    public static void main(String[] args) {
        int[] array = {4,1,5,8,2};
        bubbleSort(array);
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int index = 0;
        int pre, next;
        for (int i = 0; i < array.length - 1; i++) {
            while (index + 1 < array.length - i) {
                pre = array[index];
                next = array[index + 1];
                if (next < pre) {
                    array[index] = next;
                    array[index + 1] = pre;
                }
                index++;
            }
            index = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}

package cn.allwayz.Learning.Week5.Exercise;

import java.util.Arrays;
import java.util.Random;
import java.util.SplittableRandom;

/**
 * @author allwayz
 * @create 2022-02-26 12:50 PM
 */
public class DeadLockDemo {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 20);
        }
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array) {
        boolean flag = true;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int index = 0;
            while (index + 1 < array.length - i) {
                int pre = array[index];
                int next = array[index + 1];
                if (next < pre) {
                    array[index] = next;
                    array[index + 1] = pre;
                    flag = false;
                }
                index++;
            }
            if (flag) {
                break;
            }
            flag = true;
            count ++;
        }
        System.out.println(Arrays.toString(array)+", "+count);
    }
}
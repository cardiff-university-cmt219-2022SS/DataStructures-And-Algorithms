package cn.allwayz.Learning.Week6;

import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.SplittableRandom;

/**
 * @author allwayz
 * @create 2022-03-10 12:14 AM
 */
public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] array = new int[7];
        SplittableRandom splittableRandom = new SplittableRandom();
        for (int i = 0; i < array.length; i++) {
            array[i] = splittableRandom.nextInt(1, 20);
        }
        System.out.println(Arrays.toString(array));
        selectionSort(array);
    }

    public static void selectionSort(int[] array) {
        int i = 0;
        while (i < array.length - 1) {
            int min = i;
            int temp;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (array[min] != array[i]) {
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}

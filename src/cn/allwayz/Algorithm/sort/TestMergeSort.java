package cn.allwayz.Algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.SplittableRandom;

/**
 * @author allwayz
 * @create 2022-03-28 4:42 PM
 */
public class TestMergeSort {
    public static void main(String[] args) {
        int initialCapacity = 800000;
        ArrayList<Integer> integers = new ArrayList<>(initialCapacity);
        int[] ints = new int[initialCapacity];
        SplittableRandom random = new SplittableRandom();
        for (int i = 0; i < initialCapacity; i++) {
            int ran = random.nextInt(0, 1000);
            ints[i] = ran;
            integers.add(ran);
        }
        long startTime = System.currentTimeMillis();
//        Collections.sort(integers);
        MergeSortDemo.mergeSort(ints, 0, ints.length - 1, new int[ints.length]);
        long endTime = System.currentTimeMillis();
        System.out.println("Process Time： " + (endTime - startTime) + "ms");
    }

}

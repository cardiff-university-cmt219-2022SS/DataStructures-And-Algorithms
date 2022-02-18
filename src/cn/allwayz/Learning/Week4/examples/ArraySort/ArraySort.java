package cn.allwayz.Learning.Week4.examples.ArraySort;

import java.util.*;

public class ArraySort {
    public static void main(String[] args) {
        int[] nums = {10, 2, -3, 1, 4};
        Arrays.sort(nums);
        for (int item : nums) {
            System.out.print(item + " ");
        }
    }
}

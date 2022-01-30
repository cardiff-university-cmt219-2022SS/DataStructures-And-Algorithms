package cn.allwayz.Algorithm.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author allwayz
 * @create 2022-01-27 12:20
 */
public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 6, 2, 6, 4, 2, 3, 6, 8, 9, 2};
        for (int i :linerSearch(array,2)) {
            System.out.println(i);
        }
    }

    /**
     * 线性查找是逐一比对，发现有相同的值时返回下标
     *
     * @param array
     * @param value
     * @return
     */
    public static List<Integer> linerSearch(int[] array, int value) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                res.add(i);
            }
        }
        return res;
    }

}

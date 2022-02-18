package cn.allwayz.Learning.Week4.examples.CollectionSort;

import java.util.*;

public class CollectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(2);
        list.add(-3);
        list.add(1);
        list.add(4);
        Collections.sort(list);
        System.out.println(list);
    }
}

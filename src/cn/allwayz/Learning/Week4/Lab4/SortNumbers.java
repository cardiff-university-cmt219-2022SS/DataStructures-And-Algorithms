package cn.allwayz.Learning.Week4.Lab4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author allwayz
 * @create 2022-02-18 18:08
 */
public class SortNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(
                "/Users/allwayz/Documents/git/DataStructures-And-Algorithms/src/cn/allwayz/Learning/Week4/Lab4/marks"
        ));
        String str;
        ArrayList<Integer> ints = new ArrayList<>();
        while ((str = in.readLine()) != null){
            ints.add(Integer.parseInt(str));
        }
        ints.sort(Comparator.naturalOrder());
        System.out.println(ints);
    }
}

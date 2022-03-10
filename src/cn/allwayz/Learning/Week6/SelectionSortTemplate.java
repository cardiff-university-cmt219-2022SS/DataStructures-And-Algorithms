package cn.allwayz.Learning.Week6;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * @author allwayz
 * @create 2022-03-10 12:02 AM
 */
public class SelectionSortTemplate {
    public static void main(String args[]) {

        // Create an ArrayList to store words
        List<String> list = new ArrayList<String>();

        // We have a string, and can split this string to get the individual words
        String test = "this is a test string";
        String[] splitTest = test.split("\\s+");
        System.out.println(Arrays.toString(splitTest));
        // We add the individual words to the ArrayList
        for (String a : splitTest) {
            list.add(a);
        }

        // Run the sort
        SelectionSortTemplate.runSort(list, list.size());
    }

    public static void runSort(List<String> list, int n) {
        // Selection sort code goes here
        for (int i = 0; i < n - 2; i++) {
            list.get(1);
        }
    }

}
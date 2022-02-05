package cn.allwayz.Learning.Week3.exercise_a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author allwayz
 * @create 2022-02-04 23:03
 */
public class FindDemo {
    public static void main(String[] args) {
        String k = args[1];
        String keyWord = "Godfather";
        try {
            BufferedReader in = new BufferedReader(new FileReader("/Users/allwayz/Documents/git/DataStructures-And-Algorithms/src/cn/allwayz/Learning/Week3/exercise_a/exercises3a_code/bestpicturefilms.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                if (str.contains(keyWord)) {
                    System.out.println(str);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

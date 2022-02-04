package cn.allwayz.Learning.Week3.exercise_a;

import java.io.FileReader;
import java.io.IOException;

/**
 * TODO:
 * @author allwayz
 * @create 2022-02-04 23:34
 */
public class CharReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/allwayz/Documents/git/DataStructures-And-Algorithms/src/cn/allwayz/Learning/Week3/exercise_a/exercises3a_code/alphabet.txt");
        char ch= (char) fileReader.read();
        System.out.println(ch);
    }
}

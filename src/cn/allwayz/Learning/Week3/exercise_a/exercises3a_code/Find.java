package cn.allwayz.Learning.Week3.exercise_a.exercises3a_code;
import java.util.Scanner;
import java.io.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author allwayz
 * @create 2022-03-06 4:26 PM
 */

public class Find{
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(new File("/Users/allwayz/Documents/git/DataStructures-And-Algorithms/src/cn/allwayz/Learning/Week3/exercise_a/exercises3a_code/"+args[args.length-1]));
        String s;
        String keyword = args[0];
        while (scanner.hasNextLine()) {
            s = scanner.nextLine();
            if ("-i".equals(args[0])){
                keyword = args[1].trim().toLowerCase();
                s = s.toLowerCase();
            }
            if (s.contains(keyword)){
                System.out.println(s);
            }
        }
    }
}

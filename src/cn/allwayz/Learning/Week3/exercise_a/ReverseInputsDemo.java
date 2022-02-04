package cn.allwayz.Learning.Week3.exercise_a;

import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author allwayz
 * @create 2022-02-04 22:21
 */
public class ReverseInputsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEASE ENTER TEXT. ENTER A BLANK LINE WHEN YOU ARE FINISHED:");

        Vector<String> vector = new Vector<>();
        String tempLine = scanner.nextLine();
        while (!Objects.equals(tempLine, "")) {
            vector.add(tempLine);
            tempLine = scanner.nextLine();
        }
        String res = "";
        for (String s : vector) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(s);
            res += stringBuilder.reverse() + "\n";
            stringBuilder.delete(0, stringBuilder.length());
        }
        System.out.printf("YOUR INPUT REVERSED: \n%s", res);
    }
}

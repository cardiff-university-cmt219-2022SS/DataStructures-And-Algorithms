package cn.allwayz.Learning.Week4.examples.Factorial;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Factorial {
    // main method
    public static void main(String[] args)
            throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print(
                "Please enter a number: ");
        String inputLine = reader.readLine();
        int n = Integer.parseInt(inputLine);
        System.out.println(n + "! = "
                + factorial(n));
        System.exit(0);
    }

    // calculation of the factorial of a number
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            long result = 1;
            int i;
            for (i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        }
    }
}

package cn.allwayz.Learning.Week4.exercise;

import java.util.Random;

/**
 * @author allwayz
 * @create 2022-02-19 03:46
 */
public class Mathematical {
    public static void main(String[] args) {
        System.out.println(factorials(20));
    }

    public static void randomDemo() {
        Random random = new Random();
        random.nextInt();
        random.nextDouble();
    }

    public static void powerAndSqrt() {
        Math.pow(2, 5);
        Math.sqrt(49);
    }

    public static long factorials(int n) {
        System.out.println(n);
        if (n == 0) {
            return 1;
        }
        return n * factorials(n - 1);
    }
}

package cn.allwayz.Learning.Week4.Lab4;

import java.util.Random;

/**
 * @author allwayz
 * @create 2022-02-18 17:18
 */
public class Section1 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            random = new Random();
            int j = (random.nextInt(6 - 3) + 1) + 3;
            System.out.println(j);
        }
        System.out.println("=====================");
        for (int i = 0; i < 20; i++) {
            double j = (random.nextInt(7 - 4) + 1) + 4 + random.nextDouble();
            System.out.println(j);
        }
    }
}

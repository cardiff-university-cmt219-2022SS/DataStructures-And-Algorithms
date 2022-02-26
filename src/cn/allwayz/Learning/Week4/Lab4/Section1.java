package cn.allwayz.Learning.Week4.Lab4;

import java.util.SplittableRandom;

/**
 * @author allwayz
 * @create 2022-02-18 17:18
 */
public class Section1 {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        for (int i = 0; i < 16; i++) {
            random = new SplittableRandom();
            int j = (random.nextInt(7 - 3) + 1) + 2;
//            int j = random.nextInt(3,6);
            System.out.println(j);
        }
        System.out.println("=====================");
        for (int i = 0; i < 20; i++) {
            double j = (random.nextInt(7 - 4) + 1) + 4 + random.nextDouble();
            System.out.println(j);
        }
    }
}

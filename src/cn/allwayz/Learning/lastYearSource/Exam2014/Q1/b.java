package cn.allwayz.Learning.lastYearSource.Exam2014.Q1;

import java.util.Random;

/**
 * @author allwayz
 * @create 2022-03-02 22:47
 */
public class b {
    public static void main(String[] args) {
        // ii.
        Random random = new Random();
        double[] doubles = new double[100];
        for (int i = 0; i < 100; i++) {
            doubles[i] = random.nextDouble();
        }
    }
}

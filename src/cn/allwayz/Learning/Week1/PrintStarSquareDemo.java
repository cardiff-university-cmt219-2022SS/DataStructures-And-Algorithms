package cn.allwayz.Learning.Week1;

/**
 * @author allwayz
 * @create 2022-02-03 10:11 AM
 */
public class PrintStarSquareDemo {
    public static void main(String[] args) {
        int[][] starArray = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

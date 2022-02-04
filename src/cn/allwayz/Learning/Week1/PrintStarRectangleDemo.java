package cn.allwayz.Learning.Week1;

import java.util.Scanner;

/**
 * @author allwayz
 * @create 2022-02-03 10:15 AM
 */
public class PrintStarRectangleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter high: ");
        int high = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();

        for (int i = 0; i < high; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

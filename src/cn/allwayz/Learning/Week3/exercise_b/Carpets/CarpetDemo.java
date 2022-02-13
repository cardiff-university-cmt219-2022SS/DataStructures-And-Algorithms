package cn.allwayz.Learning.Week3.exercise_b.Carpets;

import java.util.Scanner;

/**
 * @author allwayz
 * @create 2022-02-13 11:48
 */
public class CarpetDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input Length, Width and Price");
            RoomCarpet roomCarpet = new RoomCarpet(new RoomDimension(scanner.nextDouble(), scanner.nextDouble()), scanner.nextDouble());
            System.out.println(roomCarpet.getTotalCost());
        }
    }
}

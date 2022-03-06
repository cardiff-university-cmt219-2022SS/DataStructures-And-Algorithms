package cn.allwayz.Learning.Week5.Lab5.Buffer;

import java.util.Scanner;

/**
 * @author allwayz
 * @create 2022-02-25 21:04
 */
public class BufferDemo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            switch (key) {
                case "put":
                    int value = scanner.nextInt();
                    buffer.put(value);
                    break;
                case "get":
                    buffer.get();
                    break;
                case "show":
                    buffer.showBuffer();
                    break;
                case "quit":
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}



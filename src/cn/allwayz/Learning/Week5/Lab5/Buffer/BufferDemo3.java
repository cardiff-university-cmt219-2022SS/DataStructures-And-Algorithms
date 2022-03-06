package cn.allwayz.Learning.Week5.Lab5.Buffer;

import java.util.Random;
import java.util.SplittableRandom;

/**
 * @author allwayz
 * @create 2022-03-06 6:23 PM
 */
public class BufferDemo3 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(10);
        SplittableRandom random = new SplittableRandom();
        for (int i = 0; i < 100; i++) {
            Thread producer = new Thread("producer") {
                @Override
                public void run() {
                    buffer.put(random.nextInt(0, 9));
                }
            };
            Thread consumer = new Thread("Consumer") {
                @Override
                public void run() {
                    buffer.get();
                }
            };
            Thread consumer2 = new Thread("Consumer") {
                @Override
                public void run() {
                    buffer.get();
                }
            };
            producer.start();
            consumer.start();
            consumer2.start();
        }
    }
}

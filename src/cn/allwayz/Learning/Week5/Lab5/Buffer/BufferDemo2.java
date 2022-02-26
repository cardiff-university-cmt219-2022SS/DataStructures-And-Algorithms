package cn.allwayz.Learning.Week5.Lab5.Buffer;

import java.beans.Customizer;
import java.util.SplittableRandom;

/**
 * @author allwayz
 * @create 2022-02-26 02:27
 */
public class BufferDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer(10);
        SplittableRandom splittableRandom = new SplittableRandom();
        Producer producer = new Producer(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    buffer.put(i+1);
                    try {
                        sleep(splittableRandom.nextInt(50,150));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Consumer consumer = new Consumer(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    buffer.get();
                    try {
                        sleep(splittableRandom.nextInt(50,150));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        producer.start();
        consumer.start();
        while (Thread.activeCount() > 2){
            Thread.yield();
        }
        buffer.showBuffer();
    }
}

class Producer extends Thread{

}

class Consumer extends Thread{

}


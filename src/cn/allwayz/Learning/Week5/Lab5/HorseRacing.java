package cn.allwayz.Learning.Week5.Lab5;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.SplittableRandom;

/**
 * @author allwayz
 * @create 2022-02-25 20:24
 */
public class HorseRacing {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Start");
        for (int i = 0; i < 10; i++) {
            Horse horse = new Horse(i);
            horse.start();
        }
        while (Thread.activeCount() > 2){
            Thread.yield();
        }
        System.out.println("End");

    }
}

class Horse extends Thread {
    static int AIM = 1000;
    private int Id;
    private int distance;

    public Horse(int Id) {
        this.Id = Id;
        this.distance = 0;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        SplittableRandom random = new SplittableRandom();
        try {
            while (this.distance < AIM) {
                distance += random.nextInt(1, 6);
                sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.Id);
    }
}

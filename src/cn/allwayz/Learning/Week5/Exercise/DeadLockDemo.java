package cn.allwayz.Learning.Week5.Exercise;

import java.util.ArrayList;
import java.util.SplittableRandom;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

import static java.lang.Thread.sleep;

/**
 * @author allwayz
 * @create 2022-02-26 12:50 PM
 */
public class DeadLockDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    SplittableRandom random = new SplittableRandom();
                    arrayList.add(random.nextInt(1, 9));
                    try {
                        sleep(random.nextLong(600, 900));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                }
            };
            thread.start();
            System.out.println(arrayList.toString());
        }
    }
}

//class MyThread extends Thread {
//
//    public MyThread(Object o) {
//    }
//
//    @Override
//    public void run() {
//
//    }
//
//    public void run(ArrayList<Integer> arrayList) throws InterruptedException {
//
//    }
//}
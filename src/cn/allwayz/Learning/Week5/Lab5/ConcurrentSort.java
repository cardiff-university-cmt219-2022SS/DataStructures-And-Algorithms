package cn.allwayz.Learning.Week5.Lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author allwayz
 * @create 2022-02-26 11:12
 */
public class ConcurrentSort {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }

        long startTime = System.currentTimeMillis();
//        bubbleSort(array);
//        halvedBubbleSort(array);
//        concurrentBubbleSort(array);
        concurrentBubbleSortByThreadPool(array, 8);
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Process Time： " + (endTime - startTime) + "ms");
//        System.out.println(Arrays.toString(array));

    }

    public static void bubbleSort(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            int index = 0;
            while (index < array.length - 1) {
                int pre = array[index];
                int next = array[index + 1];
                if (next < pre) {
                    array[index] = next;
                    array[index + 1] = pre;
                    flag = false;
                }
                index++;
            }
            if (flag) {
                break;
            }
            flag = true;
        }
//        System.out.println(Arrays.toString(array));
    }

    public static void halvedBubbleSort(int[] array) {
        int midIndex = array.length / 2;
        bubbleSort(Arrays.copyOfRange(array, 0, midIndex));
        bubbleSort(Arrays.copyOfRange(array, midIndex, array.length - 1));
    }

    public static void concurrentBubbleSort(int[] array) {
        int midIndex = array.length / 2;
        Thread t1 = new Thread(() -> {
            bubbleSort(Arrays.copyOfRange(array, 0, midIndex));
        });
        Thread t2 = new Thread(() -> {
            bubbleSort(Arrays.copyOfRange(array, midIndex, array.length - 1));
        });

        t1.start();
        t2.start();
    }

    public static void concurrentBubbleSortByThreadPool(int[] array, int maxThread) {
        ExecutorService threadPool = new ThreadPoolExecutor(2, maxThread, 1L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        int splitSize = array.length / maxThread;
        ArrayList<int[]> arrayList = new ArrayList<>();
        for (int i = 0; i < maxThread; i++) {
            int[] arr = Arrays.copyOfRange(array, splitSize * i, (i == maxThread - 1) ? array.length : splitSize * (i + 1));
            arrayList.add(arr);
        }

        try {
            for (int i = 0; i < maxThread; i++) {
                int finalI = i;
                threadPool.execute(() -> {
                    bubbleSort(arrayList.get(finalI));
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}

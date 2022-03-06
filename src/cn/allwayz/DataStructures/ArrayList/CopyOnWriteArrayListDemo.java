package cn.allwayz.DataStructures.ArrayList;

import java.util.Arrays;

/**
 * @author allwayz
 * @create 2022-03-06 6:37 PM
 */
public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < 20; i++) {
            int finalI = i;
            Thread thread = new Thread(){
                @Override
                public void run(){
                    copyOnWriteArrayList.add(finalI);
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            thread.start();
        }
        while (Thread.activeCount() <= 2){
            Thread.yield();
        }
        System.out.println(Arrays.toString(copyOnWriteArrayList.getArray()));
    }
}

class CopyOnWriteArrayList {
    final Object lock = new Object();
    private transient volatile Object[] array;

    final Object[] getArray() {
        return array;
    }

    final void setArray(Object[] array) {
        this.array = array;
    }

    public void add(Object o) {
        synchronized (lock) {
            Object[] es = getArray();
            int len;
            if (es == null) {
                es = new Object[1];
                es[0] = o;
                setArray(es);
            } else {
                len = es.length;
                es = Arrays.copyOf(es, len + 1);
                es[len] = o;
                setArray(es);
            }

        }
    }

    public Object get(int index) {
        try {
            Object entry = array[index];
            return entry;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("OutOfBounds");
            return e;
        }
    }
}

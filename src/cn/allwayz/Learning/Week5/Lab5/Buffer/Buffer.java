package cn.allwayz.Learning.Week5.Lab5.Buffer;

import static java.lang.Thread.sleep;

/**
 * @author allwayz
 * @create 2022-02-26 01:05
 */
public class Buffer {
    private int BUFFER_SIZE;
    private int head;
    private int rear;
    private int[] array;

    public Buffer(int BUFFER_SIZE) {
        this.BUFFER_SIZE = BUFFER_SIZE;
        this.array = new int[BUFFER_SIZE];
        this.head = 0;
        this.rear = 0;
    }

    public boolean isEmpty() {
        return head == rear;
    }

    public boolean isFull() {
        return (rear + 1) % BUFFER_SIZE == head;
    }

    public void get() {
        if (isEmpty()) {
            System.out.println("Empty Buffer");
        } else {
            int res = array[head];
            array[head] = 0;
            head = (head + 1) % BUFFER_SIZE;
            System.out.println(res);
        }
    }

    public void put(int value) {
        if (isFull()) {
            System.out.println("Full Buffer");
        } else {
            array[rear] = value;
            rear = (rear + 1) % BUFFER_SIZE;
        }
    }

    public synchronized void showBuffer() {
        if (isEmpty()) {
            System.out.println("Empty Buffer");
        } else {
            System.out.println("--------------------------------------------------------------------");
            int max = head > rear ? BUFFER_SIZE + rear : rear;
            for (int i = head; i < max; i++) {
                System.out.printf("[%d]: %d\t\t", i % BUFFER_SIZE, array[i % BUFFER_SIZE]);
            }
            System.out.print(head + "->" + rear);
            System.out.println("\n--------------------------------------------------------------------");
        }
    }
}

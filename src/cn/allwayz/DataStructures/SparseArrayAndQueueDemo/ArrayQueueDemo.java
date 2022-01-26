package cn.allwayz.DataStructures.SparseArrayAndQueueDemo;

/**
 * @author allwayz
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);

    }
}

class ArrayQueue {
    /**
     * 表示数组的最大容量
     */
    private int maxSize;
    /**
     * 队列头
     */
    private int front;
    /**
     * 队列尾
     */
    private int rear;
    /**
     * 用于存放数据，模拟队列
     */
    private int[] arr;

    /**
     * front指向队列头，当还没有向队列中添加数据时，front是指向队列头的前一个位置
     * rear指向队列尾部，即队列的最后一个数据
     *
     * @param arrMaxSize
     */
    public ArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        front = -1;
        rear = -1;
        arr = new int[maxSize];
    }

    /**
     * 判断队列是否已满
     * @return
     */
    public Boolean isFull() {
        return rear == maxSize - 1;
    }

    /**
     * 判断队列是否为空
     * @return
     */
    public Boolean isEmpty() {
        return rear == front;
    }

    /**
     * 加入数据
     * @param data
     */
    public void addQueue(int data) {
        if (isFull()) {
            System.out.println("Queue Is Full, Cant Add Data");
            return;
        }
        rear++;
        arr[rear] = data;
        return;
    }

    /**
     * 弹出队列
     * @return
     */
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("No Element in Queue");
        }
        front++;
        return arr[front];
    }

    /**
     * 显示队列
     */
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("Empty Queue!");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }

    /**
     * 查看队列头
     * @return
     */
    public int peekHead() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Queue!");
        }
        return arr[front + 1];
    }
}

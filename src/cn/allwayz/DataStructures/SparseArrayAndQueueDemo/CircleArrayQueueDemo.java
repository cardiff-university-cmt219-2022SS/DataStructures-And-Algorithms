package cn.allwayz.DataStructures.SparseArrayAndQueueDemo;

/**
 * @author allwayz
 */
public class CircleArrayQueueDemo {
    public static void main(String[] args) {

    }
}

class CircleArrayQueue {
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
    public CircleArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = 0;
        rear = 0;
    }

    /**
     * 判断队列是否已满
     *
     * @return
     */
    public Boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    /**
     * 判断队列是否为空
     *
     * @return
     */
    public Boolean isEmpty() {
        return rear == front;
    }

    /**
     * 加入数据
     *
     * @param data
     */
    public void addQueue(int data) {
        if (isFull()) {
            System.out.println("Queue Is Full, Cant Add Data");
            return;
        }
        arr[rear] = data;
        rear = (rear + 1) % maxSize;
        return;
    }

    /**
     * 弹出队列
     *
     * @return
     */
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("No Element in Queue");
        }
        /*
        分析出front是指向队列的第一个元素
            - 把front对应的值保留到一个临时变量
            - 将front后移
            - 将临时保存的变量返回
         */
        int temp = arr[front];
        front = (front+1) % maxSize;
        return temp;
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
     *
     * @return
     */
    public int peekHead() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Queue!");
        }
        return arr[front + 1];
    }
}


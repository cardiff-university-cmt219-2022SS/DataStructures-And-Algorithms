package cn.allwayz.Algorithm.sort;

/**
 * 冒泡排序(Bubble Sorting)的基本思想是：通过对待排序序列从前向后（从下标较小的元素开始），依次比较相元素的值，若发现逆序则交换，使值较大
 * 的元素逐渐从前移向后部，就象水底下的气泡一样逐渐向上冒。<br>
 * <p>
 * 因为排序的过程中，各元素不断接近自己的位置，如果一趟比较下来没有进行过交换，就说明序列有序，因此要在排序过程中设置个标志flag判断元素是否进行过交换。从而减少不必要的比较。
 *
 * @author allwayz
 * @create 2022-01-24 02:57
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] array = {3, 9, -1, 10, -2};
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int)(Math.random() * 80000);
        }
        long startTime = System.currentTimeMillis();
        bubbleSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Process Time： " + (endTime - startTime) + "ms");
    }

    /**
     * (1) 一共进行数组的大小-1次大的循环<br>
     * (2) 每排序的次数在逐渐的减少。 <br>
     * (3) 如果发现在某趟排序中一次交换都没有发生，可以提前结束冒泡排序（优化）<br>
     * 时间复杂度为O(n<sup>2</sup>)<br>
     *
     * @param array
     */
    public static void bubbleSort(int[] array) {
        int pre;
        int next;
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < array.length - 1; i++) {
            while (index + 1 < array.length - i) {
                pre = array[index];
                next = array[index + 1];
                if (next < pre) {
                    array[index] = next;
                    array[index + 1] = pre;
                    flag = true;
                }
//                每排完一次，打印结果看一下
//                System.out.println(Arrays.toString(array));
                index++;
            }
            if (!flag) {
                break;
            }
            index = 0;
            flag = false;
        }
    }
}

package cn.allwayz.Algorithm.search;

/**
 * @author allwayz
 * @create 2022-01-30 12:04
 */
public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(binarySearch(0, array.length - 1, 1, array));
    }

    /**
     * 二分查找(Binary Search)只能在有序列表中执行，如果是无序数组，要先排序再查找<br>
     * 思路分析：
     * 1、首先确定数组的中间下标，mid = (leftIndex + rightIndex) / 2
     * 2、然后让需要查找的数和中间下标对应的数比较
     * 2.1 如果findVal>array[mid]，说明要查找的数在mid的右边，向右递归查找
     * 2.2 如果findVal<array[mid]，说明要查找的数在mid的左边，则向左递归查找
     * 2.3 findVal=array[mid]，直接返回
     * <p>
     * 需要结束递归的条件：
     * 找到对应的数字就结束递归
     * 递归完整个数组，仍然没有找到数字，也需要结束递归。leftIndex>rightIndex
     *
     * @param leftIndex
     * @param rightIndex
     * @param findValue
     * @param array
     * @return
     */
    public static int binarySearch(int leftIndex, int rightIndex, int findValue, int[] array) {
        if (leftIndex > rightIndex) {
            return -1;
        }
        int midIndex = (leftIndex + rightIndex) / 2;
        int floatMid = leftIndex + ((rightIndex - leftIndex) * (findValue - array[leftIndex]) / (array[rightIndex] - array[leftIndex]));
        if (array[midIndex] < findValue) {
            return binarySearch(midIndex, rightIndex, findValue, array);
        } else if (array[midIndex] > findValue) {
            return binarySearch(0, midIndex, findValue, array);
        } else {
            return midIndex;
        }
    }
}

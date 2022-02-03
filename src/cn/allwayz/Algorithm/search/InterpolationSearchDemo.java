package cn.allwayz.Algorithm.search;

/**
 * @author allwayz
 * @create 2022-02-02 23:14
 */
public class InterpolationSearchDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(interpolationSearch(0, array.length - 1, 6, array));
    }

    /**
     * 对于二分查找的区别知识mid值不同<br>
     * 公式：int midIndex = leftIndex + ((rightIndex - leftIndex) * (findValue - array[leftIndex]) / (array[rightIndex] - array[leftIndex]))
     * @param array
     * @param leftIndex
     * @param rightIndex
     * @param findValue
     * @return
     */
    public static int interpolationSearch(int leftIndex, int rightIndex, int findValue, int[] array){
        if (leftIndex > rightIndex) {
            return -1;
        }
        int midIndex = leftIndex + ((rightIndex - leftIndex) * (findValue - array[leftIndex]) / (array[rightIndex] - array[leftIndex]));
        if (array[midIndex] < findValue) {
            return interpolationSearch(midIndex, rightIndex, findValue, array);
        } else if (array[midIndex] > findValue) {
            return interpolationSearch(0, midIndex, findValue, array);
        } else {
            return midIndex;
        }
    }
}

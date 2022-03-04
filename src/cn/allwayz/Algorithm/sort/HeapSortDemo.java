package cn.allwayz.Algorithm.sort;

/**
 * 堆排序<br>
 * 1）将无序序列变成一个二叉树<br>
 * 2）从最后一个非叶子结点开始（叶子结点不用调整，第一个非也自己结点：array.length/2 - 1）从左至右，从下至上进行调整。<br>
 *
 * @author allwayz
 * @create 2022-03-04 14:34
 */
public class HeapSortDemo {
    public static void main(String[] args) {
        int[] array = {2, 6, 7, 5, 9};

    }

    public static void heapSort(int[] array) {

    }

    /**
     * 将一个数组（二叉树）调整成一个大顶堆<br>
     * 将 i 对应的非叶子结点的树调整成大顶堆
     *
     * @param array  带调整的数组
     * @param i      非叶子结点在数组中的索引
     * @param length 对多少个元素进行调整
     */
    public static void adjustHeap(int[] array, int i, int length) {
        // 从数组中取出当前元素的值，保存在临时变量
        int temp = array[i];
        // k = i * 2 + 1; k是i结点的左子结点
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            // If left sub-node less then right sub-node, let k point right sub-node
            if (k + 1 < length && array[k] < array[k + 1]) {
                k++;
            }
            // If sub-node great then parent-node
            if (array[k] > temp) {
                // let the greater value equal to current node
                array[i] = array[k];
                // let i = k, and continue compare
                i = k;
            } else {
                break;
            }
        }
        array[i] = temp;
    }
}

package cn.allwayz.DataStructures.Recursion;

/**
 * 八皇后问题：<br>
 * 八皇后间题，是一个古老而著名的间题，是回溯算法的典型案例。
 * 该问题是国际西洋棋棋手马克斯贝瑟尔于1848年提出：在88格的国际象棋上摆放八个皇后，
 * 使其不能互相攻击，即：任意两个皇后都不能处于同行、同一列或同斜线上，问有多少种摆法
 * <hr>
 *
 * <ol>
 *     <li>第一个皇后先放第一行第一列</li>
 *     <li>第二个皇后放在第二行第一列、然后判断是否冲突[即不再同一行同一列和同一斜线]，如果不不冲突，继续放在</li>
 *     <li>第二列、第三列、依次把所有列都放完，找到一个合适</li>
 *     <li>继续第三个皇后，还是第一列、第二列.直到第8个皇后也能放在一个不冲突的位置，算是找到了一个正确解</li>
 *     <li>当得到一个正确解时，在栈回退到上一个栈时，就会开始回溯，即将第个皇后，放到第一列的所有正确解，全部得到</li>
 *     <li>然后回头继续第一个皇后放第二列，后面继续循环执行1，2，3，4的步骤</li>
 * </ol>
 * <p>
 * 理论上应该创建一个二维数组来表示棋盘，但是可以通过算法，用一个一维数组解决问题。<br>
 * array[8] = [1, 3, 5, 7, 2, 0, 6, 4]  使用index表示行，array[index]表示列
 *
 * @author allwayz
 * @create 2022-01-22 03:26
 */
public class EightQueensDemo {
    int max = 8;
    int[] array = new int[max];
    static int count = 0;

    public static void main(String[] args) {
        EightQueensDemo eightQueens = new EightQueensDemo();
        eightQueens.check(0);
        System.out.println(count);
    }

    /**
     * 放置第n个皇后
     *
     * @param n
     */
    private void check(int n) {
        if (n == max) {
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            //先把当前这个皇后放到该行的第一列
            array[n] = i;
            if (isConflict(n)) {
                check(n + 1);
            }
            //如果冲突，就继续执行array[n] = i; 将第n个皇后放置在本行的后移一个位置
        }
    }

    /**
     * 检查是否与前面的皇后冲突
     *
     * @param n
     * @return
     */
    private boolean isConflict(int n) {
        for (int i = 0; i < n; i++) {
            // 判断第n个皇后是否和第i个皇后在同一列，或者是否在同一斜线上
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * 将皇后摆放的位置输出
     */
    private void print() {
        count++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}

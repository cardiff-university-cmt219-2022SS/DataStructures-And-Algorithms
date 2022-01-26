package cn.allwayz.DataStructures.Recursion;

/**
 * 递归需要遵守的重要规则
 * <ol>
 *     <li>执行一个方法时，会创建一个新的受保护的独立栈空间</li>
 *     <li>方法的局部变量是独立的，不会相互影响</li>
 *     <li>如果方法中使用的是引用类型变量，就会共享该引用类型的数据</li>
 *     <li>递归必须向退出递归的条件逼近，否则就是无限递归，出现<i>StackOverFlowError</i></li>
 *     <li>当一个方法执行完毕，或遇到return，就会返回。 遵守谁调用，就将结果返回给谁，同时当方法执行完毕后者返回时，该方法也就执行完毕</li>
 * </ol>
 *
 * @author allwayz
 * @create 2022-01-20 01:54
 */
public class RecursionDemo {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        // 用1表示墙， 上下左右全部变成1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        //设置挡板
        map[3][1] = 1;
        map[3][2] = 1;

        getWay(map,1,1);

        //输出地图
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }

    }

    /**
     * map表示地图<br>
     * (i,j)表示出发点(1,1)，终点为(6,5)<br>
     * 当map[i][j]为0时，表示该点没有走过，当1时表示墙，2表示通路，3表示已经走过，但是不通。<br>
     * 策略：下->右->上->左，如果走不通，再回溯<br>
     *
     * @param map
     * @param i
     * @param j
     * @return 找到返回true，否则返回false
     */
    public static boolean getWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            // 当这个点还没有走过
            if (map[i][j] == 0) {
                // 假定这个点可以走通
                map[i][j] = 2;
                if (getWay(map, i + 1, j)) {
                    return true;
                } else if (getWay(map, i, j + 1)) {
                    return true;
                } else if (getWay(map, i - 1, j)) {
                    return true;
                } else if (getWay(map, i, j - 1)) {
                    return true;
                } else {
                    //说明这个点走不通
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}

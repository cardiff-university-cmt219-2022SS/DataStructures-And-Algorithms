package cn.allwayz.DataStructures.SparseArrayAndQueueDemo;

public class SparseArray {
    public static void main(String[] args) {
        //定义一个初始二维数组
        int[][] chessArr = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        int sum =0;
        for (int[] ints : chessArr) {
            for (int j = 0; j < chessArr[0].length; j++) {
                if (ints[j] != 0) {
                    sum++;
                }
            }
        }

        //将二维数组转换成稀疏数组
        int[][] sparseArr = new int[sum+1][3];
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        int count = 0;
        //双循环遍历二维数组，将不为默认值的数添加到稀疏数组中
        for(int i = 0; i < chessArr.length; i++){
            for (int j = 0; j < chessArr[0].length; j++){
                if (chessArr[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr[i][j];
                }
            }
        }
        //打印新生成的稀疏数组
        for (int[] ints : sparseArr) {
            System.out.printf("%d\t%d\t%d\t\n", ints[0], ints[1], ints[2]);
        }

        //将稀疏数组转回二维数组
        int[][] newChessArr = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 1; i< sparseArr.length; i++){
            newChessArr[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
    }
}

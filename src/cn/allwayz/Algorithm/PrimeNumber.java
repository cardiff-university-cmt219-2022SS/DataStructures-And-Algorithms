package cn.allwayz.Algorithm;

/**
 * 输出100000以内的所有质数
 * 质数：只能被1和它本身整除的自然数。
 *
 * 算法调优：时间复杂度一开始是o(n),
 * @author allwayz
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Boolean flag = true;
        int count = 0;
        long startTime = System.currentTimeMillis();

        for (int i = 2; i <= 100000; i++) {
            // 根号i，针对本身是质数的自然数数有效
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    // 加上break可以提高效率。一旦发现可以被其他数整除，后面就不算了。
                    // 只对本身是非质数的自然数有效
                    break;
                }
            }
            if (flag == true) {
                count++;
            }
            flag = true;
        }
        long endTime = System.currentTimeMillis();
        /*
        未优化：       15731ms
        优化break：    1194ms
        优化除数：      11ms
         */
        System.out.println("Process Time： " + (endTime - startTime) + "ms");
    }



    public static void getPrimeNumber(){
        Boolean flag = true;
        int count = 0;
        long startTime = System.currentTimeMillis();

        for (int i = 2; i <= 100000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                count++;
            }
            flag = true;
        }
        long endTime = System.currentTimeMillis();
        /*
        未优化：       15731ms
        优化1：        1194ms
        优化2：        11ms
         */
        System.out.println("Process Time： " + (endTime - startTime) + "ms");
    }
}

package cn.allwayz.Learning.Week2;

/**
 * @author allwayz
 * @create 2022-02-04 10:58
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9, 10};
        int[] array = new int[5];
        array[0] = 3;
        array[1] = 5;
        array[2] = 7;
        array[3] = 9;
        array[4] = 10;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        System.out.println(res);
    }
}

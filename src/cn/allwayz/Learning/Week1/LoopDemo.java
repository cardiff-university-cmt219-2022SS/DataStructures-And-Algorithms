package cn.allwayz.Learning.Week1;

/**
 * @author allwayz
 * @create 2022-02-03 9:57 AM
 */
public class LoopDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1);
        }


        for (int i = 0; i < 15; i++) {
            System.out.print((i + 1) + ",");
        }
        System.out.println();


        String res = "";
        for (int i = 0; i < 15; i++) {
            res = (i + 1) + "," + res;
        }
        System.out.println(res);

        for (int i = 5; i < 45; i += 5) {
            System.out.print(i + ",");
        }
    }
}

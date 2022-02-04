package cn.allwayz.Learning.Week2;

/**
 * @author allwayz
 * @create 2022-02-04 11:20
 */
public class ForEachDemo {
    public static void main(String[] args) {
        String[] arr = {"apple", "pear", "orange"};
        for (String fruit : arr) {
            System.out.println(fruit);
        }
    }
}

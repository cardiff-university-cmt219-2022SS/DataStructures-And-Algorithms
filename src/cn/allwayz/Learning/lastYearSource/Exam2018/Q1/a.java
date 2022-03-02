package cn.allwayz.Learning.lastYearSource.Exam2018.Q1;

/**
 * @author allwayz
 * @create 2022-03-02 01:35
 */
public class a {
    public static void main(String[] args) {
        int i = 31;
        double d = 2.7;
        double res1 = d * (5 / 2) + 1;
        double res2 = i % 2 == 0 ? d : -d;
        System.out.println(res1);
        System.out.println(res2);
        StringBuffer buffer = new StringBuffer("Test123");
        buffer.replace(3, 5, "#");
        String res3 = buffer.toString();
        System.out.println(res3);
        buffer.reverse();
        buffer.insert(4, "+");
        String res4 = buffer.toString();
        System.out.println(res4);
    }
}

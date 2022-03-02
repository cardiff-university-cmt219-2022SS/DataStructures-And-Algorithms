package cn.allwayz.Learning.lastYearSource.Exam2016.Q1;

/**
 * @author allwayz
 * @create 2022-03-02 01:23
 */
public class a {
    public static void main(String[] args) {
        int i = 23;
        double d = 3.2;
        double res1 = Math.round((double) i / 5) + d;
        double res2 = (double) (d * (1 / 3) + i);
        System.out.println(Math.round((double) i / 5));
        System.out.println(res1);
        System.out.println(res2);
        StringBuffer buffer = new StringBuffer("Hello" + i);
        System.out.println(buffer.toString());
        buffer.append("#");
        buffer.reverse();
        System.out.println(buffer.toString());
    }
}

package cn.allwayz.Learning.lastYearSource.Exam2017.Q1;

/**
 * @author allwayz
 * @create 2022-03-02 01:29
 */
public class a {
    public static void main(String[] args) {
        int inum = -4;
        double dnum = 9.75;
        double res1 = (int) dnum / inum;
        double res2 = inum > 0 ? dnum : -dnum;
        String res3 = inum + dnum + "abc";
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        StringBuffer buffer = new StringBuffer(res3);
        buffer.replace(1, 4, "=");
        System.out.println(buffer.toString());
    }
}

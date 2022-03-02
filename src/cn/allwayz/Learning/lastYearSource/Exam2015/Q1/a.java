package cn.allwayz.Learning.lastYearSource.Exam2015.Q1;

/**
 * @author allwayz
 * @create 2022-03-02 01:16
 */
public class a {
    public static void main(String[] args) {
        int inum = 19;
        double dnum = 2.6;
        double result1 = (double) inum / 5 + dnum;
        double result2 = (double) (inum % 3 + (1 / 2) * dnum);
        String result3 = inum + "+"+dnum;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        StringBuffer buffer = new StringBuffer(result3);
        buffer.insert(2,"abc");
        System.out.println(buffer.toString());
        buffer.replace(1,4,"to");
        System.out.println(buffer.toString());
    }
}

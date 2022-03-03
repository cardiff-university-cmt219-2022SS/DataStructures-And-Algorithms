package cn.allwayz.Learning.lastYearSource.Exam2013.Q1;

/**
 * @author allwayz
 * @create 2022-03-02 21:48
 */
public class a {
    public static void main(String[] args) {
        int inum = 11;
        double dnum = 3.7;
        double result1, result2;
        result1 = (double) inum / 4 + dnum;
        result2 = (double) ((1 / 3) * inum + (1 / 2) * dnum);
        int result3;
        result3 = (inum / 2) << 2;
        String result4 = dnum + " " + inum;
        StringBuffer buffer = new StringBuffer(result4);
        buffer.replace(2, 5, "***");
        String result5 = buffer.toString();
    }
}

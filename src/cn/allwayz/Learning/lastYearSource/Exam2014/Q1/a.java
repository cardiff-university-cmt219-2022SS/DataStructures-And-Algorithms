package cn.allwayz.Learning.lastYearSource.Exam2014.Q1;

/**
 * @author allwayz
 * @create 2022-03-02 22:47
 */
public class a {
    public static void main(String[] args) {
        int inum = 23;
        double dnum = 5.4;
        double res1 = (double) inum / 5 + inum / 4;
        double res2 = (double) (inum / 3 + dnum * (1/3));
        int res3 = (int)dnum << 2;
        String res4 = inum + "+" + dnum;
        StringBuffer buffer = new StringBuffer(res4);
        buffer.insert(1, "-");
        String res5 = buffer.toString();
    }
}

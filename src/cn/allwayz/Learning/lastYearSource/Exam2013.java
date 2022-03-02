package cn.allwayz.Learning.lastYearSource;

/**
 * @author allwayz
 * @create 2022-02-28 16:05
 */
public class Exam2013 {
    public static void main(String[] args) {
        int i = 11;
        double d = 3.7;
        double r2 = (double) ((1 / 3) * i + (1 / 2) * d);
        System.out.println(r2);
        int r3 = (i / 2) << 2;
        System.out.println(r3);
        StringBuffer stringBuffer = new StringBuffer("19+");
        stringBuffer.replace(2,5,"***")
        ;System.out.println(stringBuffer);
        stringBuffer.insert(1,"-");
        System.out.println(stringBuffer);
    }
}

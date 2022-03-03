package cn.allwayz.Learning.lastYearSource.Exam2013.Q1;

/**
 * @author allwayz
 * @create 2022-03-02 21:49
 */
public class b {
    public static void main(String[] args) {
        if (args.length == 3) {
            try {
                for (int i = 0; i < args.length; i++) {
                    int r = Integer.parseInt(args[i]);
                }
            } catch (NumberFormatException e) {
                System.out.println("Fail");
                return;
            }
            System.out.println("Pass");
            return;
        }
        System.out.println("Fail");
        return;
    }
}

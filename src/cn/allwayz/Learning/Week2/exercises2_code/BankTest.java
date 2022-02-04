package cn.allwayz.Learning.Week2.exercises2_code;

/**
 * @author allwayz
 * @create 2022-02-04 11:55
 */
public class BankTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("M J W Morgan", "0033548");
        System.out.println(bankAccount);
        bankAccount.deposit(2000);
        bankAccount.withdraw(100);
        System.out.println(bankAccount.check());
    }
}

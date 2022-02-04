package cn.allwayz.Learning.Week2.exercises2_code;

/**
 *
 *
 * @author allwayz
 */
public class BankAccount {
    /**
     * private ??? holderName;<br>
     * private ??? balance;<br>
     * private ??? number;<br>
     */
    private String holderName;
    private double balance;
    private String number;

    public BankAccount(String name, String number){
        this.holderName = name;
        this.number = number;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String newName) {
        this.holderName = newName;
    }

    public void deposit(double cash){
        this.balance += cash;
    }

    public void withdraw(double cash){
        this.balance -= cash;
    }

    public double check(){
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "holderName='" + holderName + '\'' +
                ", balance=" + balance +
                ", number=" + number +
                '}';
    }
}
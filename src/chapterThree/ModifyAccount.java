package chapterThree;

public class ModifyAccount {

    private String name;
    private double balance;

    public ModifyAccount(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }


    public double getBalance() {
        return balance;
    }


    public void withdraw(double  amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println(" Insufficient funds ");
        }

    }


}
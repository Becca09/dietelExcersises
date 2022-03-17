package tddClass;

public class Account {

    private int balance;


    public void deposit(int amount) {
        if(amount > 0) balance = amount + balance;
        //if(amount<0) amount = 0;
        //balance = amount + balance;
    }

    public int getBalance() {
        return balance;
    }


    public void withdraw(int amount) {
        if(balance >= amount) {
            balance = balance - amount;
        }
        else {
            System.out.println( " Insufficient funds " );
        }

    }


}
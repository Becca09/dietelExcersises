package practices;

public class Account {
    private String accountName;
    private String accountNumber;
    private double balance;


    public Account(String accountName){
        this.accountName = accountName;
    }

    public void deposit(int amount){

        if (amount <= 0){
            throw new IllegalArgumentException("Invalid amount");
        }
        balance += amount;
    }

    public void withdraw(int amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Invalid amount");

        }
        if (amount > balance ){
            throw new IllegalArgumentException("insufficient amount");
        }
        balance -= amount;

    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return  balance;
    }
}

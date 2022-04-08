package classWorks.eBanking;

public class Bank {
    private final String name;
    private Accounts[] accounts;
    private int numberOfCustomer;

    public Bank(String bankName, int numberOfCustomer){
        name = bankName;
        accounts = new Accounts[numberOfCustomer];
    }

    public String getName() {
        return name;
    }

    public int getMaximumNoOfCustomers() {
        return accounts.length;
    }

    public void createAccountFor(String firstName, String lastName, String pin) {
        String accountNumber = (numberOfCustomer+1)+"";
        Accounts account = new Accounts(accountNumber, firstName, lastName, pin);
        accounts[numberOfCustomer] = account;
        numberOfCustomer++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomer;
    }

    public Accounts findAccount(int accountNumber) {
        int indexOfAccount = accountNumber -1;
        Accounts theAccount = accounts[indexOfAccount];
        return theAccount;
    }
}

package chapterThree;

public class ModifyAccountTest {

public static void main (String[]args){

    ModifyAccount myAccount = new ModifyAccount("john", 500000.000);

    myAccount.deposit(30000.00);

    myAccount.getBalance();
    System.out.println(" your current balance is " + myAccount.getBalance());



    myAccount.withdraw(1000000.00);

}

}

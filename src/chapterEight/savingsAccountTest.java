package chapterEight;

public class savingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount damilola = new SavingsAccount(2000);
        SavingsAccount femi = new SavingsAccount(3000);
        SavingsAccount.modifyingInterest(3);

        damilola.calculateMonthlyInterest();
        femi.calculateMonthlyInterest();

        System.out.printf("%s%.2f %n","the savings account for damilola is ", damilola.getSavingsBalance());
        System.out.printf("%s%.2f %n","the savings account for femi is ", femi.getSavingsBalance());

        SavingsAccount.modifyingInterest(4);

        damilola.calculateMonthlyInterest();
        femi.calculateMonthlyInterest();


        System.out.printf("%s%.2f %n","the savings account for damilola is ", damilola.getSavingsBalance());
        System.out.printf("%s%.2f %n","the savings account for femi is ", femi.getSavingsBalance());

    }

    }




package chapterEight;

public class SavingsAccount {
    private static double annualInterestRate;

    public double getSavingsBalance() {
        return savingsBalance;
    }

    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
        annualInterestRate = 0.5;
    }

    public void calculateMonthlyInterest() {
        savingsBalance = (savingsBalance * annualInterestRate / 12) + savingsBalance;
    }

    public static void modifyingInterest(double new_annualInterestRate) {
        if (new_annualInterestRate > 0) {
            annualInterestRate = new_annualInterestRate;
        } else throw new IllegalArgumentException("annual interest rate should be greater than zero!");
    }
}


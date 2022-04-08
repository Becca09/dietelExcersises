package chapterFour;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a non-negative number");
        int number = input.nextInt();

        int factorials = 1;
        for (int i = 0; i < number; i++) {
            factorials = number * i;
        }
        System.out.println("the factorials of " + number + " is " + factorials);
        System.out.println();

        System.out.println("b");

        System.out.println("Enter the number of terms to calculate for a value e in the form: ");
        System.out.println("e = 1 +(1/1!) +(1/2!)+(1/3!)+.....");
        double newNumber = input.nextDouble();

        double newFact = 1;
        double e = 1;
        for (int i = 1; i <= newNumber; i++) {
            newFact = newFact * newNumber;
            e = e + 1 / newFact;
        }
        System.out.print("The approximate value of e = " + e);
    }
}

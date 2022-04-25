package chapterSix;

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int intA = input.nextInt();

        System.out.println("Enter a number ");
        int intB = input.nextInt();

        System.out.println("Enter a number between 1 - 99999");
        int intC = input.nextInt();

        calculateQuotient(intA, intB);
        calculateRemainder(intA, intB);
        displayDigits(intC);

    }

    private static void displayDigits(int intC) {
        if (intC <= 99999){
            int num5 = (intC % 10);
            int num4 = (intC % 100) / 10;
            int num3 = (intC % 1000) / 100;
            int num2 = (intC % 10000) / 1000;
            int num1 = (intC % 100000) / 10000;

            System.out.print( num1 + "   "+ num2 + "   "+ num3 + "   "+ num4 + "   "+ num5);
        }

    }

    private static void calculateRemainder(int intA, int intB) {
       double remainder = intA % intB;
        System.out.println("The remainder is " + remainder);
    }

    private static void calculateQuotient(int intA, int intB) {
      double  quotient = (intA * 1.0) / intB;
        System.out.println("The quotient is " + quotient);
    }
}



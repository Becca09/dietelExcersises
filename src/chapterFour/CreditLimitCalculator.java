package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter your account number (end the program with -1 ");
        int accountNumber = input.nextInt();

        System.out.print( "Enter current balance ");
        int balance = input.nextInt();

        System.out.print( "Enter total items charged  ");
        int itemsCharged = input.nextInt();

        System.out.print( "Enter credit applied ");
        int creditApplied = input.nextInt();

        System.out.print( "Enter credit limit ");
        int creditLimit = input.nextInt();

        int newBalance = ( balance + itemsCharged - creditApplied);

        if( newBalance < creditLimit) {
            System.out.println("Credit limit exceeded");

        }
        else System.out.println( " Transaction successful");
    }
}
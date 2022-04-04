package chapterFour;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        checkPalindrome();
    }

    private static void checkPalindrome() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digit number");
        int number = input.nextInt();
        if (number > 10000) {
            int num5 = (number % 10);
            int num4 = (number % 100) / 10;
            int num3 = (number % 1000) / 100;
            int num2 = (number % 10000) / 1000;
            int num1 = (number % 100000) / 10000;

            if (num5 == num1 && num4 == num2) {
                System.out.println(number + " is a Palindrome");
            } else {
                System.out.println(number + " is not a Palindrome" );
                checkPalindrome();
            }
        }
    }
}

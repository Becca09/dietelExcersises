package chapterSix;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the multiple number");
        int num1 = input.nextInt();

        System.out.println("Enter the number");
        int num2 = input.nextInt();

        boolean result = isMultiple(num1, num2);
        System.out.println(result);

    }

    private static boolean isMultiple(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num2 + " is a multiple of " + num1);
            return true;
        } else
            return false;

    }
}

// line 7 - 15 is the scanner input at work, that is collecting input from the user
// the result is set to boolean because we want it to display true or false
// i created a boolean method to do the calculations, and assigned it to result, also passed in the scanner variables
// as the parameters

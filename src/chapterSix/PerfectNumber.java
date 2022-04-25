package chapterSix;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.println(isPerfect(number));

        for (int i = 0; i <= 1000; i++) {
            System.out.println(isPerfect(i));
        }
    }
    private static boolean isPerfect(int number) {
        int count = 1;
        int sum = 0;
        int factor;

        while (count < number) {

            if (number % count == 0) {
                factor = count;
                System.out.print(factor + " ");
                sum += factor;
            }
            count++;

        }
        if (sum == number) {
            System.out.println();
            System.out.println("The sum of the factors is " + sum + "," + number + " is a perfect number");
            System.out.println();
            System.out.println();
            return true;
        } else
            System.out.println(" = " + sum);
            System.out.println();
            System.out.println();
        return false;

    }
}
package chapterFive;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int firstNumber = input.nextInt();

        int smallestNumber = firstNumber;

        for (int i = 0; i < firstNumber; i++) {
            System.out.println(" Enter a num");
            int number = input.nextInt();
            if (smallestNumber > number) {
                smallestNumber = number;
            }
        }
        System.out.println(smallestNumber);
    }
}

package chapterFour;

import java.util.Scanner;

public class ValidatingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        while (counter <= 10) {
            System.out.println("Enter the number between 1 and 2;");
            int number = input.nextInt();

            if (number == 1 | number == 2)
                break;
            else
            counter ++;
        }

    }

}


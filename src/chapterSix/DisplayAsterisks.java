package chapterSix;

import java.util.Scanner;

public class DisplayAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of sides");
        int sides = input.nextInt();

        char fill = '*';

        printingOfAsterisks(sides, fill);
    }

    private static void printingOfAsterisks(int sides, char fill) {
        for (int i =0; i<= sides -1; i++) {
            for (int j = 0; j <= sides - 1; j++) {
                System.out.print(fill + " ");
            }
            System.out.println();
        }

    }
}

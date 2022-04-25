package chapterSix;

import java.util.Scanner;

public class DisplayOfAnyCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of sides");
        int sides = input.nextInt();

        System.out.println("Enter the character: ");
        char fill = input.next().charAt(0);

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

package chapterSix;

import java.util.Random;
import java.util.Scanner;


public class GuessTheNumber {
    public static void main(String[] args) {

        GuessNumber();

    }

    private static void GuessNumber() {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        System.out.println("Guess a number between 1 - 1000");
        int number = input.nextInt();

        int randomValue = rand.nextInt(1, 1000);


        if (number < randomValue) {
            System.out.println("Too low, try again");
            System.out.println(randomValue);
        }

       else if (number > randomValue) {
            System.out.println("Too high, try again");
            System.out.println(randomValue);
        }

         else {
            System.out.println("Congratulations! Would you like to play again? ");
            System.out.println("""
                    Enter:
                    1.-> play again
                    2.-> exit game
                    """);
            int userResponse = input.nextInt();
            switch (userResponse) {
                case 1 -> GuessNumber();
                case 2 -> System.out.println("thank you for playing");
            }
        }

    }
}


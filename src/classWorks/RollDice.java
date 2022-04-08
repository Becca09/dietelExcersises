package classWorks;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        Random randomDice = new Random();

        int die1 = randomDice.nextInt(1, 7);
        int die2 = randomDice.nextInt(1, 7);
        int point;
        int sum = die1 + die2;
        System.out.println(sum);
        if (sum == 7 | sum == 11) {
            System.out.println("You win yaaaayy");
        } else if (sum == 2 | sum == 3 | sum == 12) {
            System.out.println(" You loose, chicken!");
        } else if (sum == 4 | sum == 5 | sum == 4 | sum == 8 | sum == 9 | sum == 10) {
            point = sum;

            for (int i = 1; i != 0; i++) {
                die1 = randomDice.nextInt(1, 7);
                die2 = randomDice.nextInt(1, 7);

                sum = die1 + die2;
                System.out.println("Please try again");
                System.out.println(sum);

                if (sum == 7) {
                    System.out.println("you loose");
                    break;
                } else if (sum == point) {
                    System.out.println(" you win");
                    break;
                }
            }


        }
    }
}
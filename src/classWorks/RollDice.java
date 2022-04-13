package classWorks;

import java.security.SecureRandom;
import java.util.Random;

public class RollDice {
//    public static void main(String[] args) {
//        Random randomDice = new Random();
//
//        int die1 = randomDice.nextInt(1, 7);
//        int die2 = randomDice.nextInt(1, 7);
//        int point;
//        int sum = die1 + die2;
//        System.out.println(sum);
//        if (sum == 7 | sum == 11) {
//            System.out.println("You win yaaaayy");
//        } else if (sum == 2 | sum == 3 | sum == 12) {
//            System.out.println(" You loose, chicken!");
//        } else if (sum == 4 | sum == 5 | sum == 4 | sum == 8 | sum == 9 | sum == 10) {
//            point = sum;
//
//            for (int i = 1; i != 0; i++) {
//                die1 = randomDice.nextInt(1, 7);
//                die2 = randomDice.nextInt(1, 7);
//
//                sum = die1 + die2;
//                System.out.println("Please try again");
//                System.out.println(sum);
//
//                if (sum == 7) {
//                    System.out.println("you loose");
//                    break;
//                } else if (sum == point) {
//                    System.out.println(" you win");
//                    break;
//                }
//            }
//
//
//        }
//    }
public static void main(String[] args) {
    int roll = rollDice();
    status(roll);
}

    private static int point;
    private static String gameStatus;

    public static int rollDice() {
        SecureRandom random = new SecureRandom();
        int firstDiceFace = 1 + random.nextInt(6);
        int secondDiceFace = 1 + random.nextInt(6);

        System.out.println("You rolled " + firstDiceFace + " and " + secondDiceFace);
        System.out.println("The sum of rolled dice is " + (firstDiceFace + secondDiceFace));

        return firstDiceFace + secondDiceFace;
    }

    public static String status(int roll) {
        if (roll == 7 || roll == 11) {
            gameStatus = "You Win";
            System.out.println(gameStatus);
        }
        else if (roll == 2 || roll == 3 || roll == 12) {
            gameStatus = "You Lose, THE HOUSE WINS!";
            System.out.println(gameStatus);
        }
        else {
            gameStatus = "You Continue";
            point = roll;
            toContinue();
        }

        return gameStatus;
    }

    public static void toContinue(){
        while(gameStatus == "You Continue") {
            int sum = rollDice();
            if (sum == point) gameStatus = "You Win";
            else if (sum == 7) gameStatus = "You Lose, THE HOUSE WINS!";
        }

        System.out.println(gameStatus);
    }
}
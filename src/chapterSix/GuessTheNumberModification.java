package chapterSix;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberModification {
    public static void main(String[] args) {
        GuessNumber();
    }

    private static void GuessNumber() {
        int count = 0;
        boolean status = true;
        Scanner input = new Scanner(System.in);

        Random rand = new Random();


        int randomValue = rand.nextInt(1, 1000);

        while (status) {
            System.out.println("Guess a number between 1 and 1000: ");
            int number = input.nextInt();

            if (count != 10){
                if (number > randomValue) {
                    System.out.println(randomValue);
                    System.out.println("too high, try again");
//                count += 1;
                } else if (number < randomValue) {
                    System.out.println(randomValue);
                    System.out.println("too low, try again");

                }
                count += 1;
            }



            else {
                if (count == 10){
                    if (number == randomValue){
                        System.out.println("Aha! You know the secret!");
                    }
                    else {System.out.println("You should be able to do better!");}
                }
                else if (count <= 10){
                    System.out.println("Either you know the secret or you got lucky!");
                }
            }
        }
    }


}

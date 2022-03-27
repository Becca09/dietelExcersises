package assignments;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    static Random randomNumber = new SecureRandom();
    static Scanner scanner= new Scanner(System.in);
    static int count1 = 0;
    static int count2 = 0;

    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            int calculations = randomNumber.nextInt(1,5);
            switch (calculations) {
                case 1 -> addition();
                case 2 -> subtraction();
                case 3 -> multiplication();
                case 4 -> division();
                default -> System.out.println("calculation is needed");
            }

        }
        System.out.println("You scored "+count1);
        System.out.println("You failed "+count2);

        int score = count1 - count2;
        System.out.println("Your total score is: " + score);
    }

    public static void addition(){
        int value1 = randomNumber.nextInt(1, 11);
        int value2 = randomNumber.nextInt(1,11);

        System.out.print(value1 + "+" + value2 + "=");
        int userAnswer = scanner.nextInt();
        int answer = value1 + value2;

        if(userAnswer == answer)
            count1++;
        else count2++;
    }

    public static void subtraction(){
        int value1 = randomNumber.nextInt(1, 11);
        int value2 = randomNumber.nextInt(1,11);
        if(value1 > value2) {
            System.out.print(value1 + "-" + value2 + "=");
            int userAnswer = scanner.nextInt();
            int answer = value1 - value2;

            if (userAnswer == answer)
                count1++;
            else count2++;
        }
        else if (value2 > value1) {
            System.out.print(value2 + "-" + value1 + "=");
            int userAnswer = scanner.nextInt();
            int answer = value2 - value1;

            if (userAnswer == answer)
                count1++;
            else count2++;
        }
    }
    public static void multiplication(){
        int value1 = randomNumber.nextInt(1, 11);
        int value2 = randomNumber.nextInt(1,11);

        System.out.print(value1 + "*" + value2 + "=");
        int userAnswer = scanner.nextInt();
        int answer = value1 * value2;

        if(userAnswer == answer)
            count1++;
        else count2++;
    }
    public static void division(){
        int value1 = randomNumber.nextInt(1, 11);
        int value2 = randomNumber.nextInt(1,11);
        if(value1 > value2) {
            System.out.print(value1 + "/" + value2 + "=");
            double userAnswer = scanner.nextDouble();
            double answer = value1 / value2;

            if (userAnswer == answer)
                count1++;
            else count2++;
        }
        else if (value2 > value1) {
            System.out.print(value2 + "/" + value1 + "=");
            double userAnswer = scanner.nextInt();
            double answer = value2 / value1;

            if (userAnswer == answer)
                count1++;
            else count2++;
        }
    }
}

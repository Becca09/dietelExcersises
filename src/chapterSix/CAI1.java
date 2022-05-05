package chapterSix;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI1 {
    static Scanner input = new Scanner(System.in);
    static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {


        boolean isCorrect;
        do {
            int num1 = generateRandomNumbers();
            int num2 = generateRandomNumbers();
            int actualAnswer = displayQuestion(num1, num2);

            System.out.println(" Your answer:  ");
            int answer = input.nextInt();

            isCorrect = checkAnswer(answer, actualAnswer);

            while (!isCorrect) {
                displayQuestion(num1, num2);

                System.out.println(" Your answer:  ");
                answer = input.nextInt();

                isCorrect = checkAnswer(answer, actualAnswer);
            }
        }
        while (isCorrect);


    }

    private static int generateRandomNumbers() {
        return random.nextInt(1, 10);
    }

    private static int multiplyNumbers(int number1, int number2) {
        return number1 * number2;
    }

    public static boolean checkAnswer(int answer, int actualAnswer) {
        if (answer == actualAnswer) {
            System.out.println("Very Good!");
            return true;

        } else {
            System.out.println("No. Please try again.");
            return false;
        }
    }

    public static int displayQuestion(int number1, int number2) {
        System.out.println("what is the multiplication of " + number1 + " X " + number2);
        return multiplyNumbers(number1, number2);

    }
}






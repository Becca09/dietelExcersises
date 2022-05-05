package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIMonitoringStudentPerformance {
    static Scanner input = new Scanner(System.in);
    static SecureRandom random = new SecureRandom();
    static int counter = 0;
    static int wrongCounter = 0;

    public static void main(String[] args) {



        for (int i = 0; i < 10; i++) {
            int num1 = generateRandomNumbers();
            int num2 = generateRandomNumbers();
            int actualAnswer = displayQuestion(num1, num2);
            System.out.println(" Your answer:  ");
            int answer = input.nextInt();
            boolean isCorrect = checkAnswer(answer, actualAnswer);

            if (isCorrect) {
                counter++ ;
                System.out.println(counter);
            }
            else {
                wrongCounter++;
                System.out.println(wrongCounter);
            }
        }

        int result = showResult();
        System.out.println(result);
    }


    private static int generateRandomNumbers() {
        return random.nextInt(1, 10);
    }

    private static int multiplyNumbers(int number1, int number2) {
        return number1 * number2;
    }

    public static boolean checkAnswer(int answer, int actualAnswer) {
        if (answer == actualAnswer) {
            int correctAnswerResponse = random.nextInt(1, 5);
            switch (correctAnswerResponse) {
                case 1 -> System.out.println("Very good!");
                case 2 -> System.out.println("Excellent!");
                case 3 -> System.out.println("Nice work!");
                case 4 -> System.out.println("Keep up the good work!");

            }
            return true;

        } else {
            int wrongAnswerResponse = random.nextInt(1, 5);
            switch (wrongAnswerResponse) {
                case 1 -> System.out.println("No. Please try again.");
                case 2 -> System.out.println("Wrong. Try once more.");
                case 3 -> System.out.println("Don't give up!");
                case 4 -> System.out.println("No. Keep trying.");
            }
            return false;
        }
    }

    public static int displayQuestion(int number1, int number2) {
        System.out.println("what is the multiplication of " + number1 + " X " + number2);
        return multiplyNumbers(number1, number2);

    }
    private static int showResult() {
        int percentage = 0;
        percentage = counter / 10 * 100;

        if (percentage >= 70) {
            System.out.println("You scored " + percentage + "%");
            System.out.println("Congratulations, you are ready to go to the next level!");
        } else {
            System.out.println("You scored " + percentage + "%");
            System.out.println("Please ask your teacher for extra help");
        }
        return percentage;
    }
}


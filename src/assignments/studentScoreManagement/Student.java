package assignments.studentScoreManagement;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        int numberOfStudent = collectIntInput("Enter number of student");

        int numberOfSubject = collectIntInput("Enter number of subject");

        int[][] students = new int[numberOfStudent][numberOfSubject];
        int[][] total = new int[numberOfStudent][1];
        double[][] average = new double[numberOfStudent][1];


        for (int i = 0; i < students.length; i++) {
            String name = collectStringInput("Enter name");

            String studentPrompt = "Welcome student " + i + " AKA " + name;
            display(studentPrompt);
            int sum = 0;
            for (int j = 0; j < numberOfSubject; j++) {
                int score = collectIntInput("Enter score");
                students[i][j] = score;
                sum += score;
                total[i][0] = sum;
                average[i][0] = sum * 1.0 / numberOfSubject;
            }
        }
        displayLineBreak(70);

        for (int i = 0; i < students.length; i++) {
            System.out.print("Student" + (i + 1) + ". ");
            for (int j = 0; j < numberOfSubject; j++) {
                System.out.print(students[i][j] + "\t\t\t\t");
            }

            for (int j = 0; j < 1; j++) {
                System.out.print(total[i][j] + "\t\t\t\t");
            }

            for (int j = 0; j < 1; j++) {
                System.out.println(average[i][j] + "\t\t\t\t");
            }
        }
        displayLineBreak(70);


    }

    public static int collectIntInput(String prompt) {
        display(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void display(String message) {
        System.out.println(message);
    }

    public static String collectStringInput(String prompt) {
        display(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void displayLineBreak(int numberOfLines) {
        System.out.println(" ");
        for (int i = 0; i < numberOfLines; i++) {
            System.out.print("=");
        }
        System.out.println(" ");
    }
}
package classWorks;

import java.util.Scanner;

public class StudentAndSubjectArray {
//    public static void main(String[] args) {
//        int sum = 0;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of student ");
//        int noOfStudent = input.nextInt();
//
//
//        System.out.println("Enter the number of subject  ");
//        int noOfSubject = input.nextInt();
//
//        int[][] marks = new int[noOfStudent][noOfSubject];
//        for (int i = 0; i < noOfStudent; i++) {
//            int j;
//            for (j = 0; j < noOfSubject; j++) {
//                System.out.println("Enter student score");
//                marks[i][j] = input.nextInt();
//            }
//        }
//
//
//        System.out.println("\t\tSubject1\tSubject2\t\tSubject3\t\tScoreSum\t\tScoreAverage");
//        for (int i = 0; i < noOfStudent; i++) {
//            System.out.print("Student" + (i + 1) + ". ");
//            for (int j = 0; j < noOfSubject; j++) {
//
//                System.out.print(marks[i][j]  + sum + "\t\t\t\t\t" );
//            }
//            System.out.println();
//        }
//
//    }

    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);
//
        System.out.println("Enter the number of students: ");
        int studentNumber = collector.nextInt();

        System.out.println("Enter the number of subjects: ");
        int subjectNumber = collector.nextInt();

        int[][] array = new int[studentNumber][subjectNumber];
        int[][] total = new int[studentNumber][1];
        double[][] average = new double[studentNumber][1];
//
        System.out.println();

        for (int i = 0; i < studentNumber; i++) {
            for (int j = 0; j < subjectNumber; j++) {
                System.out.println("Enter student grade: ");
                array[i][j] = collector.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < studentNumber; i++) {
            int sum = 0;
            for (int j = 0; j < subjectNumber; j++) {
                sum = sum + array[i][j];
            }
            total[i][0] = sum;
            average[i][0] = sum * 1.0 / subjectNumber;
        }

        System.out.println("\t\tSubject1\t\tSubject2\t\tSubject3\t\tTotal\t\tAverage");


        for (int i = 0; i < studentNumber; i++) {
            System.out.print("Student" + (i + 1) + ". ");
            for (int j = 0; j < subjectNumber; j++) {
                System.out.print(array[i][j] + "\t\t\t\t");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print(total[i][j] + "\t\t\t\t");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print(average[i][j] + "\t\t\t\t");
            }
            System.out.println();
        }
    }
}



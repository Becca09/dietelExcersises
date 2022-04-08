package classWorks;

import java.util.Scanner;

public class StudentAndSubjectArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of student ");
        int noOfStudent = input.nextInt();


        System.out.println("Enter the number of subject  ");
        int noOfSubject = input.nextInt();

        int [] []  marks  = new int[noOfStudent][noOfSubject];
        for (int i = 0; i < noOfStudent; i++){
            for (int j = 0; j< noOfSubject; j++){
                System.out.println( "Enter student score");
                 marks[i][j] = input.nextInt();
            }
        }
        System.out.println("\t\tSubject1\t\tSubject2\t\tSubject3");
        for (int i = 0; i < noOfStudent; i++) {
            System.out.print("Student"+ (i+1) + ". ");
            for (int j = 0; j < noOfSubject; j++) {
                System.out.print(marks[i][j]+ "\t\t\t\t");
            }
            System.out.println();
        }

    }
}

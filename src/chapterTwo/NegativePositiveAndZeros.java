package chapterTwo;

import java.util.Scanner;

public class NegativePositiveAndZeros {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the first integer: ");
            int firstInteger = input.nextInt();

            System.out.print("Enter the second integer: ");
            int secondInteger = input.nextInt();

            System.out.print("Enter the third integer: ");
            int thirdInteger = input.nextInt();

            System.out.print("Enter the fourth integer: ");
            int fourthInteger = input.nextInt();

            System.out.print("Enter the fifthinteger: ");
            int fifthInteger = input.nextInt();


            int positiveNum = 0;
            int zeroNum = 0;
            int negativeNum = 0;

            if (firstInteger > 0){
                positiveNum = positiveNum + 1;
            }
            if (secondInteger > 0){
                positiveNum = positiveNum + 1;
            }
            if (thirdInteger > 0){
                positiveNum = positiveNum + 1;
            }
            if (fourthInteger > 0){
                positiveNum = positiveNum + 1;
            }
            if (fifthInteger > 0){
                positiveNum = positiveNum + 1;
            }

            if (firstInteger == 0){
                zeroNum = zeroNum + 1;
            }
            if (secondInteger == 0){
                zeroNum = zeroNum + 1;
            }
            if (thirdInteger == 0){
                zeroNum = zeroNum + 1;
            }
            if (fourthInteger == 0){
                zeroNum = zeroNum + 1;
            }
            if (fifthInteger == 0){
                zeroNum = zeroNum + 1;
            }

            if (firstInteger < 0){
                negativeNum = negativeNum + 1;
            }
            if (secondInteger < 0){
                negativeNum = negativeNum + 1;
            }
            if (thirdInteger < 0){
                negativeNum = negativeNum + 1;
            }
            if (fourthInteger < 0){
                negativeNum = negativeNum + 1;
            }
            if (fifthInteger < 0){
                negativeNum = negativeNum + 1;
            }


            System.out.printf("Number of positive digits = %d%n", positiveNum);
            System.out.printf("Number of negative digits = %d%n", negativeNum);
            System.out.printf("Number of zero digits = %d%n", zeroNum);

        }
    }


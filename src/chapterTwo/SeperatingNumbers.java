package chapterTwo;

import java.util.Scanner;

public class SeperatingNumbers {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five numbers");

        int fiveDigits = input.nextInt(); // This reads the first integer
        int digitLength = Integer.toString(fiveDigits).length();

        int digitOne = fiveDigits/10000%10;
        int digitTwo = fiveDigits/1000%10;
        int digitThree = fiveDigits/100%10;
        int digitFour = fiveDigits/10%10;
        int digitFive = fiveDigits%10;

        if(digitLength == 5){
            System.out.printf("%d, %d, %d, %d, %d%n", digitOne, digitTwo, digitThree, digitFour, digitFive);
        }
        if(digitLength != 5){
            System.out.printf("Kindly re-run and input 5 digits only! ");
        }



    }
    }
package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;


public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] theArray = new int[5];
        Arrays.fill(theArray, -1);

        int count = 0;

        while (count < 5){
            System.out.printf("Enter Number %d (Must be between 10 - 100): \n", count+1);
            int userInput = input.nextInt();
            if (userInput >= 10 && userInput <= 100){
                if (!checkDuplicates(theArray, userInput)){
                    theArray[count] = userInput;
                    count++;
                }
            }
        }

        System.out.println(Arrays.toString(theArray));
    }

    public static boolean checkDuplicates(int[] numbers, int duplicate) {
        for(int number : numbers){
            if (number == duplicate){
                return true;
            }
        }
        return false;
    }

}


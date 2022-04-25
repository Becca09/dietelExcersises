package classWorks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SumOfAnArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] elements = {4, 50,10};

        for (int i = 0; i < elements.length; i++) {
            sum = sum + elements[i];

        }
        System.out.println("the sum of the array is " + sum);


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the row number");
        int numOfRow = input.nextInt();

        System.out.println("Enter the column number");
        int numOfColumn = input.nextInt();


        int[][] elementz = new int[numOfRow][numOfColumn];
        Random rand = new Random();
        int sum2 = 0;
        for (int i = 0; i < numOfRow; i++) {
            for (int j = 0; j < numOfColumn; j++) {
                elementz[i][j] = rand.nextInt(1, 8);
                sum2 = sum2 + elementz[i][j];
            }
        }
        System.out.println(Arrays.deepToString(elementz));
        System.out.println("the sum of the elementz is " + sum2);

    }
}

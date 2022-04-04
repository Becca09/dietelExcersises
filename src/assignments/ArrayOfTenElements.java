package assignments;

import java.util.Random;

public class ArrayOfTenElements {
    public static void main(String[] args) {
        int largestNumber = 0;
        int sum = 0;
        double average = 0;

        int elements[] ={4, 59, 67, 89, 60,17,90,2,47,89};
//        Random random = new Random();
        for (int i = 0; i < elements.length; i++) {
        }
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > largestNumber) {
                largestNumber = elements[i];
            }
        }
        System.out.println();
        System.out.print( " The largest number is " + largestNumber);


        for (int i = 0; i < elements.length; i++){
            sum = sum + elements[i];
        }
        System.out.println();
        System.out.println("The sum is " + sum);


        average = sum /10;
        System.out.println( " The Average number is " + average);
    }

}

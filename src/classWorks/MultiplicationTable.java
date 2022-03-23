package classWorks;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a value ");
        int value = input.nextInt();
        int i = 1;

        while (i <= 12) {
            int multiply = value * i;
//        for (int i = 1; i <=12; i++) {
//            int multiply = value * i;
            System.out.println(value + " * " + i + " = " + multiply);
            i++;

//        }
        }

    }
}


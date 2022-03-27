package chapterFour;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println(" Enter your name");
        String name = input.nextLine();

        System.out.println("Enter Income earned yearly stop with -1");
        double income = input.nextInt();
        input.nextLine();

       while (income != -1){

           if(income > 30000)
               System.out.printf(" %s your tax is $%.2f", name, income*0.20);
           else
               System.out.printf(" %s your tax is $%.2f", name, income*0.15);
           income++;
       }
    }
}

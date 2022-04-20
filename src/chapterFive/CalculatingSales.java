package chapterFive;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double product1 = 2.98;
        double product2 = 4.50;
        double product3 = 9.98;
        double product4 = 4.49;
        double product5 = 6.87;

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        System.out.println(" Enter your name, retailer: ");
        String name = input.nextLine();

        System.out.println("Enter the product sold and number of product sold, use -1 to stop");
        int product = input.nextInt();

        while (product != -1) {
            switch (product) {
                case 1 -> count1++;
                case 2 -> count2 = count2 + 1;
                case 3 -> count3++;
                case 4 -> count4++;
                case 5 -> count5++;
                default -> System.out.println("input a valid number between 1-4");
            }
            System.out.println("Enter the product sold and number of product sold, use -1 to stop");
            product = input.nextInt();

        }
        double totalSales = (product1 * count1) + (product2 * count2) + (product3 * count3) + (product4 * count4) + (product5 * count5);
        System.out.printf(" Retailer %s, The total retail value for the products sold is $%.2f", name, totalSales);
    }
}

package chapterFour;

import java.util.Scanner;

public class CommisionCalulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salary = 200;
        double commission = 0.09;
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 380.89;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        System.out.println(" Enter your name");
        String name = input.nextLine();

        System.out.println("Enter The Number of items sold, use -1 to stop");
        int item = input.nextInt();

        while (item != -1) {

            switch (item) {
                case 1:
                    count1++;
                    break;
                case 2:
                    count2 = count2 + 1;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                default:
                    System.out.println("input a valid number between 1-4");
                    break;
            }

            System.out.println("Enter The Number of items sold, use -1 to stop");
            item = input.nextInt();
        }
        double totalEarnings = salary + (commission * ((item1 * count1) + (item2 * count2) + (item3 * count3) + (item4 * count4)));
        System.out.printf("%s, your earning for last week was $%.2f: ",name, totalEarnings);
    }

    }

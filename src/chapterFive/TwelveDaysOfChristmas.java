package chapterFive;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter day in integer");
        int day = input.nextInt();


        switch (day) {
            case 1 -> {
                System.out.println("On the first day of christmas my true love sent to me");
                verse(day);
            }
            case 2 -> {
                System.out.println("On the second day of Christmas my true love sent to me");
                verse(day);
            }
            case 3 -> {
                System.out.println("On the third day of Christmas my true love gave to me ");
                verse(day);
            }
            case 4 -> {
                System.out.println("On the fourth day of Christmas my true love gave to me ");
                verse(day);
            }
            case 5 -> {
                System.out.println("On the Fifth day of Christmas my true love gave to me");
                verse(day);
            }
            case 6 -> {
                System.out.println("On the sixth day of Christmas my true love gave to me");
                verse(day);
            }
            case 7 -> {
                System.out.println("On the seventh day of Christmas my true love gave to me");
                verse(day);
            }
            case 8 -> {
                System.out.println("On the eighth day of Christmas my true love gave to me");
                verse(day);
            }
            case 9 -> {
                System.out.println("On the third day of Christmas my true love gave to me");
                verse(day);
            }
            case 10 -> {
                System.out.println("On the tenth day of Christmas my true love gave to me");
                verse(day);
            }
            case 11 -> {
                System.out.println("On the eleventh day of Christmas my true love gave to me");
                verse(day);
            }
            case 12 -> {
                System.out.println("On the twelve day of Christmas my true love gave to me ");
                verse(day);
            }
        }

    }
    public static void verse(int day) {
        switch (day) {
            case 12:
                System.out.println("Twelve drummers drumming");
            case 11:
                System.out.println("Eleven pipers piping");
            case 10:
                System.out.println("Ten lords a-leaping");
            case 9:
                System.out.println("Nine ladies dancing");
            case 8:
                System.out.println("Eight maids a-milking");
            case 7:
                System.out.println("Seven swans a-swimming");
            case 6:
                System.out.println("Six geese a-laying,");
            case 5:
                System.out.println("Five golden rings");
            case 4:
                System.out.println("Four calling birds,");
            case 3:
                System.out.println("Three French hens");
            case 2:
                System.out.println(" Two turtle-doves");
            case 1:
                System.out.println(" A partridge in a pear tree");
        }


    }


}

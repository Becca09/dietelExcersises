package chapterFive;

import java.util.Scanner;
public class TwelveDaysOfChristmas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter day in integer");
        int day = input.nextInt();


        switch(day){
            case 1:
                System.out.println("First");
                verse(day);
                break;
            case 2:
                System.out.println("Second");
                verse(day);
                break;
            case 3:
                System.out.println("Third");
                verse(day);
                break;
            case 4:
                System.out.println("Fouth");
                verse(day);
                break;
            case 5:
                System.out.println("Fifth");
                verse(day);
                break;
            case 6:
                System.out.println("Sixth");
                verse(day);
                break;

            case 7:
                System.out.println("Seventh");
                verse(day);
                break;
            case 8:
                System.out.println("Eight");
                verse(day);
                break;
            case 9:
                System.out.println("Ninth");
                verse(day);
                break;
            case 10:
                System.out.println("Tenth");
                verse(day);
                break;
            case 11:
                System.out.println("Eleventh");
                verse(day);
                break;
            case 12:
                System.out.println("Twelve");
                verse(day);
                break;
        }

    }








    public static void verse(int day){
        switch(day){
            case 1:
                System.out.println("On the first day of christmas my true love sent to me A partridge in a pear tree");
                break;
            case 2:
                System.out.println("On the second day of Christmas my true love sent to me Two turtle-doves");
                break;
            case 3:
                System.out.println("On the third day of Christmas my true love gave to me Three French hens");
                break;
            case 4:
                System.out.println("On the fourth day of Christmas my true love gave to me Four calling birds,");
                break;
            case 5:
                System.out.println("On the third day of Christmas my true love gave to me Five golden rings,,");
                break;
            case 6:
                System.out.println("On the third day of Christmas my true love gave to me Six geese a-laying,");
                break;
            case 7:
                System.out.println("On the third day of Christmas my true love gave to me Seven swans a-swimming,");
                break;
            case 8:
                System.out.println("On the third day of Christmas my true love gave to me Eight maids a-milking,");
                break;
            case 9:
                System.out.println("On the third day of Christmas my true love gave to me Nine ladies dancing,");
                break;
            case 10:
                System.out.println("On the third day of Christmas my true love gave to me Ten lords a-leaping,");
                break;
            case 11:
                System.out.println("On the third day of Christmas my true love gave to me Eleven pipers piping,");
                break;
            case 12:
                System.out.println("On the third day of Christmas my true love gave to me Twelve drummers drumming,");
                break;
        }



    }
}

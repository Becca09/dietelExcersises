package chapterSix;

import java.util.Scanner;

public class ReversingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        reverseNumber(12345);
    }
    public static void reverseNumber(int num){
        int num5 = (num % 10);
        int num4 = (num % 100) / 10;
        int num3 = (num % 1000) / 100;
        int num2 = (num % 10000) / 1000;
        int num1 = (num % 100000) / 10000;

        System.out.println( num5 + "   "+ num4 + "   "+  num3+ "   "+  num2+ "   " + num1);
    }
}

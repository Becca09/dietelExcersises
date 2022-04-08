package chapterFour;

import java.util.Scanner;

public class EnforcingWithCryptoGraphy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( " Enter a four digit number");
        int number = input.nextInt();
        System.out.println(number);

        //separating number with modulus and division and adding 7 to each seperated digit
        int num4 = (((number % 10) + 7));
        int num3 = (((number % 100) / 10) + 7);
        int num2 = (((number % 1000) / 100) + 7);
        int num1 = (((number % 10000) / 1000) + 7);

       // encrypting numbers by  //changing each digit to remainder after division by 10
        int newNum1 = num1%10;
        int newNum2 = num2%10;
        int newNum3 = num3%10;
        int newNum4 = num4%10;

        System.out.println(newNum1);
        System.out.println(newNum2);
        System.out.println(newNum3);
        System.out.println(newNum4);

        //switching first digit with third and second digit with fourth
        System.out.println(" the encrypted numbers are " + newNum3 + newNum4 + newNum1 + newNum2);
    }
}

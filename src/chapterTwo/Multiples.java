package chapterTwo;

import java.util.Scanner;
public class Multiples {
       public static void main(String [] args){
       Scanner input = new Scanner(System.in);

	System.out.print("Enter the integer: ");
	int int1 = input.nextInt();

	System.out.print("Enter the integer: ");
	int int2 = input.nextInt();

	int tripled = int1 * int1 * int1;
	int doubled = int2 * int2;

	if (tripled % doubled == 0)
	System.out.println("The first number tripled is a multiple of the second number doubled, The answer is: " + tripled/doubled);

	if (tripled % doubled != 0)
	System.out.println("The first number tripled is not a multiple of the second number doubled");	
       
  }
}
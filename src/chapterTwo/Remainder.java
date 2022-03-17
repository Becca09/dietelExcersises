package chapterTwo;

import java.util.Scanner;
public class Remainder{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int int1 = input.nextInt();

	int remainder = int1 % 3;
	System.out.println("The remainder is: " +remainder);

	if (int1 % 3 == 0) 
	System.out.println("The number is divisible by 3");
	if (int1 % 3 != 0) 
	System.out.println("The number is not divisible by 3");
	}
}
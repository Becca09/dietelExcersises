package chapterTwo;//Calculates the square, sum of squares and difference btw squares of two integers
import java.util.Scanner;
public class Arithmetic{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the first integer: ");
	int intx = input.nextInt();

	System.out.println("Enter the second integer: ");
	int inty = input.nextInt();

	int Square1 = intx * intx;

	int Square2 = inty * inty;

	System.out.printf("The square of %d is %d%n", intx, Square1);
	System.out.printf("The square of %d is %d%n", inty, Square2);

	int Sum = Square1 + Square2;

	System.out.printf("The sum of their squares is %d%n ",  Sum);

	int Diff = Square1 - Square2;

	System.out.printf("The difference of their squares is  %d%n",  Diff);
}
}

	
	
package chapterTwo;

import java.util.Scanner;
public class SmallestAndLargestNumber{
       public static void main(String [] args){
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the integer: ");
       int int1 = input.nextInt();

       System.out.print("Enter the integer: ");
       int int2 = input.nextInt();

       System.out.print("Enter the integer: ");
       int int3 = input.nextInt();

       int sum = int1 + int2 +int3;
       
       int product = int1 * int2 * int3;
     
       int average = (int1 + int2 + int3) / 3;


      System.out.println( "The sum of three integers are " + sum);
     
      System.out.println( "The product of three integers are " + product);
     
      System.out.println( "The average of three integers are " + average);

	
	if (int1 > int2 && int1 > int3)
	System.out.println("The first number is largest: " +int1);

	if (int2 > int1 && int2 > int3)
	System.out.println("The second number is largest: " +int2);

	if (int3 > int1 && int3 > int2)
	System.out.println("The Third number is largest: " +int3);

        if (int1 < int2 && int1 < int3)
	System.out.println("The first number is smallest: " +int1);

	if (int2 < int1 && int2 < int3)
	System.out.println("The second number is smallest: " +int2);

	if (int3 < int1 && int3 < int2)
	System.out.println("The Third number is smallest: " +int3);
       
  }
}
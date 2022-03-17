package chapterTwo;

import java.util.Scanner;
public class SmallestAndLargestNumber5{
       public static void main(String [] args){
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the integer: ");
       int int1 = input.nextInt();

       System.out.print("Enter the integer: ");
       int int2 = input.nextInt();

       System.out.print("Enter the integer: ");
       int int3 = input.nextInt();

       System.out.print("Enter the integer: ");
       int int4 = input.nextInt();

       System.out.print("Enter the integer: ");
       int int5 = input.nextInt();

	
	if (int1 < int2) 
	if (int1 < int3)
        if (int1 < int4)
        if (int1 < int5)
	System.out.println("The first number is smallest: " +int1);

	if (int2 < int1) 
	if (int2 < int3)
        if (int2 < int4)
        if (int2 < int5)
	System.out.println("The second number is smallest: " +int2);

	if (int3 < int1) 
	if (int3 < int2)
        if (int3 < int4) 
	if (int3 < int5)  
	System.out.println("The Third number is smallest: " +int3);

        if (int4 < int1)  
	if (int4 < int2)
        if (int4 < int3) 
	if (int4 < int5)
	System.out.println("The first number is smallest: " +int4);

	if (int5 < int1) 
	if (int5 < int2)
        if (int5 < int3) 
	if (int5 < int4)
	System.out.println("The second number is smallest: " +int5);


	if (int1 > int2) 
	if (int1 > int3)
        if (int1 > int4)
        if (int1 > int5)
	System.out.println("The first number is largest: " +int1);

	if (int2 > int1) 
	if (int2 > int3)
        if (int2 > int4)
        if (int2 > int5)
	System.out.println("The second number is largest: " +int2);

	if (int3 > int1) 
	if (int3 > int2)
        if (int3 > int4) 
	if (int3 > int5)  
	System.out.println("The Third number is largest: " +int3);

        if (int4 > int1)  
	if (int4 > int2)
        if (int4 > int3) 
	if (int4 > int5)
	System.out.println("The first number is largest: " +int4);

	if (int5 > int1) 
	if (int5 > int2)
        if (int5 > int3) 
	if (int5 > int4)
	System.out.println("The second number is largest: " +int5);

	
       
  }
}
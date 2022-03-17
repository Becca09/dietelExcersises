package chapterTwo;

import java.util.Scanner;
public class Diameter{
       public static void main(String [] args){
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the radius: ");
       int radius = input.nextInt();


       int integer = 2; 
	
       System.out.println("The Diameter is: " + integer * radius );
       System.out.println("The Circumference is: " + integer * Math.PI * radius);
       System.out.println("The Area is: " + Math.PI * radius * radius);

  }
}
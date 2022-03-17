package chapterTwo;

import java.util.Scanner;
public class ComparingIntegers{
       public static void main(String [] args){
       Scanner input = new Scanner(System.in);

       int D = 100;

       System.out.print("Enter the integer: ");
       int comparer = input.nextInt();

       int Comparism = comparer * comparer;
       
       if( comparer > D){System.out.println( comparer > D );}
       if( Comparism > D){System.out.println( Comparism > D );}

       if( comparer < D){System.out.println( comparer < D );}
       if( Comparism < D){System.out.println( Comparism < D );}

       if( comparer == D){System.out.println( comparer == D );}
       if( Comparism == D){System.out.println( Comparism == D );}

       if( comparer != D){System.out.println( comparer != D );}
       if( Comparism != D){System.out.println( Comparism != D );}
       
  }
}
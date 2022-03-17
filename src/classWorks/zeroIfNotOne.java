package classWorks;

import java.util.Scanner;
public class zeroIfNotOne {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int y = input.nextInt();

        int output = 1;
        int output2 = 0;


        if ( y == 1)
            System.out.print(  output2 );
        if ( y < 1)
            System.out.print(  output);


    }
}

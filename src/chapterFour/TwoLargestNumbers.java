package chapterFour;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int largest1 = 1;
        int largest2 = 1;
        while (counter <= 10){
            System.out.println("Enter the number;");
            int number = input.nextInt();

            if(number>largest1){
                largest2 =largest1;
                largest1 = number;
            }

                else {
                    if( number > largest2)
                        largest2 = number;
                }
                counter++;
            }

        System.out.println("The largest numbers are " + largest1 + " and " + largest2);
        }
    }

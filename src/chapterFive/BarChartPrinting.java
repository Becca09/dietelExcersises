package chapterFive;

import java.util.Scanner;

public class BarChartPrinting {
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            int userInput;



            System.out.println("Enter input1 (between 1 - 30): ");

            userInput = input.nextInt();

            validate(userInput, input);

            displayAsterics(userInput);




            System.out.println("Enter input2 (between 1 - 30): ");

            userInput = input.nextInt();

            validate(userInput, input);

            displayAsterics(userInput);




            System.out.println("Enter input3 (between 1 - 30): ");

            userInput = input.nextInt();

            validate(userInput, input);

            displayAsterics(userInput);




            System.out.println("Enter input4 (between 1 - 30): ");

            userInput = input.nextInt();

            validate(userInput, input);

            displayAsterics(userInput);



            System.out.println("Enter input5 (between 1 - 30): ");

            userInput = input.nextInt();

            validate(userInput, input);

            displayAsterics(userInput);


        }

        public static int validate(int userInput, Scanner input){
            while(userInput < 1 || userInput > 30){
                System.out.println("Wrong input, Enter input again (between 1 - 30): ");
                userInput = input.nextInt();
            }
            return userInput;
        }



        public static void displayAsterics(int userInput){
            for(int i = 0; i<userInput; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



package chapterTwo;

import java.util.Scanner;

public class PyramidOfGiza {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the estimated numbers of stones used to build the great Giza: ");
            double numberOfStones = input.nextDouble();

            System.out.print("Enter the average weight of each stone: ");
            double avgWeight = input.nextDouble();

            System.out.print("Enter the number of years taken to build the pyramid: ");
            double noOfYears = input.nextDouble();

            double estimate = numberOfStones * avgWeight / (noOfYears);

            System.out.printf("About %f tons of the pyramid was built each year%n", estimate);
            System.out.printf("About %f tons of the pyramid was built each hour%n", estimate/(365 * 24));
            System.out.printf("About %f tons of the pyramid was built each minute", estimate/(365 * 24 * 60));

        }
    }


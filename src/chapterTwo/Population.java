package chapterTwo;

import java.util.Scanner;

public class Population {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print ("Enter Current World Population: ");
            double currentPopulation = input.nextDouble();

            System.out.print ("Enter Annual Population Growth Rate: ");
            double growthRate = input.nextDouble();

            double annualPopIncrease = (growthRate / 100) * currentPopulation;
            double estimatedPopulation = currentPopulation + annualPopIncrease;

            System.out.printf("Estimated world population after one year:%f%n", estimatedPopulation);
            System.out.printf("Estimated world population after two years:%f%n", (estimatedPopulation + (annualPopIncrease * 2)));
            System.out.printf("Estimated world population after three years:%f%n", (estimatedPopulation + (annualPopIncrease * 3)));
            System.out.printf("Estimated world population after four years:%f%n", (estimatedPopulation + (annualPopIncrease * 4)));
            System.out.printf("Estimated world population after five years:%f%n", (estimatedPopulation + (annualPopIncrease * 5)));

    }
}

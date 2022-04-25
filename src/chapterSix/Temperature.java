package chapterSix;

import java.util.Scanner;

public class Temperature {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String option = """
                1 --> Celsius
                2 --> Fahrenheit
                """;
        System.out.println(option + ("\nEnter a number"));
        int number = input.nextInt();

        if (number == 1) {
            calculatingCelsius();
        } else {
            calculatingFahrenheit();
        }
    }
    public static void calculatingFahrenheit() {
        System.out.println("Enter the number");
        int celsius = input.nextInt();
         double fahrenheit =  (9.0 / 5.0 * celsius + 32);
        System.out.println("The fahrenheit is " + fahrenheit);
    }

    public static void calculatingCelsius() {
        System.out.println("Enter the number");
       int fahrenheit = input.nextInt();
        double celsius =  (5.0 / 9.0 * (fahrenheit - 32));
        System.out.println("The celsius is " + celsius);
    }

}


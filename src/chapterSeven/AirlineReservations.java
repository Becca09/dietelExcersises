package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class AirlineReservations {
   static Scanner keyboard = new Scanner(System.in);
    static final boolean[] airlineReservation = new boolean[10];
    static int countA = 1;
    static int countB = 6;
   static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            makeReservation();
        }
        printReservationStatus();
    }

    private static void getName() {
        System.out.println("Kindly input your name");
        String name = keyboard.nextLine();
        System.out.println("Welcome  " + name);
    }

    private static void makeReservation() {
        getName();
        System.out.println("""
                1. Enter 1 for First class
                2. Enter 2 for Economy""");
        int options = input.nextInt();
        if (options == 1) {
            firstClass();
        } else if (options == 2) {
            economyClass();
        } else makeReservation();
    }

    private static void firstClass() {

        if (countA < 6) {
            airlineReservation[countA] = true;
            System.out.print("""
                            Dear""' Here is your boarding details
                            --> your sit number is   """ + "  " +  "00" + countA++  + "  "  +
                               """
                                    of the first class section
                                    """);

        } else {
            System.out.println("oops! First class section is fully booked");
            System.out.println("Would you like to  reserve a seat in the Economy class?");
            System.out.println("(Type Yes or No)");
            input.nextLine();
            String option = input.nextLine();
            if (option.toUpperCase().equals("YES")) {
                economyClass();
            } else if (option.toUpperCase().equals("NO")) {
                System.out.println("Next flight leaves in 3 hours.");
            }
        }
    }

    private static void economyClass() {
        if (countB > 5 && countB < 10) {
            airlineReservation[countB] = true;
            System.out.println(
                    """
                            Here is your boarding details
                            --> your sit number is   """  + "  "   + "00" + countB++ + "  "  +
                                      """
                                    of the economy class section
                                    """);

        } else {
            System.out.println("oops!  Economy class section is fully booked");
            System.out.println(" Would you like to reserve a seat in the First class?");
            System.out.println("(Type Yes or No)");
            input.nextLine();
            String option = input.nextLine();
            if (option.toUpperCase().equals("YES")) {
                firstClass();
            } else if (option.toUpperCase().equals("NO")) {
                System.out.println("Next flight leaves in 3 hours.");
            }

        }
    }


    public static void printReservationStatus() {
        System.out.print("Seat reservation status: ");
        System.out.println(Arrays.toString(airlineReservation));
    }

}

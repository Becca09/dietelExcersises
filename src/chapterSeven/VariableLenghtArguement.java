package chapterSeven;

import java.util.Scanner;

public class VariableLenghtArguement {
    public static void main(String[] args) {
        System.out.println(average(44,34,56,67,89));
        System.out.println(average(12,15));
        System.out.println(average(23,67,65));
    }

    public static double average(int... numbers){
        int total = 0;
        for (int number: numbers){
            total += number;
        }
        return total * 1.0/ numbers.length;
    }
}

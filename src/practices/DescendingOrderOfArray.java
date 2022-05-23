package practices;

import java.util.Scanner;

public class DescendingOrderOfArray {
    static Scanner collector = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteger = getIntegers();
        int[] sorted = sortIntegers(myInteger);
        printArrays(sorted);
    }

    private static int[] getIntegers() {
        int[] array = new int[5];
        System.out.println("enter " + 5 + " integers");
        for (int i = 0; i < array.length; i++) {
            array[i] = collector.nextInt();
        }
        return array;
    }

    private static void printArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("the element in " + i + " is " + array[i]);
        }
    }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        int temp;
            for (int i = 0; i < sortedArray.length; i++)   //Holds each Array element
            {
                for (int j = i + 1; j < sortedArray.length; j++)    //compares with remaining Array elements
                {

                    if (sortedArray[i] < sortedArray[j]) //Compare and swap
                    {
                        // sawapping from right to left
                        temp = sortedArray[i];
                        sortedArray[i] = sortedArray[j];
                        sortedArray[j] = temp;
                    }
                }
            }
            return sortedArray;
        }

    }


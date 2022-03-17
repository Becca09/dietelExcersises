package tddClass;
import java.util.Scanner;

public class Kata {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int result = 0;
        if (secondNumber > firstNumber) {
            result = secondNumber - firstNumber;
        }
        if (firstNumber > secondNumber) {
            result = firstNumber - secondNumber;
        }
        return result;
    }

    public double findAreaWith(int radius) {
        return (22 * radius * radius) / 7.0;
    }

    public int flip(int bit) {
        int result = 0;
        if (bit == 0)
            return 1;
        if (bit == 1)
            return 0;
        return result;
    }


    public boolean isPalindrome(int theNumber) {
        int mod1 = theNumber % 10;
        int mod2 = theNumber % 100;
        int mod3 = theNumber % 1000;
        int mod4 = theNumber % 10000;
        int mod5 = theNumber % 100000;
        int new5 = mod5 / 10000;
        int new4 = mod4 / 1000;
        int new3 = mod3 / 100;
        int new2 = mod2 / 10;
        int new1 = mod1 / 1;

        if (new1 == new5) ;
        if (new2 == new4) ;
        if (new3 == new3) ;
        return true;

    }

    public int putme(int noOfCopies) {
        if (noOfCopies > 0 && noOfCopies <= 4) {
            return noOfCopies * 2000;
        } else if (noOfCopies >= 5 && noOfCopies <= 9) {
            return noOfCopies * 1800;
        } else if (noOfCopies >= 10 && noOfCopies <= 29) {
            return noOfCopies * 1600;
        } else if (noOfCopies >= 30 && noOfCopies <= 49) {
            return noOfCopies * 1500;
        } else if (noOfCopies >= 50 && noOfCopies <= 99) {
            return noOfCopies * 1300;
        } else if (noOfCopies >= 100 && noOfCopies <= 199) {
            return noOfCopies * 1200;
        } else if (noOfCopies >= 200 && noOfCopies <= 499) {
            return noOfCopies * 1100;
        } else if (noOfCopies >= 500) {
            return noOfCopies * 1000;
        } else return 0;
    }

    public int twoNumber(int firstValue, int secondValue) {
        if(firstValue >= secondValue)
        return  firstValue / secondValue;
        else
            return secondValue / firstValue;
    }
}



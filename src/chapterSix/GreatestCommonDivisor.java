package chapterSix;

import java.util.Random;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(10, 100);
        int b = rand.nextInt(10, 100);

        int gcd = greatestCommonDivisor(a, b);

      
     System.out.println("The GCD of " + a + " and " + b + " is:  " + gcd);

    }
    private static int greatestCommonDivisor(int a, int b) {
        int value = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                value = i;
            }

        }
        return value;
    }
}





package chapterSix;

public class PrimeNumbers {
    public static void main(String[] args) {
        isPrime(7);
        isPrime(27);
        isPrime(70);
        isPrime(19);

        for (int i = 0; i <= 10000; i++) {
            System.out.println(isPrime(i));
        }

    }

    public static boolean isPrime(int number) {
        int count = 0;

        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count += 1;
            }
        }
        if (count <= 1) {
            System.out.println(number + " is a Prime Number ");
            System.out.println();
            System.out.println();
            return true;

        } else
            System.out.println(number + " is not a prime number ");
            System.out.println();
            System.out.println();
        return false;

    }

    ;
}

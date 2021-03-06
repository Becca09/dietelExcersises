package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    @Test
    public void addTest() {
        Kata calculator = new Kata();
        int result = calculator.add(4, 8);

        assertEquals(12, result);

    }

    @Test
    public void subtractionTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(7, 2);

        assertEquals(5, result);
    }

    @Test
    public void absoluteSubtractionTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(2, 7);
        assertEquals(5, result);
    }

    @Test
    public void calculateAreaTest() {
        Kata circle = new Kata();
        double result = circle.findAreaWith(7);
        assertEquals(154.0, result);
    }

    @Test
    public void bitFlipper() {
        Kata flipper = new Kata();
        int result = flipper.flip(0);
        assertEquals(1, result);
    }

   /* @Test
    public void palindromeTest(){
        Kata user1 = new Kata();
        boolean result = user1.KataIsPalindrome(12321);
        assertTrue( result );
        assertEquals(true,result);

    }*/

    @Test
    public void palindromeTest() {
        Kata kata = new Kata();
       /* boolean result = kata.isPalindrome(12345);
        assertEquals(false, result);*/
        boolean result = kata.isPalindrome(11211);
        assertEquals(true, result);
    }

    @Test
    public void utmeTest() {
        Kata utme = new Kata();
        int result = utme.putme(600);

        assertEquals(600000, result);
    }

    @Test
    public void quotientTest() {
        Kata quotient = new Kata();
        int result = quotient.twoNumber(50, 25);
        assertEquals(2, result);
    }

    //    @Test
//            public void test(){}
//    int number = 2
//            while (number <= 10)
//                System.out.print(())
    @Test
    public void evenNumberTest() {
        Kata check = new Kata();
        boolean result = check.isEven(10);
        assertTrue(result);
    }

    @Test
    public void highestNumberTest() {
        Kata high = new Kata();
        int result = high.calculateHighestNumber(10, 20, 30, 40, 50);
        assertEquals(50, result);
    }

    @Test

    public void factorTest() {
        Kata actualFactor = new Kata();
        int result = actualFactor.facctorsOf(30);
        assertEquals(8, result);
    }

    @Test

    public void primeNumberTest() {
        Kata prime = new Kata();
        boolean result = prime.primeNumber(100);
        assertFalse(result);
    }

    @Test

    public void maximumNumberInArrayTest() {
        int[] scores = {34, 23, 14, 45, 23};
        assertEquals(45, Kata.findMaximumFrom(scores));
    }

    @Test
    public void minimumNumberInArrayTest() {
        int[] scores = {34, 23, 14, 45, 23};
        assertEquals(14, Kata.findMinimumFrom(scores));
    }

    @Test
    public void averageNumberInArrayTest() {
        int[] scores = {34, 23, 14, 45, 23};
        assertEquals(27.0, Kata.findAverageFrom(scores));
    }

}

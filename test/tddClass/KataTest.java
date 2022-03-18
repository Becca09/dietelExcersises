package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    @Test
    public void addTest() {
        Kata calculator = new Kata();
        int result = calculator.add(4, 3);

        assertEquals(7, result);

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
}

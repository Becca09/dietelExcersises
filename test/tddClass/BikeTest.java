package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void testStartBike() {
        //given
        Bike powerBike = new Bike();

        //when
        powerBike.start(true);

        //assert
        assertTrue(powerBike.isOn());

    }

    @Test
    public void testOffBike() {
        //given
        Bike powerBike = new Bike();

        //when
        powerBike.start(false);

        //assert
        assertFalse(powerBike.isOn());

    }

    @Test
    public void incrementBy0ne() {
        //given
        Bike powerBike = new Bike();

        //when
        powerBike.start(true);
        assertTrue(powerBike.isOn());

        int i = 0;
        while (i < 20) {
            powerBike.increaseAccelerationOne();
            i++;
        }

        //assert
        assertEquals(20, powerBike.getIncrementLevel());

    }

    @Test
    public void incrementByTwo() {
        //given
        Bike powerBike = new Bike();

        //when
        powerBike.start(true);
        assertTrue(powerBike.isOn());

//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();
//        powerBike.increaseAccelerationOne();

        int i = 0;
        while (i < 21) {
            powerBike.increaseAccelerationOne();
            i++;
        }

        assertEquals(21, powerBike.getIncrementLevel());

//        powerBike.increaseAccelerationTwo();
//        powerBike.increaseAccelerationTwo();
//        powerBike.increaseAccelerationTwo();
//        powerBike.increaseAccelerationTwo();
//        powerBike.increaseAccelerationTwo();
        int a = 0;
        while (a < 5){
            powerBike.increaseAccelerationTwo();
            a++;
        }

        assertEquals(31, powerBike.getIncrementLevel());

    }

    @Test
    public void incrementByThree() {
        //given
        Bike powerBike = new Bike();

        //when
        powerBike.start(true);
        assertTrue(powerBike.isOn());


        for (int i = 0; i < 21; i++) {
            powerBike.increaseAccelerationOne();
        }
        assertEquals(21, powerBike.getIncrementLevel());

//        powerBike.increaseAccelerationTwo();
//        powerBike.increaseAccelerationTwo();
//        powerBike.increaseAccelerationTwo();
//        powerBike.increaseAccelerationTwo();
//        powerBike.increaseAccelerationTwo();
        for(int a =0; a < 5; a++){
            powerBike.increaseAccelerationTwo();
        }
        assertEquals(31, powerBike.getIncrementLevel());


//        powerBike.increaseAccelerationThree();
//        powerBike.increaseAccelerationThree();
//        powerBike.increaseAccelerationThree();
//        powerBike.increaseAccelerationThree();
        for (int i = 0; i < 4; i++) {
            powerBike.increaseAccelerationThree();
        }
        assertEquals(43, powerBike.getIncrementLevel());

    }

    @Test
    public void incrementByFour() {
        //given
        Bike powerBike = new Bike();

        //when
        powerBike.start(true);
        assertTrue(powerBike.isOn());


        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        assertEquals(21, powerBike.getIncrementLevel());

        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        assertEquals(31, powerBike.getIncrementLevel());


        powerBike.increaseAccelerationThree();
        powerBike.increaseAccelerationThree();
        powerBike.increaseAccelerationThree();
        powerBike.increaseAccelerationThree();
        assertEquals(43, powerBike.getIncrementLevel());

        powerBike.increaseAccelerationFour();
        assertEquals(47, powerBike.getIncrementLevel());

    }

    @Test
    public void decrementByFour() {
        //given
        Bike powerBike = new Bike();

        //when
        powerBike.start(true);
        assertTrue(powerBike.isOn());

        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        assertEquals(21, powerBike.getIncrementLevel());

        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        assertEquals(31, powerBike.getIncrementLevel());


        powerBike.increaseAccelerationThree();
        powerBike.increaseAccelerationThree();
        powerBike.increaseAccelerationThree();
        powerBike.increaseAccelerationThree();
        assertEquals(43, powerBike.getIncrementLevel());

        powerBike.increaseAccelerationFour();
        assertEquals(47, powerBike.getIncrementLevel());
        powerBike.reduceAccelerationFour();

        //assert
        assertEquals(43, powerBike.getDecrementLevel());

    }

    @Test
    public void decrementByThree() {
        //given
        Bike powerBike = new Bike();

        //when
        powerBike.start(true);
        assertTrue(powerBike.isOn());

        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        assertEquals(21, powerBike.getIncrementLevel());

        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        assertEquals(31, powerBike.getIncrementLevel());


        powerBike.increaseAccelerationThree();
        powerBike.increaseAccelerationThree();
        powerBike.increaseAccelerationThree();
        powerBike.increaseAccelerationThree();
        assertEquals(43, powerBike.getIncrementLevel());

        powerBike.increaseAccelerationFour();
        assertEquals(47, powerBike.getIncrementLevel());

        powerBike.reduceAccelerationThree();

        //assert
        assertEquals(44, powerBike.getDecrementLevel());

    }

    @Test
    public void decrementByTwo() {
        //given
        Bike powerBike = new Bike();

        //when
        powerBike.start(true);
        assertTrue(powerBike.isOn());

        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        assertEquals(21, powerBike.getIncrementLevel());

        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        assertEquals(31, powerBike.getIncrementLevel());


        powerBike.increaseAccelerationThree();
        powerBike.increaseAccelerationThree();
        powerBike.increaseAccelerationThree();
        powerBike.increaseAccelerationThree();
        assertEquals(43, powerBike.getIncrementLevel());

        powerBike.increaseAccelerationFour();
        assertEquals(47, powerBike.getIncrementLevel());
        powerBike.reduceAccelerationTwo();

        //assert
        assertEquals(45, powerBike.getDecrementLevel());

    }

    @Test
    public void decrementByone() {
        //given
        Bike powerBike = new Bike();

        //when
        powerBike.start(true);
        assertTrue(powerBike.isOn());

        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        powerBike.increaseAccelerationOne();
        assertEquals(21, powerBike.getIncrementLevel());

        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        powerBike.increaseAccelerationTwo();
        assertEquals(31, powerBike.getIncrementLevel());


        powerBike.increaseAccelerationThree();
        powerBike.increaseAccelerationThree();
        powerBike.increaseAccelerationThree();
        powerBike.increaseAccelerationThree();
        assertEquals(43, powerBike.getIncrementLevel());

        powerBike.increaseAccelerationFour();

        assertEquals(47, powerBike.getIncrementLevel());
        powerBike.reduceAccelerationOne();

        //assert
        assertEquals(46, powerBike.getDecrementLevel());

    }

    @Test
    public void gearTestOne() {
        //given
        Bike powerBike = new Bike();

        //when
        powerBike.start(true);
        assertTrue(powerBike.isOn());

        powerBike.gearTest(20);

        //assert
        assertEquals("Gear1", powerBike.getGear());

    }

    @Test
    public void gearTestTwo() {
        //given
        Bike powerBike = new Bike();

        //when
        powerBike.start(true);
        assertTrue(powerBike.isOn());

        powerBike.gearTest(26);

        //assert
        assertEquals("Gear2", powerBike.getGear());

    }

    @Test
    public void gearTestThree() {
        //given
        Bike powerBike = new Bike();

        //when
        powerBike.start(true);
        assertTrue(powerBike.isOn());

        powerBike.gearTest(35);

        //assert
        assertEquals("Gear3", powerBike.getGear());

    }

    @Test
    public void gearTestFour() {
        //given
        Bike powerBike = new Bike();

        //when
        powerBike.start(true);
        assertTrue(powerBike.isOn());

        powerBike.gearTest(50);

        //assert
        assertEquals("Gear4", powerBike.getGear());

    }
}

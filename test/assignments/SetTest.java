package assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {
    @Test
    void sumOfDistinctFigure(){
        Set set = new Set();
        int[] array = {3, 7, 1, 9};
        int[] array2 = {2, 4, 1, 9, 3};
        int result = set.sumOfDistinctFigure(array, array2);
        assertEquals(13, result);
    }

    @Test
    void sumOfOverlappingElement(){
        Set set = new Set();
        int[] array = {12, 13, 6, 10};
        int[] array1 = {13, 10, 16, 15};
        int result = set.sumOfOverlappingElement(array, array1);
        assertEquals(46, result);
    }

}
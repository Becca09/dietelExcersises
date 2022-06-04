package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerTest {

    @Test
    void parse() {
        String value = "11250";
        HugeInteger hugeInteger = HugeInteger.parse(value);
        assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 5, 0]", hugeInteger.toString());
    }

    @Test
    void add() throws HugeIntegerException {
        String valueOne = "90456";
        HugeInteger hugeInteger = HugeInteger.parse(valueOne);
        String valueTwo = "12000";
        HugeInteger hugeIntegerTwo = HugeInteger.parse(valueTwo);
        HugeInteger sum = hugeInteger.add(hugeIntegerTwo);
        assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 4, 5, 6]", sum.toString());
    }

    @Test
    void subtract(){
        String valueOne = "902";
        HugeInteger hugeInteger = HugeInteger.parse(valueOne);
        String valueTwo = "999";
        HugeInteger hugeIntegerTwo = HugeInteger.parse(valueTwo);
        assertThrows(HugeIntegerException.class, () -> hugeInteger.subtract(hugeIntegerTwo));
    }
}
package practices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsogramTest {
    @Test
    public void FixedTests() {
        assertEquals(true, Isogram.checkIfLetterIsIsogram("Dermatoglyphics"));
        assertEquals(true, Isogram.checkIfLetterIsIsogram("isogram"));
        assertEquals(false, Isogram.checkIfLetterIsIsogram("moose"));
        assertEquals(false, Isogram.checkIfLetterIsIsogram("isIsogram"));
        assertEquals(false, Isogram.checkIfLetterIsIsogram("aba "));
        assertEquals(false, Isogram.checkIfLetterIsIsogram("moOse"));
        assertEquals(true, Isogram.checkIfLetterIsIsogram("thumbscrewjapingly"));
        assertEquals(true, Isogram.checkIfLetterIsIsogram("bom"));
    }

}
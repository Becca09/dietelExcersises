package chapterSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {
    @Test

    void testThatWeCanCheckForDuplicates(){
        assertTrue(DuplicateElimination.checkDuplicates(new int[]{1, 5}, 5));
        assertFalse(DuplicateElimination.checkDuplicates(new int[]{1, 5}, 6));
    }

}
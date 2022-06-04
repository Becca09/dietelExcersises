package dataStructureAlgorithm;

import classWorks.ContentAlreadyExist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {
    private Set set;

    @BeforeEach
    public void setUp() {
        set = new Set();
    }

    @Test
    public void testThatSetExist() {
        assertNotNull(set);
    }

    @Test
    public void testThatSetIsEmpty() {
        assertTrue(set.isEmpty());
    }

    @Test
    public void setIsNotEmpty() {
        set.add(100);
        assertFalse(set.isEmpty());
    }

    @Test
    public void testThatYouCanAddToSet() {
        set.add(12);
        set.add(32);
        set.add(15);
        set.add(120);
        assertEquals(5, set.sizeOfSet());
    }

    @Test
    public void testThatYouCanGetAnElement(){
        set.add(12);
        set.add(32);
        set.add(15);
        set.add(120);
        assertEquals(120, set.get(3));
    }
    @Test
    public void testThatElementCannotBeDuplicated(){
        set.add(12);
        set.add(32);
        set.add(15);
        set.add(120);
        ContentAlreadyExist exception =assertThrows(ContentAlreadyExist.class, () -> set.add(12));
    }

    @Test
    public void testThatElementAlreadyExistInSet(){
        set.add(12);
        set.add(32);
        set.add(15);
        set.add(120);
        assertTrue(set.contain(120));
    }

    @Test
    public void testThatYouCanClearAllElement(){
        set.add(12);
        set.add(32);
        set.add(15);
        set.add(120);
        set.clearAll();
        assertEquals(0, set.sizeOfSet());
    }

    @Test
    public void testThatElementCanBeRemoved(){
        set.add(12);
        set.add(32);
        set.add(15);
        set.add(120);
        set.remove(12);
        assertEquals(3, set.sizeOfSet());
    }
}
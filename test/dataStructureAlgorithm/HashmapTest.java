package dataStructureAlgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HashmapTest {
    private HashMapMain nigerianMeal;

    @BeforeEach
    void setUp() {
        nigerianMeal = new HashMapMain();
    }
    @Test
    void TestThatHashMapCanBeCreated(){
        assertNotNull( nigerianMeal);
    }

    @Test
    public void testThatHashMapIsEmpty(){
        assertEquals(0, nigerianMeal.size());
    }

    @Test
    public void testThatHashMapCanPutKeyAndValue(){
        nigerianMeal.put("amala", "gbegiri");
        assertEquals(1, nigerianMeal.size());
    }

    @Test
    public void testThatKeyAndValueAreSaved(){
        nigerianMeal.put("amala", "gbegiri");
        String found = nigerianMeal.findBy("amala");
        assertEquals("gbegiri" , found);
    }
    @Test
    public void testThatHashMapDontTakeDuplicateKeys_butReplacesItsValue(){
        nigerianMeal.put("amala", "gbegiri");
        nigerianMeal.put("name", "funmi");
        nigerianMeal.put("amala", "efo");
        assertEquals(2, nigerianMeal.size());
    }

}

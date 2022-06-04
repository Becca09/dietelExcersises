package dataStructureAlgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LinkedListTest {
    @Test
    void testThatLinkedListCanBeCreated() {
        LinkedList<String> list = new LinkedList<>();
        Assertions.assertNotNull(list);
    }

    @Test
    void testThatLinkedListIsNotEmpty() {
        LinkedList<String> list = new LinkedList<>();
        assertEquals(0, list.size());
    }

    @Test
    void testAddToLinkedList(){
        LinkedList<String> list = new LinkedList<>();
        list.add("sheem");
        assertEquals(1, list.size());
    }
}

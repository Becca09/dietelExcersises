package dataStructureAlgorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


public class QueueTest {
    private Queue queue;

    @BeforeEach

    public void setUp() {
        queue = new Queue();
    }

    @Test
     void testThatQueueCanBeCreated() {
        assertNotNull(queue);
    }
    @Test
    void testThatQueueIsEmpty(){
        assertTrue(queue.isEmpty());
    }

    @Test
    void testThatQueueIsNotEmpty(){
        queue.enqueue(30);
        assertFalse(queue.isEmpty());
    }

    @Test
    void testThatYouCanAddToQueue(){
        queue.enqueue(300);
        queue.enqueue(200);
        queue.enqueue(400);
        queue.enqueue(600);
        queue.enqueue(500);
        queue.enqueue(700);

    }

}

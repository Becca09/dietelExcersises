package dataStructureAlgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementingAnArrayListTest {

    @Test
    public void testThatArrayListExist() {
        ImplementingAnArrayList shelf = new ImplementingAnArrayList();
        assertNotNull(shelf);
    }

    @Test
    public void testThatBooksCanBeAddedToShelf() {
        ImplementingAnArrayList shelf = new ImplementingAnArrayList();
        shelf.add("Java Design Patterns");
        assertEquals(1, shelf.size());

    }

    @Test
    public void TestToGetBookBIndex() {
        ImplementingAnArrayList shelf = new ImplementingAnArrayList();
        shelf.add("Java Design Patterns");
        shelf.add("python Design Patterns");
        shelf.add("JS Design Patterns");
        shelf.add("DBS Design Patterns");
        assertEquals("JS Design Patterns", shelf.get(2));
    }

   @Test public void testThatMoreThan10BooksCanBeAddedToShelf() {
        ImplementingAnArrayList shelf = new ImplementingAnArrayList();
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        assertEquals(18, shelf.size());

    }

    @Test public void testThatYouCanADDBooksByIndex(){
        ImplementingAnArrayList shelf = new ImplementingAnArrayList();
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");
        shelf.add("Java Design Patterns");

        shelf.add(3, "java yayay");
        assertEquals("java yayay", shelf.get(3));
    }

    @Test
    public void TestThatBooksCanBeRemovedWithIndex() {
        ImplementingAnArrayList shelf = new ImplementingAnArrayList();
        shelf.add("Java Design Patterns");
        shelf.add("python Design Patterns");
        shelf.add("JS Design Patterns");
        shelf.add("DBS Design Patterns");
        shelf.remove("JS Design Patterns");
        assertEquals(3,shelf.size());
    }

   @Test public void TestThatBooksCanBeRemovedWithString() {
        ImplementingAnArrayList shelf = new ImplementingAnArrayList();
        shelf.add("Java Design Patterns");
        shelf.add("python Design Patterns");
        shelf.add("JS Design Patterns");
        shelf.add("DBS Design Patterns");
        shelf.remove(2);
        assertEquals(3,shelf.size());
    }


}
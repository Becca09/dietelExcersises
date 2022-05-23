package assignments.Diary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    @Test
    public void testThatDiaryCanBeCreated() {
        Diary jenifer = new Diary("Jenifer's Diary", "2345", "baby@gmail.com");
        assertInstanceOf(Diary.class, jenifer);
        assertNotNull(jenifer);
    }


    @Test
    public void testThatAnEntryCanBeAddedToDiary() {
        Entry entry = new Entry("story of my life at semicolon", "i met tobi, tobi met me. Chibuzor is wicked");
        Entry entry1 = new Entry("how met her", "on the runway");
        Entry entry2 = new Entry("how met her", "on the runway");
        Entry entry3 = new Entry("how met her", "on the runway");
        Entry entry4 = new Entry("how met her", "on the runway");
        Diary jenifer = new Diary("Jenifer's Diary", "2345", "baby@gmail.com");
        jenifer.addEntry(entry);
        jenifer.addEntry(entry1);
        jenifer.addEntry(entry2);
        jenifer.addEntry(entry3);
        jenifer.addEntry(entry4);
        assertEquals(4, jenifer.getNumberOfEntries());
    }

    @Test
    public void testThatEntryCanBeSearched() {
        Entry entry = new Entry("story of my life at semicolon", "i met tobi, tobi met me. Chibuzor is wicked");
        Entry entry1 = new Entry("how met her", "on the runway");
        Entry entry2 = new Entry("how met him", "on the runway");
        Entry entry3 = new Entry("how he met her", "on the runway");
        Entry entry4 = new Entry("how she met him", "on the runway");
        Diary jenifer = new Diary("Jenifer's Diary", "2345", "babyd@gmail.com");
        jenifer.addEntry(entry);
        jenifer.addEntry(entry1);
        jenifer.addEntry(entry2);
        jenifer.addEntry(entry3);
        jenifer.addEntry(entry4);
        Entry foundEntry = jenifer.searchEntry("how she met him");
        assertNotNull(foundEntry);
    }

    @Test
    public void testThatAnEntryCanBeDeleted() {
        Entry entry = new Entry("story of my life at semicolon", "i met tobi, tobi met me. Chibuzor is wicked");
        Diary jenifer = new Diary("Jenifer's Diary", "2345", "babyd@gmail.com");
        jenifer.addEntry(entry);
        jenifer.deleteEntry("story of my life at semicolon");
        assertEquals(0, jenifer.getNumberOfEntries());

    }

}
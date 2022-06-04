package chapterNine.bookHierarchy;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Java" ,"Aunty B" ,"19Gogoro");

        System.out.println();

        System.out.println(book);

        AudioBook audioBook = new AudioBook("python","1679",
                "Anjola",10.9,100.01,"The gods");
        System.out.println(audioBook);


        PrintedBook printedBook =new PrintedBook("How to do money ritual and go to heaven", "2020", "Earnest",
                "Edo publisher","2020");

        System.out.println();

        System.out.println(printedBook);
    }



}

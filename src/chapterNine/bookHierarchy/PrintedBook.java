package chapterNine.bookHierarchy;

public class PrintedBook extends Book{
    private String publisher;
    private String ISBN;

    public String getPublisher() {
        return publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public PrintedBook(String title, String yearOfPublication, String author, String publisher, String ISBN) {
        super(title, yearOfPublication, author);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }
    @Override
    public String toString() {
        return "Book{" +
                ", author='" + getAuthor() + '\'' +
                ", title='" + getTitle() + '\'' +
                "yearOfPublication='" + getYearOfPublication() + '\'' +
                "publisher='" + getPublisher()+ '\'' +
                ", ISBN='" + getISBN()+ '\'' +
                '}';

    }
}

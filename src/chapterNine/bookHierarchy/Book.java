package chapterNine.bookHierarchy;

public class Book {
    private String yearOfPublication;
    private String author;
    private String title;


    public Book(String title, String yearOfPublication, String author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }



    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                ", author='" + getAuthor() + '\'' +
                ", title='" + getTitle() + '\'' +
                "yearOfPublication='" + getYearOfPublication() + '\'' +

                '}';
    }
}

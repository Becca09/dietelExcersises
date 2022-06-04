package chapterNine.bookHierarchy;

public class AudioBook extends Book {

    private double bookSize;
    private double playLength;
    private String artistName;


    public AudioBook(String title, String yearOfPublication, String author, double bookSize, double playLength, String artistName) {
        super(title, yearOfPublication, author);
        this.bookSize = bookSize;
        this.playLength = playLength;
        this.artistName = artistName;
    }


    public double getBookSize() {
        return bookSize;
    }

    public double getPlayLength() {
        return playLength;
    }

    public String getArtistName() {
        return artistName;
    }


    @Override
    public String toString() {
        return "Book{" +
                ", author='" + getAuthor() + '\'' +
                ", title='" + getTitle() + '\'' +
                "yearOfPublication='" + getYearOfPublication() + '\'' +
                "bookSize=" + getBookSize() + '\'' +
                ", playLength=" + getPlayLength() + '\'' +
                ", artistName='" + getArtistName() + '\'' +
                '}';
    }
}

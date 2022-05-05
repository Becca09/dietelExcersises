package assignments.Diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private String body;
    private String timeStamp;
    private String title;

    public String getTitle() {
        return title;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getBody() {
        return body;
    }


    public Entry(String title, String body) {
        this.title = title;
        this.body = body;

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd-MM-yyyy, hh:mm a");
        timeStamp = dateTimeFormatter.format(LocalDateTime.now());

    }

    @Override
    public String toString() {
        return String.format("""
                Date: %s
                                
                Title: %s
                                
                Body:
                %s%n""", getTimeStamp(), getTitle(), getBody());

    }
}

package assignments.Diary;

import java.util.ArrayList;

public class Diary {

    private String name;
    private String password;
    private String email;

    private ArrayList<Entry> entries;

    public String getName() {
        return name;
    }

    public Diary(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
        entries = new ArrayList<>();
    }

    public Entry createEntry(String title, String body){
        return new Entry(title,body);
    }
    public void addEntry(Entry entry) {
        entries.add(entry);

    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public Entry searchEntry(String title) {
        for (Entry entry:entries) {
            if (title.equals(entry.getTitle())){
                return entry;
            }
        }
        return null;
    }
    public void viewAllEntries() {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            System.out.println(entry.getTitle());
            System.out.println("===============================");
        }

    }

    public boolean deleteEntry(String title) {
        for (Entry entry : entries) {
            if (title.equals(entry.getTitle())) {
                entries.remove(entry);
                return true;
            }
        }
        return  false;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
//(Objects.equals(title, entry.getTitle()))

package assignments.Diary;

import java.util.Scanner;

public class DiaryMainClass {

    private static Scanner keyboardInput = new Scanner(System.in);
    private static Diary diary;

    public static void main(String[] args) {
        signUpDetails();
        signIn();
    }

    private static void signIn() {
        System.out.println("Welcome back " + diary.getName());

        System.out.println("Enter password");
        String password =  keyboardInput.nextLine();

        if (password.equals(diary.getPassword())){
            runDiary();
        }
        else {System.out.println("incorrect password");
        signIn();}
    }

    private static void signUpDetails(){
        System.out.println("Create username: ");
        String userName = keyboardInput.nextLine();

        System.out.println("Create password: ");
        String password = keyboardInput.nextLine();

        System.out.println("add email address: ");
        String email_address = keyboardInput.nextLine();

        diary = new Diary(userName,password,email_address);
    }
    private static void runDiary() {
        System.out.println("Welcome!");
        boolean quit = false;
        while(!quit){
        String prompt = """
                 Enter
                 1. -> Create new entry
                 2. -> Search Entry
                 3. -> Delete Entry
                 4. -> View all entries
                 5. -> exit
                 """;
        System.out.println(prompt);
        int userResponse = keyboardInput.nextInt();
        keyboardInput.nextLine();
        switch (userResponse){
            case 1 -> createAnEntry();
            case 2 -> searchAnEntry();
            case 3 ->  deleteAnEntry();
            case 4 ->  viewAllEntries();
            case 5 -> {
                System.out.println("Bye");
                quit = true;
            }

            default -> runDiary();}
        }
    }

    private static void viewAllEntries() {
        diary.viewAllEntries();
    }

    private static void deleteAnEntry() {
        System.out.println("Enter the title of the entry: ");
        String title = keyboardInput.nextLine();

       if(diary.deleteEntry(title)){
           System.out.println("Entry successfully deleted");
       }
       else System.out.println("Entry not found!");
    }

    private static void createAnEntry() {
        System.out.println("Enter the title of the entry: ");
        String title = keyboardInput.nextLine();

        System.out.println("Enter the body of the entry: ");
        String body = keyboardInput.nextLine();

        Entry entry = diary.createEntry(title,body);
        diary.addEntry(entry);
        System.out.println(title+ " has been successfully added");
    }

    private static void searchAnEntry(){
        System.out.println("Enter title: ");
        String title = keyboardInput.nextLine();

        Entry foundEntry = diary.searchEntry(title);
        if(foundEntry == null){
            System.out.println("Entry not found!");
        }
        else{System.out.println(foundEntry);}


    }


}

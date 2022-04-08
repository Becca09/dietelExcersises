package chapterFive;

public class TabularFactorials {
    public static void main(String[] args) {
        int value = 20;
        int factorial = 1;

        for (int i = 0; i < 20; i++){
            factorial = factorial * value;
            System.out.println(factorial);
        }
    }
}

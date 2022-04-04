package chapterFour;

public class CheckerBoardPattern {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 8; i++) {
            System.out.print("*");

            for (int p = 0; p < 8; p++) {
                System.out.print("*");
            }
            if (i % 2 == 0) {
                System.out.println();
                System.out.print(" ");
            } else System.out.println();
        }
    }

}


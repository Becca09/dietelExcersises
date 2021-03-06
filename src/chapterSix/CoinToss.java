package chapterSix;

import java.util.Random;
import java.util.Scanner;

public class CoinToss {
    static int countHeads = 0;
    static int countTails = 0;

    public static void main(String[] args) {
       tossCoin();
       tossCoin();
       tossCoin();
       tossCoin();
       tossCoin();
       getResult();
    }

    public static void tossCoin() {
        int side = flip();
        switch (side) {
            case 1 -> countHeads += 1;
            case 2 -> countTails += 1;
        }

    }

    public static int flip() {
        int value;
        Random random = new Random();
        value = random.nextInt(1, 7);
        return value;
    }

    public static void getResult() {

        System.out.printf("You rolled HEADS %d times and rolled TAILS %d times", countHeads, countTails);
    }
}

package chapterSeven;

import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        int[] diceTable = new int[11];
        Random rand = new Random();

        for (int i = 0; i < 36000000; i++) {
           int dice1 = rand.nextInt(1, 7);
           int dice2 = rand.nextInt(1,7);
           int sum = dice1 + dice2;
           diceTable[sum-2] +=1;
        }

        System.out.println("sum              NoOfSum");
        for (int i = 0; i < diceTable.length; i++) {
            System.out.println(i+2 +  "               "  + diceTable[i] );
        }
    }
}

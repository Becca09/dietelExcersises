package chapterSeven;


import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class GameOfCraps {
    public static void main(String[] args) {
        int[] wins = new int[21];
        int[] loses = new int[21];
        Random rand = new Random();

        for (int roll = 0; roll < 1000000; roll++) {
            int dice1 = rand.nextInt(1, 7);
            int dice2 = rand.nextInt(1, 7);
            int count = 1;
            int point;
            int sum = dice1 + dice2;

            if (sum == 7 || sum == 11) {
                wins[0] = wins[0] + 1;
            } else if (sum == 2 || sum == 3) {
                loses[0] = loses[0] + 1;
            } else if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
                point = sum;
                while (count != -1) {
                    count++;
                    dice1 = rand.nextInt(1, 7);
                    dice2 = rand.nextInt(1, 7);
                    if (dice1 + dice2 == point) {
                        for (int i = 2; i <= 20; i++) {
                            if (count == i) {
                                wins[i - 1] += 1;
                            }

                        }
                        if (count > 20) {
                            wins[20] += 1;
                        }
                        break;
                    } else if (dice1 + dice2 == 7) {
                        for (int i = 2; i <= 20; i++) {
                            if (count == i) {
                                loses[i - 1] += 1;
                            }
                        }
                        if (count > 20) {
                            loses[20] += 1;
                        }
                        break;
                    }

                }
            }
        }
        System.out.println(Arrays.toString(wins));
        System.out.println(Arrays.toString(loses));
    }

}

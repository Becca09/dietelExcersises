package chapterEight;

import java.util.EnumSet;

public enum FoodTest {;
    public static void main(String[] args) {
        System.out.println("  Food      Type    NumberOfCalories");
        for (Food foodEnum : Food.values()) {
            System.out.printf("%6s%10s%12s%n", foodEnum, foodEnum.getType(), foodEnum.getNumberOfCalories());
        }

    }
}

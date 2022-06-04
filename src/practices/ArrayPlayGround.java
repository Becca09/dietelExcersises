package practices;

import java.util.Arrays;

public class ArrayPlayGround {
    public static void main(String[] args) {
//        int [] numbers = new int[10];
//        int [] number2 = {1,2,3,4,5};
//        int [] number3 = new int[]{1,2,3,4,5};
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i;
//        }
//        numbers[0] = 100;
//        System.out.println(numbers[0]);
//        for (int number : numbers) {
//            System.out.println(number);
//        }
        String tree = "pine";

        int count = 0;
        int height = 0;
        if (tree.equals("pine")) {
            height = 55;
            count = count + 1;
        }
        System.out.print(height + count);
    }
}


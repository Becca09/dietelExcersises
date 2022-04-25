package chapterSix;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int radius = input.nextInt();

        calCulatingTheArea(radius);

    }

    private static void calCulatingTheArea(int radius) {
        int area = (int) (Math.PI * radius * radius);
        System.out.println(area);

    }

}





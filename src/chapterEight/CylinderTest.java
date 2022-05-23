package chapterEight;

import java.util.Scanner;

public class CylinderTest {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        System.out.println("input Radius");
        double radius = input.nextInt();
        cylinder.setRadius(radius);

        System.out.println("input height");
        double height = input.nextInt();
        cylinder.setHeight(height);

        cylinder.calculateVolume();
    }
}


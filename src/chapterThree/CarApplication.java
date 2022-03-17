package chapterThree;

import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Car toyota = new Car("Musle", "2019", 500000.00);



        System.out.printf( "The %s car year %s is worth %f but you have a %d , so the car goes for %f %n", toyota.getModel(),toyota.getYear(),toyota.getPrice(), toyota.discount1,
                toyota.getDiscount1());




        Car jeep = new Car("G-wagon", "2020", 7000000.00);

        System.out.printf( "The %s Jeep year %s is worth %f but you have a %d , so the car goes for %f %n", jeep.getModel(),jeep.getYear(),jeep.getPrice(), jeep.discount2,
                jeep.getDiscount1());


    }

}

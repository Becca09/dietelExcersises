package chapterThree;

import java.util.Scanner;

class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price) {
        this.model = model;

        this.year = year;

        if (price > 0.0) {
            this.price = price;
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    int discount1 = 5;
    int discount2 = 7;

//    public void setDiscount1(){
//        int discount1 = 5;
//    }
//
//    public void setDiscount2(){
//        int discount2 = 7;
//    }


    public double getDiscount1() {
        return ((price * discount1) / 100);
    }

    public double getDiscount2() {
        return ((price * discount2) / 100);
    }
}

    class CarApp {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            Car toyota = new Car("Musle", "2019", 500000.00);


            System.out.printf("The %s car year %s is worth %f but you have a %d , so the car goes for %f %n", toyota.getModel(), toyota.getYear(), toyota.getPrice(), toyota.discount1,
                    toyota.getDiscount1());


            Car jeep = new Car("G-wagon", "2020", 7000000.00);

            System.out.printf("The %s Jeep year %s is worth %f but you have a %d , so the car goes for %f %n", jeep.getModel(), jeep.getYear(), jeep.getPrice(), jeep.discount2,
                    jeep.getDiscount1());


        }

    }




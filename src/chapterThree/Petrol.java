package chapterThree;

import java.util.Scanner;

public class Petrol {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        PetrolPurchase customer = new PetrolPurchase("lagos", "High Quality", 20 , 3598.777,2.5 ) ;

        System.out.printf("The net-amount for a %s petrol-type purchased in %s with a discount of %.2f for %d litres and %.2f per-litre is %.2f naira %n" , customer.getTypeOfPetrol(),
                customer.getLocation(), customer.getPercentageDiscount(),
                customer.getQuantity(), customer.getPricePerLitre(), customer.getPurchaseAmount());

        System.out.println("Enter the location ");
        String location = input.nextLine();

        customer.setLocation(location);

        System.out.println("Enter the type of petrol");
        String typeOfPetrol = input.nextLine();

        customer.setTypeOfPetrol(typeOfPetrol);

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        customer.setQuantity(quantity);

        System.out.println("Enter the pricePerLitre");
        double pricePerLitre = input.nextDouble();

        customer.setPricePerLitre(pricePerLitre);

        System.out.println("Enter the percentage discount");
        double percentageDiscount = input.nextDouble();

        customer.setPercentageDiscount(percentageDiscount);


        System.out.printf("The net-amount for a %s petrol-type purchased in %s with a discount of %.2f for %d litres and %.2f perlitre is %.2f naira %n"
                , customer.getTypeOfPetrol(), customer.getLocation(), customer.getPercentageDiscount(),
                customer.getQuantity(), customer.getPricePerLitre(), customer.getPurchaseAmount());

    }
}
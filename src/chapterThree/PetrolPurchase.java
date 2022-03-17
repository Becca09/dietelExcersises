package chapterThree;

public class PetrolPurchase {
    private String location;
    private String typeOfPetrol;
    private int quantity;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String location, String typeOfPetrol, int quantity, double pricePerLitre, double percentageDiscount){
        this.location = location;
        this.typeOfPetrol = typeOfPetrol;
        if (quantity > 0) {
            this.quantity = quantity;
        }
        if (pricePerLitre> 0) {
            this.pricePerLitre = pricePerLitre;
        }
        this.percentageDiscount = percentageDiscount;
    }

    public void setLocation( String location ){
        this.location = location;
    }
     public String getLocation(){
        return location;
     }

     public void  setTypeOfPetrol(String typeOfPetrol){
        this.typeOfPetrol = this.typeOfPetrol;
     }
     public String getTypeOfPetrol(){
        return typeOfPetrol;
     }

     public void setQuantity(int quantity){
        this.quantity = this.quantity;
     }
     public int getQuantity(){
        return quantity;
     }

     public void setPricePerLitre(double pricePerLitre){
        this.pricePerLitre = this.pricePerLitre;
     }

     public double getPricePerLitre(){
        return pricePerLitre;
     }

    public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = this.percentageDiscount;
    }

    public double getPercentageDiscount(){
        return percentageDiscount;
    }

    public double getPurchaseAmount(){
        return (quantity * pricePerLitre) - percentageDiscount;
    }

}

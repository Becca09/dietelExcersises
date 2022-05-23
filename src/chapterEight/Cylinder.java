package chapterEight;

public class Cylinder {
    double height = 1;
    double radius = 1;

    public void setRadius(double radius){
        if (radius <= 0){
            throw new IllegalArgumentException("Kindly give a valid number");
        }
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0){
            throw new IllegalArgumentException("Kindly give a valid number");
        }
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }


    public void calculateVolume(){
        double volume = Math.PI * (radius * radius) * height;
        System.out.println(volume);

    }
}

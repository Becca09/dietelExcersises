
package chapterSix;

import java.util.Scanner;

public class QualityPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Average sCORE");
        int averageScore = input.nextInt();

          System.out.println(qualityPoints(averageScore));


    }

    private static int qualityPoints(int averageScore) {
        if (averageScore > 90 && averageScore <= 100 ){
            System.out.println(" you have 4 Points");
        }

        if (averageScore > 80 && averageScore <= 89 ){
            System.out.println(" you have 3 Points");
        }

        if (averageScore > 70 && averageScore <= 79 ){
            System.out.println(" you have 2 Points");
        }
        if (averageScore > 60 && averageScore <= 69 ){
            System.out.println(" you have 1 Points");
        }
        else if (averageScore < 60){
            System.out.println(" you have 0 Points");
        }


        return averageScore;
    }
}

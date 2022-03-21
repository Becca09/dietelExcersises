package chapterFive;

public class Shapes {

    public static void main(String[] args) {
        for (int count = 0; count < 10; count++) {
            for (int j = 0; j < count + 1; j++)

                System.out.print("*");
            System.out.println();
        }
        System.out.println();

        for (int count = 11; count >= 0; count--) {
            for (int j = 0; j < count - 1; j++)

                System.out.print("*");
            System.out.println();
        }
        System.out.println();


        for (int count = 0; count < 10; count++) {
            for (int index = 1; index < count + 1; index++)
                System.out.print(" ");
            for (int star = 10; star > count; star--)
                System.out.print("*");
            System.out.println();

        }
        System.out.println();
        for (int count = 10; count > 0; count--) {
            for (int index = 0; index < count - 1; index++)
                System.out.print(" ");
            for (int star = 10; star > count - 1; star--)
                System.out.print("*");
            System.out.println();
        }

    }

}

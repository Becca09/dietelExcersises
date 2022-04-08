package chapterFive;

public class ProductOfOddIntegers {
    public static void main(String[] args) {
        int product = 0;

        for ( int i = 0; i <= 15; i++ ){
            if ( i % 2 != 0)
                product = i *i;

        }
        System.out.println(product);
    }
}

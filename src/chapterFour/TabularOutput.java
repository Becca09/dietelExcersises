package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("N    10*N      100*N      1000*N%n");
        for(int i =1; i<=5; i++){
            int N = i;
            int N2 = i*10;
            int N3 = i*100;
            int N4 = i*1000;
            System.out.printf("%d      %d       %d       %d%n",N,N2,N3,N4);}


    }

}



package classWorks;

public class ThreeHundredArray {
    public static void main(String[] args) {
        int[] threeHundred = new int[300];

        int loop = 0;

        while (loop < threeHundred.length) {
            threeHundred[loop] = loop + 1;
            loop++;
        }
        for (int i = 0; i < loop; i++)
        {
            System.out.print(threeHundred[i] + "   ");
        }

    }
}


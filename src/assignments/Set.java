package assignments;

public class Set {
    public int sumOfDistinctFigure(int[] array, int[] array2) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array2.length; j++) {
                if (array[i] != array2[j])
                    counter++;
            }
            if (counter == array2.length)
                sum = sum + array[i];
        }

        for (int i = 0; i < array2.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array2[i] != array[j])
                    counter++;
            }
            if (counter == array.length)
                sum = sum + array2[i];
        }
        return sum;
    }

    public int sumOfOverlappingElement(int[] array, int[] array1) {
        int sum = 0;
        int[] array2 = new int[10];
        for (int i = 0; i < array.length; i++) {
            for (int k : array1) {
                if (array[i] == k) {
                    array2[i] = array[i] + k;
                }
            }
        }
        return sumOfOverlappingElementInArray(array2, sum);

    }

    private int sumOfOverlappingElementInArray(int[] array2, int sum) {
        for (int j : array2) {
            sum += j;
        }
        return sum;
    }
}

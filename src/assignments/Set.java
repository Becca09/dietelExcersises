package assignments;

public class Set {
    public int sumOfDistinctFigure(int[] array, int[] array2) {
        int sum = 0;
        for (int k : array) {
            for (int i : array2) {
                if (k == i) {
                    sum = sum + k;
                }
            }
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

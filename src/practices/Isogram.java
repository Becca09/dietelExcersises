package practices;
import java.util.Arrays;

public class Isogram {
    public static void main(String[] args) {
        checkIfLetterIsIsogram("goat");
        System.out.println(checkIfLetterIsIsogram("goat"));
    }
    public static boolean checkIfLetterIsIsogram(String str) {
        str = str.toLowerCase();
        int len = str.length();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])

                return false;
        }

        return true;
    }

}

package classWorks;

import java.util.Random;

public class PasswordArray {
  public static void main(String[] args) {
    generatePaawords();
  }

  private static void generatePaawords() {
    Random generatePass = new Random();

    char[] passwords = {'A', 'B','C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                        'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd',
               'e', 'f', 'g', 'h','i','j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v' ,'w', 'x', 'y', 'z' };
    for (int counter = 1; counter < 13; counter++){
      String myPasswords = String.valueOf(passwords[generatePass.nextInt(counter + ' ')]);
      System.out.print(myPasswords);
    }
  }
}

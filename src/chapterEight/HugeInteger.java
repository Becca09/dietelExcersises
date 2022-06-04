package chapterEight;

import java.util.Arrays;

public class HugeInteger {
    private int[] digits;

    public HugeInteger() {
        this.digits = new int[40];
    }

    public static HugeInteger parse(String value){
        HugeInteger hugeInteger = new HugeInteger();
        char[] valueCharArray = value.toCharArray();
        for (int i = 0; i < valueCharArray.length; i++) {
            char digit = valueCharArray[i];
            if (Character.isDigit(digit)){
                int digitAsInt = Integer.valueOf(digit+"");
                int appropriateIndex = hugeInteger.digits.length-(valueCharArray.length-i);
                hugeInteger.digits[appropriateIndex] = digitAsInt;
            }
        }
        return hugeInteger;
    }

    @Override
    public String toString() {
//       StringBuilder stringBuilder = new StringBuilder();
       return Arrays.toString(digits);
//        for (int element: digits) {
//            stringBuilder.append(element);
//        }
//        return stringBuilder.toString();
    }

    public HugeInteger add(HugeInteger hugeIntegerTwo) throws HugeIntegerException {
        int carryOver = 0;
        HugeInteger hugeInteger = new HugeInteger();
        for (int i = this.digits.length-1; i >=0 ; i--) {
            int sum = this.digits[i] + hugeIntegerTwo.digits[i] + carryOver;
            hugeInteger.digits[i] = sum % 10;
            carryOver = sum / 10;
        }
        if (carryOver == 1){
            throw new HugeIntegerException("Number too Large!");
        }
        return hugeInteger;
    }

    public HugeInteger subtract(HugeInteger hugeInteger) throws HugeIntegerException {
        int carryOver = 0;
        HugeInteger hugeIntegerResult = new HugeInteger();
        for (int i = this.digits.length-1; i >= 0 ; i--) {
            int difference = this.digits[i] + carryOver - hugeInteger.digits[i];
            if (difference < 0){
                difference = 10 + difference;
                carryOver = -1;
            } else{
                carryOver = 0;
            }
            hugeIntegerResult.digits[i] = difference;
        }
        if (carryOver != 0){
            throw new HugeIntegerException("Second number is greater than first Number");
        }
        return hugeIntegerResult;
    }
}

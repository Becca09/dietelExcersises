package tddClass;

import org.junit.jupiter.api.Test;

public class Random {
    @Test
    public void loop(){
        int number = 2;
                while(number <= 100) {
                    System.out.print(number + " ");
                    number = number + 2;
                }
    }


}

import classWorks.RollDice;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RollDiceTest {
    @Test
    public void rollNotEqualsToZeroTest(){
        RollDice crapGame = new RollDice();
        int roll = RollDice.rollDice();
        assertNotEquals(0, roll);
    }

//    @Test
//    public void randomNumbersWhenDiceRolledTest(){
//        int firstRoll = GameOfChance.rollDice();
//        int secondRoll = GameOfChance.rollDice();
//        assertNotEquals(firstRoll, secondRoll);
//    }

    @Test
    public void checkForAWinTest(){
        String status = RollDice.status(7);
        assertEquals("You Win", status);
        status = RollDice.status(11);
        assertEquals("You Win", status);
    }

    @Test
    public void checkForALossTest(){
        String status = RollDice.status(2);
        assertEquals("You Lose, THE HOUSE WINS!", status);
        status = RollDice.status(3);
        assertEquals("You Lose, THE HOUSE WINS!", status);
        status = RollDice.status(12);
        assertEquals("You Lose, THE HOUSE WINS!", status);
    }

    @Test
    public void checkForAContinueTest(){
        String status = RollDice.status(10);
        assertNotEquals("You Win", status);

        status = RollDice.status(10);
        assertNotEquals("You Lose, THE HOUSE WINS!", status);
    }

    @Test
    public void checkForAWinAfterContinue(){

        String status = RollDice.status(10);
        assertNotEquals("You Continue", status);

        status = RollDice.status(10);
        assertEquals("You Win", status);
    }

    @Test
    public void checkForALossAfterContinue(){
        String status = RollDice.status(10);
        assertNotEquals("You Continue", status);
        RollDice.toContinue();
        status = RollDice.status(10);
        assertEquals("You Win", status);
    }

}

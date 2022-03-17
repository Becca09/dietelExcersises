package tddClass;

import assignments.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AirConditionerTest{

  @Test
  public void testThatICanPutOnAc(){
      //given
      AirConditioner themercool = new AirConditioner();

      //when
      themercool.power();

      //assert
     assertTrue(themercool.isOn());
  }
  @Test
    public void testThatICanPutOffAc(){
        //given
        AirConditioner themercool = new AirConditioner();

        //when
        themercool.power();
        themercool.power();

        //assert
        assertFalse(themercool.isOn());

    }

    @Test
    public void increaseTheTemperatureTest(){
        //given
        AirConditioner themercool = new AirConditioner();

        //when
        themercool.power();
      assertTrue(themercool.isOn());

        themercool.increaseTemperature(16);

        assertEquals(17, themercool.getTemperatureLevel());
    }

   @Test
    public void decreaseTheTemperatureTest() {
        //given
        AirConditioner themercool = new AirConditioner();

        //when
       themercool.power();
       assertTrue(themercool.isOn());

        themercool.decreaseTemperature(25);

        assertEquals(24, themercool.getTemperatureLevel());
    }

    @Test
    public void increaseTheTemperatureBeyoundThirtyTest(){
        //given
        AirConditioner themercool = new AirConditioner();

        //when
        themercool.power();
        assertTrue(themercool.isOn());
        themercool.increaseTemperature(35);

        assertEquals(30, themercool.getTemperatureLevel());
    }

    @Test
    public void decreaseTheTemperatureBeyoundSixteenTest() {
        //given
        AirConditioner themercool = new AirConditioner();

        //when

        themercool.power();
        assertTrue(themercool.isOn());

        themercool.decreaseTemperature(12);

        assertEquals(16, themercool.getTemperatureLevel());
    }

}

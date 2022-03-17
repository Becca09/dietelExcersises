package tddClass;

import assignments.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

   /* private Television polyster;
    @BeforeEach
    public void startWith(){
        polyster = new Television();

    }*/

    @Test
    public void testOnTelevision(){
        //given
        Television polystar = new  Television();
            assertFalse(polystar.isOn());


        //when
        polystar.power();

        //assert
        assertTrue(polystar.isOn());

    }

    @Test
    public void testOffTelevision(){
        //given
        Television polystar = new  Television();

        //when
        polystar.power();
        polystar.power();

        //assert
        assertFalse(polystar.isOn());

    }

    @Test
    public void testInputChanel(){
        //given
        Television polystar = new  Television();

        //when
        polystar.power();
        assertTrue(polystar.isOn());
        polystar.setChanel(5);
        //assert
        assertEquals(5, polystar.getInputChanel());
    }

    @Test

    public void testChanelUp(){
        //given
        Television polystar = new  Television();

        //when

        polystar.power();
        assertTrue(polystar.isOn());

        polystar.setChanel(7);
        polystar.chanelUp();

        //assert

        assertEquals(8, polystar.getInputChanel());

        }

    @Test
    public void testChanelDown(){
        //given
        Television polystar = new  Television();

        //when

        polystar.power();
        assertTrue(polystar.isOn());

        polystar.setChanel(7);
        polystar.chanelDown();

        //assert

        assertEquals(6, polystar.getInputChanel());

    }

    @Test
    public void testVolume(){
        //given
        Television polystar = new Television();

        // when
        polystar.power();
        assertTrue(polystar.isOn());
        polystar.setVolume(2);

        // assert
        assertEquals(2 ,polystar.getVolume());
    }

    @Test
    public void testVolumeUp(){
        //given
        Television polystar = new Television();

        polystar.power();
        assertTrue(polystar.isOn());
        // when
        polystar.setVolume(99);
        polystar.volumeUp();
        polystar.volumeUp();

        // assert
        assertEquals(100, polystar.getVolume() );
    }

    @Test
    public void testVolumeDown(){
        //given
        Television polystar = new Television();

        // when
        polystar.power();
        assertTrue(polystar.isOn());


        polystar.setVolume(99);
        polystar.volumeDown();
        polystar.volumeDown();

        // assert
        assertEquals(97, polystar.getVolume() );
    }

    @Test
    public void testMode(){
        Television polystar = new Television();

        polystar.power();
        assertTrue(polystar.isOn());

        polystar.switchMode();

        assertEquals("AV1", polystar.getSwitchMode());
    }


    @Test
    public void muteTest(){
        Television polystar = new Television();
        polystar.Mute();
        assertTrue(polystar.isMute());
    }
    @Test
    public void notMuteTest(){
        Television polystar = new Television();
        polystar.volumeUp();
        polystar.volumeUp();
        polystar.Mute();
        polystar.Mute();
        assertFalse(polystar.isMute());

    }
}

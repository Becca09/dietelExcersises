package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtle.Directions.*;

class TurtleTest {
    private  Turtle ijapa;
    @BeforeEach public void setUp(){
        ijapa = new Turtle();
    }

@Test public void turtleExistTest(){
    assertNotNull(ijapa);
}
@Test public void turtlePenIsUpByDefault(){
    boolean isPenDown = ijapa.isPenDown();
    assertFalse(isPenDown);
}
@Test public void turtleCanMovePenDownTest(){
        assertFalse(ijapa.isPenDown());
        ijapa.penDown();
        boolean isPenDown = ijapa.isPenDown();
        assertTrue(isPenDown);
}
@Test public void turtleCanMovePenUpTest(){
        ijapa.penDown();
        ijapa.penUp();
        assertFalse(ijapa.isPenDown());
}
@Test public void  turtleFaceEastByDefault(){
        assertEquals(Directions.EAST, ijapa.getCurrentDirection());
}
@Test public void turtleCanTurnRightFromEast(){
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
}
@Test public void turtleCanTurnRightFromSouthTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());

}
// todo add return right facing west and north

    @Test
    void turtleCanTurnRightFromWestTest() {
        for (int i = 0; i < 3; i++) {
            ijapa.turnRight();
        }
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightFromNorthTest() {
        for (int i = 0; i < 4; i++) {
            ijapa.turnRight();
        }
        assertSame(EAST, ijapa.getCurrentDirection());
    }


    @DisplayName("When the turtle is facing east, turning left changes direction to north")

    @Test public void turtleCanTurnLeftFacingEastTest(){
            ijapa.turnLeft();
            assertSame(NORTH, ijapa.getCurrentDirection());
    }
//    todo facing north, south and west
@Test
void turtleCanTurnLeftWhileFacingNorthTest() {
    ijapa.turnLeft();
    ijapa.turnLeft();
    assertSame(WEST, ijapa.getCurrentDirection());
}

    @Test
    void turtleCanTurnLeftWhileFacingWestTest() {
        for (int i = 0; i < 3; i++) {
            ijapa.turnLeft();
        }
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingSouthTest() {
        for (int i = 0; i < 4; i++) {
            ijapa.turnLeft();
        }
        assertSame(EAST, ijapa.getCurrentDirection());
    }

    @Test public void turtleCanMoveForwardFacingEastTest(){
        ijapa.move(5);
        assertEquals(new Position(0,4), ijapa.getCurrentPosition());

    }
}
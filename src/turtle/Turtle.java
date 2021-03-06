package turtle;

import static turtle.Directions.*;

public class Turtle {
        private Pen biro = new Pen();
        private Directions currentDirection = EAST;
        private Position currentPosition = new Position(0, 0);

        public boolean isPenDown() {
            return biro.isDown();
        }

        public void penDown() {
            biro.penDown();
        }

        public void penUp(){
            biro.penUp();
        }

        public Directions getCurrentDirection() {
            return currentDirection;
        }

        public void turnRight() {
            if (currentDirection == EAST) face(SOUTH);
            else if (currentDirection == SOUTH) face(WEST);
            else if (currentDirection == WEST) face(NORTH);
            else if (currentDirection == NORTH) face(EAST);
        }

        public void turnLeft() {
            switch (currentDirection) {
                case EAST -> face(NORTH);
                case NORTH -> face(WEST);
                case WEST -> face(SOUTH);
                case SOUTH -> face(EAST);
            }
        }

        private void face(Directions newDirection) {
            currentDirection = newDirection;
        }

        public void move(int noOfSteps, SketchPad sketchPad) {
            if (isPenDown() == true) {
                if (currentDirection == EAST) writeOnColumn(noOfSteps, sketchPad);

            }

            if (currentDirection == EAST) increaseColumnBy(noOfSteps);
            else if (currentDirection == SOUTH) increaseRowBy(noOfSteps);
            else if (currentDirection == WEST) decreaseColumnBy(noOfSteps);
            else if (currentDirection == NORTH) decreaseRowBy(noOfSteps);
        }

    private void writeOnColumn(int noOfSteps, SketchPad sketchPad) {
            int [][] floor = sketchPad.getFloor();
            int row = currentPosition.getRow();
            int column = currentPosition.getColumn();
            noOfSteps = noOfSteps + column;
        for (int i = column; i <column+noOfSteps ; i++) {
            floor[row][i] = 1;
        }

    }

    private void decreaseRowBy(int noOfSteps) {
            int currentRowPosition = currentPosition.getRow();
            currentPosition.setRow(currentRowPosition - noOfSteps + 1);
    }

    private void decreaseColumnBy(int noOfSteps) {
            int currentColumnPosition = currentPosition.getColumn();
            currentPosition.setColumn(currentColumnPosition - noOfSteps + 1);
        }

        private void increaseColumnBy(int noOfSteps) {
            int currentColumnPosition = currentPosition.getColumn();
            currentPosition.setColumn(currentColumnPosition + noOfSteps - 1);
        }

        private void increaseRowBy(int noOfSteps) {
            int currentRowPosition = currentPosition.getRow();
            currentPosition.setRow(currentRowPosition + noOfSteps - 1);
        }

        public Position getCurrentPosition() {
            return currentPosition;
        }

}

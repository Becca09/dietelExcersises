package turtle;

public class SketchPad {
    private int [][] floor;
    public SketchPad(int floorRow, int floorColumn) {
        floor = new int[floorRow][floorColumn];
    }

    @Override
    public String toString(){
        String toBeReturned = "";
//        for (int row = 0; row < floor.length; row++){
//            for (int column = 0; column < floor[row].length; column++){
//                if(floor[row][column == 0]) toBeReturned+= " ";
//                else toBeReturned += "* ";
//                }
//            }
//        }

        for (var row: floor){
            for (var column : row){
                if (column ==0) toBeReturned+=" ";
                if (column ==1) toBeReturned+="* ";

            }
            toBeReturned += "\n";
        }
        return toBeReturned;
    }

    public int[][] getFloor() {
        return floor;
    }
}

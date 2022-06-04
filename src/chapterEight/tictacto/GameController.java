package chapterEight.tictacto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GameController {
    public String run(Player playerOne, Player playerTwo, Board board) {
        int maximumNumberOfPlays = 5;
        int currentNumberOfPlays = 0;
        List<Integer> availablePositions = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Result result = checkForWin(board, playerOne, playerTwo);
        while (!result.isWon() && currentNumberOfPlays!=maximumNumberOfPlays ){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Player One- Enter a position to play. Position can only be from 1 - 9: ");
            System.out.println("Available Positions --> "+ availablePositions);
            int position = scanner.nextInt();
            position = checkIfPositionIsValidElseReturnNewPosition(availablePositions, scanner, position);
            playerOne.play(position, board);
            availablePositions.remove(availablePositions.indexOf(position));
            printBoard(board);

            result = checkForWin(board, playerOne, playerTwo);
            if (result.isWon()){
                return result.getWinningPlayer();
            }
            if (!availablePositions.isEmpty()){
                System.out.println("Player Two- Enter a position to play. Position can only be from 1 - 9: ");
                System.out.println("Available Positions --> "+ availablePositions);

                position = scanner.nextInt();
                position = checkIfPositionIsValidElseReturnNewPosition(availablePositions, scanner, position);
                playerTwo.play(position, board);
                availablePositions.remove(availablePositions.indexOf(position));
                printBoard(board);

            }
            currentNumberOfPlays++;
            result = checkForWin(board, playerOne, playerTwo);

        }
        return result.getWinningPlayer();
    }

    private void printBoard(Board board) {
        Elements[][] elements = board.getBoard();
        System.out.println("\n".repeat(50));
        for (int i = 0; i < elements.length; i++) {
            System.out.println("_____________________________");
            for (int j = 0; j < elements[i].length; j++) {
                System.out.printf("%7s  |", elements[i][j]);
            }
            System.out.println();
        }
        System.out.println("_____________________________");
    }

    private int checkIfPositionIsValidElseReturnNewPosition(List availablePositions, Scanner scanner, int position) {
        while (position < 1 || position > 9){
            System.out.println("Invalid Position. Position can only be from 1 - 9");
            position = scanner.nextInt();
        }
        while (!availablePositions.contains(position)){
            System.out.println("""
                    Position is not empty
                    Enter another position. Position can only be from 1 - 9: """);
            System.out.println("Available Positions --> "+ availablePositions);

            position = scanner.nextInt();
            while (position < 1 || position > 9){
                System.out.println("""
                Invalid Position. Position can only be from 1 - 9
                Enter another position. Position can only be from 1 - 9:""");
                System.out.println("Available Positions --> "+ availablePositions);

                position = scanner.nextInt();
            }
        }
        return position;
    }

    private Result checkForWin(Board board, Player playerOne, Player playerTwo) {
        Elements[][] elements = board.getBoard();
        if (elements[0][0] == elements[0][1] && elements[0][1] == elements[0][2] && elements[0][1] != Elements.EMPTY){
            if (elements[0][1] == playerOne.getElement()){
                return new Result(true, playerOne.getName());
            } else{
                return new Result(true, playerTwo.getName());
            }
        } else if (elements[1][0] == elements[1][1] && elements[1][1] == elements[1][2] && elements[1][1] != Elements.EMPTY){
            if (elements[1][1] == playerOne.getElement()){
                return new Result(true, playerOne.getName());
            } else{
                return new Result(true, playerTwo.getName());
            }
        }
        else if (elements[2][0] == elements[2][1] && elements[2][1] == elements[2][2] && elements[2][1] != Elements.EMPTY){
            if (elements[2][1] == playerOne.getElement()){
                return new Result(true, playerOne.getName());
            } else{
                return new Result(true, playerTwo.getName());
            }
        }
        else if (elements[0][0] == elements[1][0] && elements[1][0] == elements[2][0] && elements[1][0] != Elements.EMPTY){
            if (elements[1][0] == playerOne.getElement()){
                return new Result(true, playerOne.getName());
            } else{
                return new Result(true, playerTwo.getName());
            }
        }
        else if (elements[0][1] == elements[1][1] && elements[1][1] == elements[2][1] && elements[1][1] != Elements.EMPTY){
            if (elements[1][1] == playerOne.getElement()){
                return new Result(true, playerOne.getName());
            } else{
                return new Result(true, playerTwo.getName());
            }
        }
        else if (elements[0][2] == elements[1][2] && elements[1][2] == elements[2][2] && elements[1][2] != Elements.EMPTY){
            if (elements[1][2] == playerOne.getElement()){
                return new Result(true, playerOne.getName());
            } else{
                return new Result(true, playerTwo.getName());
            }
        }
        else if (elements[0][0] == elements[1][1] && elements[1][1] == elements[2][2] && elements[1][1] != Elements.EMPTY){
            if (elements[1][1] == playerOne.getElement()){
                return new Result(true, playerOne.getName());
            } else{
                return new Result(true, playerTwo.getName());
            }
        }
        else if (elements[0][2] == elements[1][1] && elements[1][1] == elements[2][0] && elements[1][1] != Elements.EMPTY){
            if (elements[1][1] == playerOne.getElement()){
                return new Result(true, playerOne.getName());
            } else{
                return new Result(true, playerTwo.getName());
            }
        } else{
            return new Result(false, "");
        }
    }
}

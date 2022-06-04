package chapterEight.tictacto;

import java.util.Scanner;

public class TicTacTo {


    public static void main(String[] args) {

        System.out.println("""
                Welcome to the Tic TAc Toe Game of the Century!!!
                Hope you are ready to have fun.""");


        String playerOneName = promptUserForName();

        System.out.println("Please choose your element- X || O");
        Scanner scanner = new Scanner(System.in);
        String playerOneElement = scanner.next().toUpperCase();
        while (!(playerOneElement.equals("X") || playerOneElement.equals("O"))) {
            System.out.println("""
                    Invalid element! choose X or O big head""");
            playerOneElement = scanner.next();
        }
        Player playerOne = new Player(playerOneName, playerOneElement);
        String playerTwoName = promptUserForName();
        String playerTwoElement;
        if (playerOneElement.equals("X")){
            playerTwoElement = "O";
        } else {
            playerTwoElement = "X";
        }
        Player playerTwo = new Player(playerTwoName, playerTwoElement);


        Board board = new Board();


        GameController gameController = new GameController();
        String winningPlayer = gameController.run(playerOne, playerTwo, board);
        if (winningPlayer.equals("")){
            System.out.println("The game is a draw");
        } else{
            System.out.printf("%s Wins!", winningPlayer);
        }
    }

    private static  String promptUserForName(){
        System.out.println("Enter the name of player: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}

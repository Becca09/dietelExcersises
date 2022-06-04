package chapterEight.tictacto;

import static chapterEight.tictacto.Elements.EMPTY;

public class Board {
    private Elements[][] board;

    public Board() {
        this.board = new Elements[][]{{EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY}};
    }
    public void setElements(Elements elements, int position) {
        switch (position) {
            case 1:
                board[0][0] = elements;
                break;
            case 2:
                board[0][1] = elements;
                break;
            case 3:
                board[0][2] = elements;
                break;
            case 4:
                board[1][0] = elements;
                break;
            case 5:
                board[1][1] = elements;
                break;
            case 6:
                board[1][2] = elements;
                break;
            case 7:
                board[2][0] = elements;
                break;
            case 8:
                board[2][1] = elements;
                break;
            case 9:
                board[2][2] = elements;
                break;
            default: throw  new IllegalArgumentException ("Input out of range");
        }
    }

    public Elements[][] getBoard() {
        return board;
    }
}

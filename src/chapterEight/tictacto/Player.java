package chapterEight.tictacto;

public class Player {
//    private int score;
    private Elements element;
    private String name;

    public Player(String playerName, String playerElement) {
        name = playerName;
        element = Elements.valueOf(playerElement);
    }

    public void play(int position, Board board){
        board.setElements(element, position);
    }

    public Elements getElement() {
        return element;
    }

    public String getName() {
        return name;
    }
}

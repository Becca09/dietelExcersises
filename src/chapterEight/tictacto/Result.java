package chapterEight.tictacto;

public class Result {
    private boolean isWon;
    private String winningPlayer;

    public Result(boolean isWon, String winningPlayer) {
        this.isWon = isWon;
        this.winningPlayer = winningPlayer;
    }

    public boolean isWon() {
        return isWon;
    }

    public String getWinningPlayer() {
        return winningPlayer;
    }
}

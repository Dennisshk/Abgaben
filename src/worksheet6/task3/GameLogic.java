package worksheet6.task3;

public interface GameLogic {
    //Theorie Aufgaben in HangmanGame.java

    void handleGuess(char guess);
    boolean hasWon();
    void endGame(boolean won);
}

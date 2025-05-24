package worksheet6.hangman2;

public interface GameLogic {
    //Theorie Aufgaben in HangmanGame.java

    void handleGuess(char guess);
    boolean hasWon();
    void endGame(boolean won);
}

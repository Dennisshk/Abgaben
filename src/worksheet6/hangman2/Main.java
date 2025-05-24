package worksheet6.hangman2;

import worksheet6.hangman.Timer;

import javax.swing.*;

public class Main {
    //Theorie Aufgaben in HangmanGame.java
    public static void main( String [] args) {
        SwingUtilities . invokeLater (() -> {
            new HangmanGame();
        });
    }
}

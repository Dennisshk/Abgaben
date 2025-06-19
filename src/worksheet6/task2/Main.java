package worksheet6.task2;

import javax.swing.*;

public class Main {
    //Theorie Aufgaben in HangmanGame.java
    public static void main( String [] args) {
        SwingUtilities . invokeLater (() -> {
            new WordFinder();
        });
    }
}

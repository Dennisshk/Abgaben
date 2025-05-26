package worksheet6.hangman;

import javax.swing .*;
import java.awt .*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util. ArrayList ;


public class  Game extends JFrame {

    // GUI components
    protected JLabel wordLabel , attemptsLabel , timeLabel ;
    protected JTextField inputField ;
    protected JButton startButton;
    // The word the player has to guess (fixed for now)
    protected String currentWord = "example";
    // Stores the letters guessed by the player
    protected ArrayList <Character > guessedLetters = new ArrayList < >();
    // Number of tries left
    protected int attemptsLeft = 6;
    // Time left
    protected int timeLeft = 60;


    // Sets up the window and its components
    public Game () {
        setTitle (" Hangman Game ");
        setSize (400 , 250);
        setDefaultCloseOperation ( EXIT_ON_CLOSE );
        setLayout (new GridLayout (6, 1));

        // Button to start a new game
        startButton = new JButton (" Start Game ");
        add( startButton );

        // Label showing the guessed word with _ for unknown letters
        wordLabel = new JLabel (" Word: ", SwingConstants .CENTER );
        add( wordLabel );

        // Label showing how many tries are left
        attemptsLabel = new JLabel (" Attempts left: " + attemptsLeft , SwingConstants . CENTER );
        add( attemptsLabel );

        // Label showing the time left (not yet changing )
        timeLabel = new JLabel (" Time left: " + timeLeft , SwingConstants . CENTER );
        add( timeLabel );

        // Input field where the player types their guess
        inputField = new JTextField ();
        inputField . setHorizontalAlignment ( JTextField .CENTER );
        inputField . setEnabled (false ); // initially inactive

        //Auch mit addActionListener möglich (Bei InputField automatisch Enter)
        inputField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                // 10 = Enter
                if(e.getKeyCode()==10) processInput();
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        add( inputField );

        // Starts the game when button is clicked and disables restart
        startButton . addActionListener (e -> {
            startGame ();
            startButton . setEnabled (false );
        });

        // You will implement this method
        processInput ();
        setVisible (true );
    }

    // Resets game state when starting a new game
    protected void startGame () {
        guessedLetters .clear ();
        attemptsLeft = 6;
        timeLeft = 60;
        updateDisplay ();
        inputField.setText("");
        inputField . setEnabled (true );
        inputField . requestFocus ();
        startButton.setText("Hangman");
    }

    // Updates the word , attempts , and time on the screen
    protected void updateDisplay () {
        StringBuilder display = new StringBuilder ();
        for (char c : currentWord . toCharArray ()) {
            if ( guessedLetters . contains (c)) {
                display . append(c). append (" ");
            } else {
                display . append ("_ ");
            }
        }
        wordLabel . setText (" Word: " + display);
        attemptsLabel . setText (" Attempts left: " + attemptsLeft );
        timeLabel . setText (" Time left: " + timeLeft );
    }

    public void processInput () {
        String input = inputField.getText();
        inputField.setText("");
        if(input.isEmpty()) return;
        if(input.length()!=1){
            System.out.println("Please enter exactly one letter.");
        }else{
            input = input.toLowerCase();
            char in = input.charAt(0);
            if(in>='a' && in<='z'){
                handleGuess(in);
            }else{
                System.out.println("Only letters are allowed.");
            }
        }
    }

    protected void handleGuess (char guess) {
        if(guessedLetters.contains(guess)){
            System.out.println("Letter was already guessed.");
        }else{
            guessedLetters.add(guess);

            boolean isInWord = false;
            for(int i=0;i<currentWord.length();i++){
                if(currentWord.charAt(i)==guess) {
                    isInWord=true;
                    break;
                }
            }
            if(!isInWord) attemptsLeft--;

            updateDisplay();

            if(hasWon()){
                endGame(true);
            }else{
                if(attemptsLeft<1) endGame(false);
            }
        }
    }

    private boolean hasWon () {
        for(char c: currentWord.toCharArray()){
            if(!guessedLetters.contains(c)) return false;
        }
        return true;
    }

    protected void endGame ( boolean won) {
        inputField.setEnabled(false);
        inputField.setText("");
        if(won){
            inputField.setText("Das Wort \""+currentWord+"\" wurde erraten!");
            System.out.println("Das Wort \""+currentWord+"\" wurde erraten!");
        }else{
            inputField.setText((timeLeft==0?"Zeit abgelaufen!":"Keine Versuche mehr übrig!")+ " Das Wort war: \""+currentWord+ "\".");
            System.out.println((timeLeft==0?"Zeit abgelaufen!":"Keine Versuche mehr übrig!")+ " Das Wort war: \""+currentWord+ "\".");
        }
        startButton.setText("Restart");
        startButton.setEnabled(true);
    }
}
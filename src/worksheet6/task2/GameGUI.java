package worksheet6.task2;

import javax.swing .*;
import java.awt .*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util. ArrayList ;

//Theorie Aufgaben in HangmanGame.java

    public abstract class GameGUI extends JFrame {
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
        public GameGUI () {
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
            inputField.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {}
                @Override
                public void keyPressed(KeyEvent e) {
                    // 10 = Enter
                    if(e.getKeyCode()==10) processInput();
                }
                @Override
                public void keyReleased(KeyEvent e) {}
            });
            add( inputField );
            // Starts the game when button is clicked and disables restart
            startButton . addActionListener (e -> {
                startGame ();
                startButton . setEnabled (false );
            });

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
        protected abstract void handleGuess (char guess );
        protected abstract boolean hasWon ();
        protected abstract void endGame ( boolean won );
    }


package worksheet6.hangman2;

public class HangmanGame extends GameGUI implements GameLogic,TimerLogic{

    /*
    • Which SOLID principles do you recognize in your solution?
    S: GUI und Logik wurden in unterschiedliche Klassen zerlegt, sodass diese unabhängig voneinander verändert werden können
    O: Das Projekt kann erweitert werden, da neue Klassen von GUI oder HangmanGame erben können
    L: Da diese Klasse von GameGUI erbt, hat sie auch alle Eigenschaften von dieser
    I: Mit Interfaces wurde eine große Klasse in verschiedene Bereiche unterteilt
    D: Es gibt nur wenige Abhängigkeiten

    • How does using interfaces improve the flexibility of your design?
    Klassen können einfacher ersetzt werden, da die Interfaces dafür sorgen, dass die Methoden-Namen
    einheitlich sind. Es muss nicht viel in anderen Klassen geändert werden.


    • What benefits does this modular design using interfaces offer in larger, more complex projects?
    Es gibt eine bessere Struktur, sodass Methoden, welche zusammenhängen besser erkannt werden, da diese
    in einem Interface beschrieben werden. So sind auch die Namen der Methoden einfacher rauszufinden, ohne
    dabei die ganze Klasse durchsuchen zu müssen
     */

    public void handleGuess (char guess) {
        if(guessedLetters.contains(guess)){
            System.out.println("Der Buchstabe wurde bereits gewählt!");
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

    public boolean hasWon () {
        for(char c: currentWord.toCharArray()){
            if(!guessedLetters.contains(c)) return false;
        }
        return true;
    }

    public void endGame ( boolean won) {
        timerThread.interrupt();
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

    protected Thread timerThread ;

    @Override
    protected void startGame(){
        super.startGame();
        timerThread = new Thread(new TimerRunnable(this));
        timerThread.start();
    }


    public void decreaseTime(){
        if(timeLeft>0) timeLeft--;
    }

    public boolean timeEnds(){
        return timeLeft==0;
    }
}

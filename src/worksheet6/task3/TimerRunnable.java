package worksheet6.task3;

import javax.swing. SwingUtilities ;

public class TimerRunnable implements Runnable {

    private final HangmanGame game;

    public TimerRunnable (HangmanGame game) {
        this.game = game;
    }

    @Override
    public void run () {
        try{
            Thread.sleep(1000);
            while(!game.timeEnds()){
                game.decreaseTime();
                //SwingUtilities.invokeLater(timeLabel . setText (" Time left: " + timeLeft ));
                SwingUtilities.invokeLater(new Runnable() {public void run() {game.timeLabel.setText (" Time left: " + game.timeLeft );}});
                Thread.sleep(1000);
            }
            //Wenn Spiel bereits beendet, wird endGame() nicht aufgerufen
            if(Thread.interrupted()) throw new InterruptedException();

            SwingUtilities.invokeLater(new Runnable() {public void run() {game.endGame(false);}});

        }catch(InterruptedException e){
            System.out.println("Zeit angehalten");
        }
    }
}
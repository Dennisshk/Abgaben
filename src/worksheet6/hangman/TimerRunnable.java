package worksheet6.hangman;

import javax.swing. SwingUtilities ;

public class TimerRunnable implements Runnable {

    private final Timer game;

    public TimerRunnable (Timer game) {
        this.game = game;
    }

    @Override
    public void run () {
        try{
            Thread.sleep(1000);
            while(!game.timeEnds()){
                game.decreaseTime();
                //SwingUtilities.invokeLater(timeLabel . setText (" Time left: " + timeLeft ));
                SwingUtilities.invokeLater(()-> {game.timeLabel.setText (" Time left: " + game.timeLeft );});
                Thread.sleep(1000);
            }
            //Wenn Spiel bereits beendet, wird endGame() nicht aufgerufen
            if(Thread.interrupted()) throw new InterruptedException();

            SwingUtilities.invokeLater(()-> {game.endGame(false);});

        }catch(InterruptedException e){
            System.out.println("Zeit angehalten");
        }
    }
}
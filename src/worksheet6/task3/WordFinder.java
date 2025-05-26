package worksheet6.task3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.List;

public class WordFinder extends HangmanGame {
    //In class: Create function to process file input
    public String chooseRandomWordFromFile(int length) throws IOException {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> allWords = new ArrayList<>();


        //Lesen
        File f = new File("src/worksheet6/task3/words.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String word;
        while((word=br.readLine())!=null){
            allWords.add(word);
            if(word.length()==length)words.add(word);
        }
        br.close();


        //auswählen und löschen
        if(words.isEmpty()) return null;
        int i = (int)(Math.random()*words.size());
        String chosenWord = words.get(i);
        allWords.remove(chosenWord);


        //File leeren
        //if(!(f.delete() && f.createNewFile())) return chosenWord;


        //schreiben
        FileWriter fw = new FileWriter(f,false);
        try(BufferedWriter bw = new BufferedWriter(fw)) {
            for (String s : allWords) {
                bw.write(s);
                bw.newLine();
            }
        }


        //Rückgabe
        return chosenWord;
    }

    @Override
    protected void startGame() {
        int length = 4;
        try {
            currentWord = chooseRandomWordFromFile(length);

            if (currentWord == null) {
                System.out.println("No word found.");
                System.exit(0);
                return;
            }

            currentWord = currentWord.toLowerCase();
            guessedLetters.clear();
            attemptsLeft = 6;
            timeLeft = 60;


            updateDisplay();
            inputField.setEnabled(true);
            inputField.requestFocus();

            super.startGame();

        } catch (IOException e) {

            System.err.println(e.getMessage());
            System.exit(0);
        }
    }
}

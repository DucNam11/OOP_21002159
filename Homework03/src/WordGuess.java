import java.util.Random;
import java.util.Scanner;

public class WordGuess {
    public static String[] words = {"testing", "hello", "world", "template", "java", "maintaining", "computer", "processor", "university", "boolean", "string", "integer", "character", "indicator", "controller", "model", "view"};

    public static String secretWord;

    public static boolean[] secretWordMatches;

    public static void main(String[] args) {
        setSecretWord();
        runGame();
    }

    public static void setSecretWord() {
        Random rand = new Random();
        secretWord = words[rand.nextInt(words.length - 1)];
    }


    public static String getTrialWord() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < secretWord.length(); i++) {
            str.append((secretWordMatches[i] ? secretWord.charAt(i) : '_'));
        }
        return str.toString();
    }


    public static void checkTrialWord(char ch) {
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWordMatches[i]) {
                continue;
            }
            secretWordMatches[i] = (secretWord.charAt(i) == ch);
        }
    }

    public static void runGame() {
        Scanner in = new Scanner(System.in);
        secretWordMatches = new boolean[secretWord.length()];
        int trials = 0;
        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String trialWord = in.next();
            trials++;

            if (trialWord.length() == 1) {
                checkTrialWord(trialWord.charAt(0));
                trialWord = getTrialWord();
                System.out.printf("Trail %1$d: %2$s\n", trials, trialWord);
            }

            if (trialWord.equals(secretWord)) {
                System.out.println("Congratulation!");
                break;
            }
        }
        System.out.printf("You got in %d trials\n", trials);
    }
}

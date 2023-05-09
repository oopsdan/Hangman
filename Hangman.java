package oopsdan;

import java.util.Scanner;

public class Hangman {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Hangman! Player 1, please enter a word without spaces: ");
        String word = scanner.nextLine().toUpperCase();
        
        while (word.contains(" ")) {
            System.out.println("Invalid input! Please enter a word without spaces: ");
            word = scanner.nextLine().toUpperCase();
        }
        
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        
        char[] hiddenWord = new char[word.length()];
        for (int i = 0; i < hiddenWord.length; i++) {
            hiddenWord[i] = '_';
        }
        
        int incorrectGuesses = 0;
        boolean gameOver = false;
        
        while (!gameOver) {
            System.out.println("\n" + new String(hiddenWord));
            System.out.println("Player 2, please guess a letter: ");
            String guessInput = scanner.nextLine().toUpperCase();
            char guess = guessInput.isEmpty() ? ' ' : guessInput.charAt(0);
            
            if (guessInput.length() > 1) {
                System.out.println("Invalid input! Please enter only one letter.");
                continue;
            }
            
            if (!Character.isLetter(guess)) {
                System.out.println("Invalid input! Please enter a letter.");
                continue;
            }
            
            if (word.contains(guessInput)) {
                System.out.println("Correct!");
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        hiddenWord[i] = guess;
                    }
                }
            } else {
                System.out.println("Incorrect.");
                incorrectGuesses++;
            }
            
            switch (incorrectGuesses) {
                case 1:
                    System.out.println("  O");
                    break;
                case 2:
                    System.out.println("  O");
                    System.out.println("  |");
                    break;
                case 3:
                    System.out.println("  O");
                    System.out.println(" \\|");
                    break;
                case 4:
                    System.out.println("  O");
                    System.out.println(" \\|/");
                    break;
                case 5:
                    System.out.println("  O");
                    System.out.println(" \\|/");
                    System.out.println("  |");
                    break;
                case 6:
                    System.out.println("  O");
                    System.out.println(" \\|/");
                    System.out.println("  |");
                    System.out.println(" /");
                    break;
                case 7:
                    System.out.println("  O");
                    System.out.println(" \\|/");
                    System.out.println("  |");
                    System.out.println(" / \\");
                    System.out.println("Game over! Player 1 wins.");
                    System.out.println("The word was: " + word);
                    gameOver = true;
                    break;
            }
            
            if (new String(hiddenWord).equals(word)) {
                System.out.println("Congratulations! You have correctly guessed the word.");
                System.out.println("The word was: " + word);
                gameOver = true;
            }
        }
        
        scanner.close();
    }
    
}
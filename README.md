# Hangman

This is a Java implementation of the classic game Hangman. The game is designed to be played by two players: one player thinks of a word, and the other player tries to guess the word by suggesting letters one at a time. The game ends when the guessing player correctly guesses the word or runs out of guesses (and "hangs" the stick figure).

## How to Play

To play the game, simply run the `Hangman` class in the `oopsdan` package. The game will prompt the first player to enter a word (without spaces) for the other player to guess. The second player then takes turns guessing letters until they either correctly guess the word or run out of guesses.

### Rules

- The guessing player can only guess one letter at a time.
- The guessing player can only guess letters of the alphabet (uppercase or lowercase).
- The guessing player can only make a maximum of 7 incorrect guesses before losing the game.
- The game ends when the guessing player correctly guesses the word or makes 7 incorrect guesses.

## Implementation Details

The `Hangman` class uses a simple console-based interface to interact with the user. It uses a `Scanner` object to read user input from the console. The game logic is implemented using a loop that continues until the game is over (i.e., the word is guessed or the player runs out of guesses).

The `Hangman` class also includes a switch statement that prints a stick figure "hangman" as the player makes incorrect guesses. The figure is printed using ASCII art and gradually grows as the player makes more and more incorrect guesses.

## Future Improvements

- Add a way to limit the number of guesses the player can make (e.g., to make the game easier or harder).
- Add a way to read words from a file or database, so the first player doesn't have to enter a word manually.
- Add a way to display the number of guesses remaining or the letters that have already been guessed.

## Contributing

This program was created as a learning exercise and is not intended for production use. However, if you would like to contribute to the project, feel free to submit a pull request.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more information.

import java.util.Scanner;

public class Hangman {
	public static void main(String[] args) {
		// array of possible words to be generated
		String[] words = { "phone", "desk", "speaker", "wall", "orange", "water", "light", "paper", "pencil",
				"indigenous" };

		// essential variables
		String word = pickWord(words);
		String guesses = "";
		String firstPrint = "";
		String guessedString = "";
		String tempGuess;
		int sameGuess = 0;

		// scanner
		Scanner in = new Scanner(System.in);

		// creates initial blank _ _ _ _ ...for random word
		String[] guessed = new String[word.length()];
		for (int i = 0; i < guessed.length; i++)
			guessed[i] = "_ ";

		// header
		System.out.println("Hangman - K. Ostboe\n");

		// prints initial blank _ _ _ _ ... for random word
		for (int i = 0; i < word.length(); i++)
			firstPrint = firstPrint + "_ ";
		System.out.println(firstPrint + "  Used letters: {}\n");

		// gets first user guess and updates guesses string
		tempGuess = getUniqueGuess(in, guesses);
		guesses = guesses + tempGuess;

//MAIN LOOP, runs until word is guessed
		while (wordGuessed(word, guesses) == false) {
			// prints the letters correctly guessed in correct place in _ _ _ ...
			guessedString = "";
			guessed = printWord(word, guesses, guessed);
			for (int i = 0; i < guessed.length; i++)
				guessedString = guessedString + guessed[i];
			System.out.println(guessedString + "  Used letters: {" + guesses + "}\n");
			// gets another user guess
			tempGuess = getUniqueGuess(in, guesses);
			// tests whether user guessed same letter previously
			while (sameGuess == 0) {
				for (int i = 0; i < guesses.length(); i++) {
					if (tempGuess.charAt(0) == guesses.charAt(i)) { // gets new guess without printing correct letters
																	// or updating guesses string if letter is guessed
																	// more than once
						sameGuess = 0;
						tempGuess = getUniqueGuess(in, guesses);
					}
				}
				for (int i = 0; i < guesses.length(); i++) {
					if (tempGuess.charAt(0) != guesses.charAt(i)) { // if guess is unique, break loop and continue to
																	// print correct letters guessed
						sameGuess = 1;
					}
				}
			}
			sameGuess = 0; // resets same guess checker loop condition
			guesses = guesses + tempGuess; // updates guesses string
		} // end of MAIN LOOP

		// prints guessed word and total guesses and tells user how many guess attempts
		guessedString = "";
		guessed = printWord(word, guesses, guessed);
		for (int i = 0; i < guessed.length; i++)
			guessedString = guessedString + guessed[i];
		System.out.println(guessedString + "  Used letters: {" + guesses + "}\n");
		System.out.println("You guessed it in " + guesses.length() + " tries.");

		in.close();
	}

//essential functions

	// generates and returns random word from word bank (words)
	public static String pickWord(String[] words) {
		int choice = (int) (Math.random() * words.length);
		return words[choice].toUpperCase();
	}

	// gets a unique guess from user
	public static String getUniqueGuess(Scanner in, String guesses) {
		System.out.print("Enter a letter: ");
		guesses = in.next();
		System.out.print("\n");
		return guesses.toUpperCase();
	}

	// prints correct letters guessed in correct place
	public static String[] printWord(String word, String guesses, String[] guessed) {
		String guess;
		// checks each letter of word and checks if guess is correct for a letter
		for (int i = 0; i < word.length(); i++) {
			if (guesses.charAt(guesses.length() - 1) == word.charAt(i)) {
				guess = "" + word.charAt(i) + " ";
				guessed[i] = guess; // inserts guessed letter into correct place
			}
		}
		return guessed;
	}

	// evaluates if the word is guessed
	public static boolean wordGuessed(String word, String guesses) {
		boolean bool;
		int correctGuesses = 0;
		// adds up correct guesses
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < guesses.length(); j++) {
				if (guesses.charAt(j) == word.charAt(i))
					correctGuesses++;
			}
		}
		// determines if word is guessed based on whether # of correct guesses equal #
		// of letters in word
		if (correctGuesses == word.length()) {
			bool = true;
			return bool;
		} else {
			bool = false;
			return bool;
		}
	}

}

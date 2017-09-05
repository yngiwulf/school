package edu.seminolestate.hangman;
import java.util.*;
public class Hangman {

	public final int NUMBER_WRONG_GUESSES_ALLOWED = 5;
	private final String[] dictionary = {
			"trouble", "copyright", "problem", "form", "problem", "mythical", "discover",
			"consume", "document", "flame", "flow", "chart", "magnetic", "working",
			"predict", "subordinate", "making", "copy", "troublemaking",
			"uncopyrighted", "unmaledictory", "unpredictably"
			};
	private String mysteryWord;
	private StringBuilder mysteryWordWithDashes;
	private int numberOfIncorrectGuesses;
	private int numberOfCorrectGuesses;
	private char[] incorrectLettersGuessed;
	
	public Hangman() {
		java.util.Random randomWordNumber = new java.util.Random(dictionary.length-1);
		//this.mysteryWord = dictionary[randomWordNumber.nextInt()];
		int r = randomWordNumber.nextInt();
		System.out.println( "number of words: " + dictionary.length + " word number: " + r + " word: " + mysteryWord );
	}
	
	
	public boolean isCorrectLetter(char letter) {
		return false;
	}
	
	public boolean isCorrectWord (String word) {
		return false;
	}
	
	public String getMysteryWord() {
		return mysteryWord;
	}
	
	public String getMysteryWordWithoutDashes () {
		return this.mysteryWordWithDashes.toString();
	}
	
	public String getIncorrectLetters() {
		return incorrectLettersGuessed.toString();
	}
	
	public int getNumberOfGuessesLeft() {
		return this.NUMBER_WRONG_GUESSES_ALLOWED - this.numberOfIncorrectGuesses;
	}
	
	public boolean isWinner() {
		return false;
	}
	
}

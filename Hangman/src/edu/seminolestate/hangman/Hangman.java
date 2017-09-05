package edu.seminolestate.hangman;

public class Hangman {

	public int static final NUMBER_WRONG_GUESSES_ALLOWED;
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
		
	}
	
	public boolean isCorrectLetter(char letter) {
		
	}
	
	public boolean isCorrectWord (String word) {
		
	}
	
	public String getMysteryWord() {
		
	}
	
	public String getMysteryWordWithoutDashes () {
		
	}
	
	public String getIncorrectLetters() {
		
	}
	
	public int getNumberOfGuessesLeft() {
		
	}
	
	public boolean isWinner() {
		
	}
	
}

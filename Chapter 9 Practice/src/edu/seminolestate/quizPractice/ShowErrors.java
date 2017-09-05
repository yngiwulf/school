package edu.seminolestate.quizPractice;

public class ShowErrors {

	int numberOfErrors;
	
	public static void main(String[] args) {

		ShowErrors e = new ShowErrors(5);
		
		System.out.println("Number of Errors: " + e.numberOfErrors);
	}
	
	ShowErrors(int newNumberOfErrors) {
		numberOfErrors = newNumberOfErrors;
	}
	
	ShowErrors() {
		
	}

}

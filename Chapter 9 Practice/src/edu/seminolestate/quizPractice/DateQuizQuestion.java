package edu.seminolestate.quizPractice;

public class DateQuizQuestion {
	static java.util.Date[] dates = new java.util.Date[10];
	
	public DateQuizQuestion() {
		new java.util.Date();
	}
	
	public DateQuizQuestion(boolean ThisOne) {
		java.util.Date newDate = new java.util.Date();
		System.out.println("new date: " + newDate.toString());
	}
	
	public static void main(String[] args) {
		//System.out.println("Upper limit: " + dates[0].toString());
		
		//java.util.Date[] dates = new java.util.Date[10];

		if (dates[0] == null) { 
			System.out.println("date[0] is null");
		} 
		else { 
			System.out.println("date[0] is not null");
		};
		
		if (dates == null) { 
			System.out.println("dates is null");
		} 
		else { 
			System.out.println("dates is not null");
		};

		System.out.println("Upper bound: " + dates.length);
		
		changeArray();
		
		System.out.println("Upper bound: " + dates.length);
		
		DateQuizQuestion dqq = new DateQuizQuestion();
		
		System.out.println("dqq: " + dqq.toString());
		
		DateQuizQuestion dqq2 = new DateQuizQuestion(true);
		
		System.out.println("dqq2: " + dqq2.toString());
		
		
		
	}
	
	public static void changeArray() {
		dates = new java.util.Date[5];
	}
	
	public static void stuff(java.util.Date dates) {
		java.util.Date dtDates;
		
	}
	
	//public static void changeArrayAgain {
	//	dates = new java.util.Date();
	//}

}

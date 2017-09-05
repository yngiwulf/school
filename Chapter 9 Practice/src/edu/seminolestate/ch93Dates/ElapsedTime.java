package edu.seminolestate.ch93Dates;

public class ElapsedTime {
	java.util.Date dtElapsed = new java.util.Date();
	
	ElapsedTime(long seconds) {
		dtElapsed.setTime(seconds);
	}
	public String toString () {
		return "Elapsed: " + dtElapsed.toString();
	}
	
	public void setElapsedTime(long seconds) {
		dtElapsed.setTime(seconds);
	}
	
	public static void main (String[] args) {
		long seconds = 10000;
		
		ElapsedTime dtElapsed = new ElapsedTime(seconds);
		
		int i;
		for (i = 0; i < 8; i++) {
			System.out.println("i: " + i);
			System.out.println("seconds: " + seconds);
			dtElapsed.setElapsedTime(seconds);	
			System.out.println(dtElapsed.toString());
			seconds = seconds *10;
		}
		
	}
	
	
	

}

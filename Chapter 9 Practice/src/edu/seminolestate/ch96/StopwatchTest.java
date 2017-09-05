package edu.seminolestate.ch96;

public class StopwatchTest {

	public static void main(String[] args) {

		Stopwatch sw = new Stopwatch();
		System.out.println("Current: " + sw.getStartTime());
		
		sw.setWaitTime(999999999L);
		
		System.out.println("Elapsed: " + sw.getElapsedTime());
		System.out.println("End Time: " + sw.getEndTime());
		
		
	}

}

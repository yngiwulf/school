package edu.seminolestate.ch96;

public class Stopwatch {
	private java.util.Date startTime;
	private java.util.Date endTime;
	
	public Stopwatch() {
		startTime = new java.util.Date();
	}
	
	public String toString() {
		return startTime.toString();
	}
	
	public java.util.Date getStartTime() {
		return startTime;
	}
	
	public java.util.Date getEndTime() {
		return endTime;
	}
	
	public void setWaitTime(long waittime) {
		try {
			startTime.wait(waittime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public long getElapsedTime() {
		if (endTime == null) {
			endTime = new java.util.Date();
		}
		return endTime.getTime() - startTime.getTime();
	}

}

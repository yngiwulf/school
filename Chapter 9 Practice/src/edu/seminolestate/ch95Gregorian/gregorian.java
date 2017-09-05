package edu.seminolestate.ch95Gregorian;

public class gregorian {

	public static void main(String[] args) {
		java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
		System.out.println("Today: " + gc.get(gc.YEAR) + "-" + gc.get(gc.MONTH) + "-" + gc.get(gc.DAY_OF_MONTH));
		gc.setTimeInMillis(1234567898765L);
		System.out.println("Today: " + gc.get(gc.YEAR) + "-" + gc.get(gc.MONTH) + "-" + gc.get(gc.DAY_OF_MONTH));
		

	}

}

package edu.seminolestate.ch92Stock;

public class TestStock {

	public static void main(String[] args) {
		
		Stock s1 = new Stock("ORCL","Oracle Corporation");
		String s1Symbol = s1.symbol;
		String s1Name = s1.name;
		double s1Percent = s1.getChangePercent();
		
		System.out.println("Stock 1  Symbol " + s1Symbol + " Name: " + s1Name + " Percent Change: " + s1Percent);

	}

}

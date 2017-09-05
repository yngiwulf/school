package edu.seminolestate.ch92Stock;

class Stock {
	
	String symbol;
	String name;
	double previousClosingPrice = 34.5;
	double currentPrice = 34.35;
	
	
	Stock(String newSymbol, String newName) {
		symbol = newSymbol;
		name = newName;
	}
	
	double getChangePercent() {
		double changePercent = currentPrice/previousClosingPrice;
		return changePercent*100;
	}
	
	

}

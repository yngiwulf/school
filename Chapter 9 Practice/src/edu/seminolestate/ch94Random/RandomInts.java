package edu.seminolestate.ch94Random;

public class RandomInts {

	java.util.Random randInts;
	
	RandomInts() {
		randInts = new java.util.Random();
		
	}
	
	RandomInts(int seed) {
		randInts = new java.util.Random(seed);
	}
	
	public int getRandInts (int numberOfInts) {
		return randInts.nextInt(numberOfInts);
	}
	
	public String getRandIntsSeed () {
		return randInts.toString();
	}
	
	
	
	public static void main(String[] args) {
		int i;
		RandomInts ri = new RandomInts(100);
		for (i = 0; i <= 50; i++) {
			System.out.println("Rand Int " + i + ": " + ri.getRandInts(1000));
		}
		
		java.util.Random rand0 = new java.util.Random(100);
		for (i=0; i <= 50; i++) {
			System.out.println("Random " + i + ": " + rand0.nextInt(1000));
		}
	}

}

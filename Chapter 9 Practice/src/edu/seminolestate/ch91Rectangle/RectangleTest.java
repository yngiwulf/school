package edu.seminolestate.ch91Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		
		double r1Width = r1.width;
		double r1Height = r1.height;
		Double r1Perimeter = r1.getPerimeter();
		Double r1Area = r1.getArea();
		
		System.out.println("Rectangle 1  Width: " + r1Width 
				+ " Height: " + r1Height 
				+ "Perimeter: " + r1Perimeter 
				+ " Area: " + r1Area);
		
		Rectangle r2 = new Rectangle(40.0, 4.0);
		
		double r2Width = r2.width;
		double r2Height = r2.height;
		Double r2Perimeter = r2.getPerimeter();
		Double r2Area = r2.getArea();
		
		System.out.println("Rectangle 2  Width: " + r2Width 
				+ " Height: " + r2Height 
				+ " Perimeter: " + r2Perimeter 
				+ " Area: " + r2Area);

	}

}

package edu.seminolestate.ch99Geometry;

public class RegularPolygon {
	
	private int n = 3; //number of sides
	private double side = 1; //length of the side
	private double x = 0; //x-coordinate;
	private double y = 0; //y-coordinate;
	
	public RegularPolygon() {
		
	}
	
	public RegularPolygon(int n, double side) {
		this(n,side,0,0);
	}

	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static void main(String[] args) {


	}

}

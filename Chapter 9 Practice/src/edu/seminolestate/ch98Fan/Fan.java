package edu.seminolestate.ch98Fan;

public class Fan {
	
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	public Fan() {
		
	}
	
	public String toString() {
		return "Fan " +
				"color: " + color + 
				" on/off: " + (on ? "on":"off") + 
				" speed: " + (speed==1 ? "slow" : (speed==2 ? "medium" : (speed==3 ? "fast" : ""))) +
				" radius: " + radius;
	}

	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public boolean isOn() {
		return on;
	}



	public void setOn(boolean on) {
		this.on = on;
	}



	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public static void main(String[] args) {
		Fan fan1 = new Fan();
		fan1.setColor("Yellow");
		fan1.setRadius(10);
		fan1.setSpeed(FAST);
		System.out.println(fan1.toString());

		Fan fan2 = new Fan();
		fan2.setSpeed(MEDIUM);
		System.out.println(fan2.toString());		
		
	}

}

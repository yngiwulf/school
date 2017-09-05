package edu.seminolestate.ch91Rectangle;

class Rectangle {

	double height = 1.0;
	double width = 1.0;
	
	Rectangle() {
		
	}
	
	Rectangle (double newHeight, double newWidth) {
		height = newHeight;
		width = newWidth;
	}
	
	double getArea() {
		return height * width;
	}
	
	double getPerimeter() {
		return (2 * height) + (2 * width);
	}

}

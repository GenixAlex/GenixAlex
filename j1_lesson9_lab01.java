package javaclass;

public class j1_lesson9_lab01 {
/*9.1(The rectangle class)
 * Following the example of the Circle class in section 9.2,
 * design a class named rectangle to represent a rectangle.
 * The class contains:
 * 	-Two double data fields named width and height
 * 	 that specify width and height of the rectangle.
 * 		-default values for width and height are 1
 * 	-A no-arg constructor that creates a default rectangle
 * 	-A constructor that creates a default rectangle.
 * 	-A method named getArea( ) that returns the area of 
 * 	 this rectangle.
 * 	-A method named getPerimeter ( ) that returns the perimeter.
 * Draw the UML diagram for the class then implement the class.
 * Write a test program that creates two rectangle objects
 * 	-one with the width = 4, and height = 40
 * 	-another one with width = 3.5, and height =35.9
 * Display the width, height, area, & perimeter 
 * of each rectangle in this order
 */
	public static void main(String[] args) {
		// Creates object and assigns ref to rectangle1, and rectangle2
		// Create a Rectangle with width 4 and height 40
		Rectangle rectangle1 = new Rectangle (4, 40);
		// Create a Rectangle with width 3.5 and height 35.9
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		// Display the width, height, area, and perimeter of rectangle1
		System.out.println("\n Rectangle 1");
		System.out.println("-------------");
		System.out.println("Width:     " + rectangle1.width);
		System.out.println("Height:    " + rectangle1.height);
		System.out.println("Area:      " + rectangle1.getArea());
		System.out.println("Perimeter: " + rectangle1.getPerimeter());

		// Display the width, height, area, and perimeter of rectangle2
		System.out.println("\n Rectangle 2");
		System.out.println("-------------");
		System.out.println("Width:     " + rectangle2.width);
		System.out.println("Height:    " + rectangle2.height);
		System.out.println("Area:      " + rectangle2.getArea());
		System.out.println("Perimeter: " + rectangle2.getPerimeter());
	}
}
//Defines rectangle class
class Rectangle {
	double width;	// Width of rectangle
	double height;	// Height of rectangle
// A no-arg constructor that creates a default rectangle 
	Rectangle() {
		width = 1;
		height = 1;
	}
// A constructor that creates a rectangle with the specified width and height 
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	double getArea() {
	return width*height;
	}
	double getPerimeter() {
		return 2*width+height;
	}
}
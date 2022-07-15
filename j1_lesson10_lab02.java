package javaclass;

public class j1_lesson10_lab02 {
/*10.11 (Geometry: the Circle2D class)
 * Define the Circle2D class
 * -------------------------------------------------------------------------------
 * contains:
 * > 2 double data fields named x and y that specify the center of the
 * 	 circle with getter methods.
 * > A data field radius with a getting method
 * > A no-arg constructor that creates a default circle with:
 * 		- ( 0, 0 ) for ( x, y )
 * 		- 1 for radius
 * > A constructor that creates a circle with the specified x, y, & radius
 * > A method getArea( )
 * 		-that returns the area of the circle
 * > A method getPerimeter( )
 * 		-that returns the perimeter of the circle
 * > A method contains( double x, double y )
 * 		-that returns true if:
 * 			-the specified point ( x, y ) is inside the circle
 * > A method overlaps ( Circle2D circle )
 * 		-that returns true if:
 * 			-the specified circle overlaps with this circle
 *      FIGURE 10.21 (p. 405)
 *      (a) A point is inside the circle.
 *      (b) A circle is inside another circle.
 *      (c) A circle overlaps another circle.
 * -------------------------------------------------------------------------------
 * Write a test program that:
 * >Creates a Circle2D object:
 * 		-c1(new Circle2D(2, 2, 5.5)
 * >Displays its:
 * 		-area
 * 		-perimeter
 * 		-the results of:
 * 			>c1.contains(3,3)
 * 			>c1.contains(new Circle2D(4, 5, 10, 5))
 * 			>c1.overlaps(new Circle2D(3, 5, 2.3))
 * 
 * -------------------------------------------------------------------------------
 */
	public static void main(String[] args) {
	//Declarations and output
		//Creates Circle2D object
		Circle2D c1 = new Circle2D(2, 2, 5.5);
	    
	        System.out.println("Circle2D c1:");
	        System.out.println("Area:      " + c1.getArea());
	        System.out.println("Perimeter: " + c1.getPerimeter());
	        System.out.println("c1.contains(3, 3):\n      "
	                + c1.contains(3, 3)); //T
	        System.out.println("c1.contains(new Circle2D(4, 5, 10.5)):\n      "
	                + c1.contains(new Circle2D(4, 5, 10.5)));
	        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3))):\n      "
	                + c1.overlaps(new Circle2D(3, 5, 2.3))); 
	}
}
//--------------------------------------------------------------------------------
 class Circle2D{
	 private final double x;
	 private final double y;
	 private final double radius;
	 
//--------------------------------------------------------------------------------
	//No-arg constructor
	 Circle2D(){
		 //Default values for x,y and radius
		 x= 0;
		 y=0;
		 radius = 1;
		 }

//--------------------------------------------------------------------------------
	 Circle2D(double x, double y, double radius) {
		 this.x = x;
		 this.y = y;
         this.radius = radius;
		}
	 //getX method returns x
	public double getX() {
		return x;
	}
	//gety method returns y
	public double getY() {
		return y;
	}
	//getRadius method returns radius
	public double getRadius() {
		return radius;
	}
	//getArea methods returns area using equation for area
	public double getArea() {
		return Math.PI * radius * radius;
	}
	//getPerimeter method returns perimeter using equation for perimeter
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	 }
	//distance method returns distance using equation for distance
	double distance(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
	}
	//contains method returns 
	public boolean contains(double x, double y) {
		return distance (x,y)<radius;
	}
	public boolean contains(Circle2D circle) {
		return distance(circle.x, circle.y) <= Math.abs(radius - circle.radius);
	}

	public boolean overlaps(Circle2D circle) {
		return distance(circle.x, circle.y) <= radius + circle.radius
	                    && !contains(circle);
	}
}
 




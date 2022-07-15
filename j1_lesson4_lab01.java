package javaclass;
import java.util.Scanner;
public class j1_lesson4_lab01 {
/*
(Geometry: Area of a hexagon) The area of a hexagon can be computed using the 
following formula. (s is the length of a side):
                                      2       
                                 6 X S
                      Area = -----------------
                                        pi
                              4 X tan ( --- )
                                         6

Write a program that prompts the user to enter the side of a hexagon and displays
its area.         
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
//Get user input
	System.out.println("Enter length of side:");
	double s = input.nextDouble();
//Calculate area of hexagon.
	double area = (6 * Math.pow (s, 2) / 4 * Math.tan (Math.PI / 6));
//Output results
	System.out.printf("The are of the hexagon is %4.2f\n", area);
	}
}

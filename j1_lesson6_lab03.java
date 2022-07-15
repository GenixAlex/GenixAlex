package javaclass;
import java.util.Scanner;
public class j1_lesson6_lab03 {
/*
6.36 (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
in which all sides are of the same length and all angles have the same degree (i.e.,
the polygon is both equilateral and equiangular). The formula for computing the
area of a regular polygon is
				Area = (n * s^2) / (4 * tan(PI / n))
Write a method that returns the area of a regular polygon using the following header:
	public static double area(int n, double side)
Write a main method that:
prompts the user to enter the number of sides and 
Prompts the user to enter the side of a regular polygon and displays its area.
*/
	public static void main(String[] args) {
		//Creates scanner for user input
		Scanner input = new Scanner (System.in);
		//Gets user input for number of sides.
		System.out.println("Enter number of sides of polygon:");
		int n = input.nextInt();
		//Get user input for size of side for polygon
		System.out.println("Enter side of polygon:");
		double side = input.nextDouble();
//Displays area of polygon
		System.out.println("The area of the polygon is " + area(n, side));
		input.close();
	}
	public static double area(int n, double side) {
		//Returns outcome of equation for area of polygon
		return (n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n)));
		
		}
	}

package javaclass;
import java.util.Scanner;
public class j1_lesson4_lab02 {
/*
(Corner point coordinates) Suppose pentagon is centered at ( 0 , 0 ) with one point
at the 0 o'clock position as shown in figure 4.4c.
Write a program that prompts the user to enter the radius of the bounding circle of a pentagon
and displays the coordinates of the five corner points on the pentagon from p1 to p5
in this order.
Use the console to display two digits after the decimal point.         
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
//Get user input
System.out.println("Enter radius of bounding circle of a pentagon:");
double radius = input.nextDouble();
input.close();
System.out.println("The coordinates of five points on the pentagon are...");
for (int i = 0; i < 5; i++) {
	double x = radius * Math.cos((Math.PI / 2) * i);
	double y = radius * Math.sin(( Math.PI / 2) * i);
	System.out.printf("(%.2f, %.2f)\n", x, y);
		}
	}
}
package javaclass;
import java.util.Scanner;
public class j1_lesson2_lab02 {

	public static void main(String[] args) {
// creating Scanner		
	Scanner input = new Scanner(System.in);	
//Get starting velocity.	
	System.out.println("Enter starting velocity");
	double v0 = input.nextDouble();
//Get ending velocity.	
	System.out.println("Enter ending velocity");
	double v1 = input.nextDouble();
//Get time span.
	System.out.println("Enter time span in seconds ex:5.5");
	double t = input.nextDouble();
//Calculate velocity using formula: (v1-v0) /t to get average acceleration.
	double acceleration = v1-v0 / t;
// output results
	System.out.println("Average acceleration is:" + acceleration);
	}
}
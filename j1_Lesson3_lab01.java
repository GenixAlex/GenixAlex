package javaclass;
import java.util.Scanner;
public class j1_Lesson3_lab01 {
	/*
	(Health application: BMI) Revise listing 3.4 ComputeAndInterpretBMI to
	let the user enter weight, feet, and inches.
	For Example:
	If a person is 5 feet and 10 inches, you will enter
	5 for feet and 10 for inches                 
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);
	    
	    // Prompt the user to enter weight in pounds
	    System.out.print("Enter weight in pounds: ");
	    double weight = input.nextDouble();
	    
	    //Prompt user to enter feet in height.
	    System.out.println("Enter feet in height:");
	    double feet = input.nextDouble();
	    // Prompt the user to enter inches in height
	    System.out.print("Enter inches in height: ");
	    double inches = input.nextDouble();
	    
	    final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
	    final double METERS_PER_INCH = 0.0254; // Constant 
	    
	    // Compute BMI
	    double heightInches = (12 * feet) + inches;
	    double weightInKilograms = weight * KILOGRAMS_PER_POUND; 
	    double heightInMeters = heightInches * METERS_PER_INCH; 
	    double bmi = weightInKilograms / 
	      (heightInMeters * heightInMeters);

	    // Display result
	    System.out.println("BMI is " + bmi);
	    if (bmi < 18.5)
	      System.out.println("Underweight");
	    else if (bmi < 25)
	      System.out.println("Normal");
	    else if (bmi < 30)
	      System.out.println("Overweight");
	    else
	      System.out.println("Obese");
	}

}

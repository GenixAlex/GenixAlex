package javaclass;
import java.util.Scanner;
public class j1_lesson7_lab01 {
/* 7.9(Find the smallest element)
 * Write a method that finds the smallest element in an array of double values
 * using the following header:
 * 		public static double min (double[ ] array)
 * Write a program that prompts the user to enter 10 numbers
 * calls this method to return the minimum value, and displays the min value.
 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double [] arrayMin = new double [10]; //Creates array length of 10
		//Prompts user to input 10 numbers
		System.out.println("Enter 10 numbers:");
		for (int i = 0; i < arrayMin.length; i++) {
			arrayMin[i] = input.nextDouble();
	}
		//Displays minimum value
		System.out.println("The minimum number in value is:" + min(arrayMin));
		input.close();
}
	// Method min returns smallest element in the double value array.
	public static double min (double[] arrayMin) { 
		double min = arrayMin[0];	// The minimum value
		for (double i: arrayMin) {
			if (i < min)
				min = i;
		}
		return min;
	}

}

package javaclass;

import java.util.Scanner;

public class j1_lesson7_lab02 {
/* 7.14 (Computing gcd)
 * Write a method that returns the gcd of an unspecified number of integers.
 * The method header is as follows:
 * 		public static int gcd (int...numbers)
 * Write a test program that:
 * 	-Prompts the user to enter five numbers,
 * 	-calls the method to find gcd of these numbers,
 * 	-displays the gcd
 */
	public static void main(String[] args) {
		//Create scanner
		Scanner input = new Scanner (System.in);
		
		int [] value = new int [5]; //Creates array length of 5
		//Prompts user to input 5 numbers
		System.out.println("Enter 5 numbers:");
		for (int i = 0; i < value.length; i++) {
			value[i] = input.nextInt();
		}
		//calls gcd method
		int gcdNum = GCD(value);
		//Prints GCD
		System.out.println(gcdNum);
		input.close();
	}
	
		//Method returns the Greatest Common Divisor
		public static int GCD (int ...value) {
			int GCD = 1; //Initialization of GCD is 1 
			boolean isDivisor;
			for (int i = 2; i < minValue(value); i++) {
				isDivisor = true;
				for (int e: value) {
					if (e % i != 0)
						isDivisor = false;
				}
				if (isDivisor)
					GCD = i;
			}
			//Returns GCD to main method
				return GCD; 
	}
		//Returns smallest integer in an array
		public static int minValue(int... minInts) {
			int min = minInts[0]; 
			//use for-each loop, for each int inside of ":" minInts
			for (int lowestValue : minInts) {
				//If lowest value is less than min, min equals lowest value.
				if (lowestValue < min)
					min = lowestValue;
			}
			return min;
		}
	}
package javaclass;
import java.util.Scanner;

public class j1_lesson2_lab01 {
	/*
	(Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate, 
	then computes the gratuity and total.
	*/
	public static void main(String[] args) {
//creating scanner 
	Scanner input = new Scanner(System.in);
//Get sub total	
		System.out.println("Enter subtotal");
	double subTotal = input.nextDouble();
//Get gratuity
	System.out.println("Gratuity");
	double gratuity = input.nextDouble();
//Get gratuity total and total
	double gratuityTotal = subTotal * gratuity;
	double total = subTotal + gratuityTotal;
//outputting sub total, gratuity, and total
	System.out.println("Sub total:" + subTotal);
	System.out.println("Gratuity total:" + gratuityTotal);
	System.out.println("Total:" + total);
	}
}
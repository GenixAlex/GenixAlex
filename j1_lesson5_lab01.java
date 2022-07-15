package javaclass;
import java.util.Scanner;
public class j1_lesson5_lab01 {
	/*
	((Financial application: compute future tuition)) Suppose the tuition for a
	university is $10,000 this year and increases 5% every year. In one year the 
	tuition will be $10,500.
	Write a program that displays the tuition in 10 years, and the total cost of
	four years' worth of tuition after the tenth year.     
	*/
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// TODO Auto-generated method stub
	//Initialization of variables	
		double tuition = 10000;
		double total = 0;
//Tuition will increase by 5% until it years 10, then exit the loop.		
for (int year = 0; year < 10; year++  ) {
	tuition = tuition * 1.05;
//Calculates 4 years worth of tuition after the 10th year. 	
	if ( year >= 7) {
		total = total + tuition;
	}
}
	System.out.println("Tuition will be " + tuition + " in 10 years.");
	System.out.println("Total cost of four years worth of tuition is" + total);
	input.close();
	}
}

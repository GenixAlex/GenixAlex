package javaclass;
import java.util.Scanner;
public class j1_lesson3_lab02 {
	/*
	(Financial application: Monetary Units)Modify Listing 2.10
	Develop a program that changes a given amount of money into smaller monetary units.
	Program lets user: 
	enter an amount as a double value representing a total in dollars and cents
	outputs a report listing the monetary equivalent in the maximum
	numbers of dollars, quarters, dimes, nickels, and pennies.
	result: max number of coins
	convert to display only the nonzero denominations, using singular words 
	for single units such as 1 dollar and 1 penny, and plural words for more
	than one unit such as: 2 dollars and 3 pennies.                
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
//Receive the amount
		System.out.println("Enter an amount in double example 11.56:");
	double amount = input.nextDouble();
	
	int remainingAmount = (int) (amount * 100);
//Get number of one dollars
	int numberOfOneDollars = remainingAmount / 100;
	remainingAmount = remainingAmount % 100;
	
//Get number of quarters in remaining amount
	int numberOfQuarters = remainingAmount / 25;
	remainingAmount = remainingAmount % 25;
	
//Get number of dimes in remaining amount.
	int numberOfDimes = remainingAmount / 10;
	remainingAmount = remainingAmount % 10;
	
//Get number of nickels in remaining amount.
	int numberOfNickels = remainingAmount / 5;
	remainingAmount = remainingAmount % 5;
	
//Get number of pennies in remaining amount.
	int numberOfPennies = remainingAmount;
	
//Display results
	System.out.println("Your amount" + amount + " consists of ");
		if (numberOfOneDollars == 1) {
		System.out.println("Dollar:" + numberOfOneDollars);
	}if (numberOfOneDollars >1) {
	}System.out.println("Dollars:" + numberOfOneDollars);
		if (numberOfQuarters == 1) {
		System.out.println("Quarter:" + numberOfQuarters);
	}if (numberOfQuarters >1) {
	}System.out.println("Quarters:" + numberOfQuarters);
		if (numberOfDimes == 1) {
		System.out.println("Dime:" + numberOfDimes);
	}if (numberOfDimes >1) {
	}System.out.println("Dimes:" + numberOfDimes);
		if (numberOfNickels == 1) {
		System.out.println("Nickel:" + numberOfNickels);
	}if (numberOfNickels >1) {
	}System.out.println("Nickels" + numberOfNickels);
		if (numberOfPennies == 1) {
		System.out.println("Penny:" + numberOfPennies);
	}if (numberOfPennies >1) {
		System.out.println("Pennies:" + numberOfPennies);
	}
	System.out.println();
	}
}

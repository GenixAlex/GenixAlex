package javaclass;
import java.util.Scanner;
public class j1_lesson6_lab01 {
/* 6.7(Financial application: Compute future investment value) Write a method that: 
 * computes future investment at a given interest rate for a specified number of years.
 * Future investment is determined by by using the following formula:
 *                                                                                   * 13 
 *                                                                      numberOfYears
 * FututreInvestmentValue = investmentAmount x ( 1 + monthlyInterestRate)
 * Write a program that:
 * -Prompts user to input investment amount.
 * -Prompts user to input interest rate.
 * -Prints a table that displays future value for the years 1 to 30.
 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter investment amount:");
		final int numYears = 30; // Number of years to display

		// Prompt the user to enter the investment amount and interest rate
		System.out.print("\nThe amount invested: ");
		double amount = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		// Get monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;

		// Print a table that displays future value for the years from 1 to 30
		System.out.println("Years     Future Value"); // Table header
		for (int years = 1; years <= numYears; years++) {
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", 
				futureInvestmentValue(amount, monthlyInterestRate, years));
		}
		input.close();
	}
	// Method futureInvestmentValue computes future investment value
	public static double futureInvestmentValue (
	  double investmentAmount, double monthlyInterestRate, int years) {
			return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}


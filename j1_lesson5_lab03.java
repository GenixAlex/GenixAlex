package javaclass;
import java.util.Scanner;
public class j1_lesson5_lab03 {
	/*5.21(Financial application: Compare loans with various interest rates)
	 * Write a program that lets the user enter the: 
	 * 	-loan amount 
	 * 	-loan period in number of years 
	 * displays:
	 * 	-monthly payments 
	 * 	-total payments for each interest rate 
	 * 		- starting from 5% to 8%, with an increment of 1/8
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	//Initialization of variables for user input
		double loanAmount = 0;
		int loanPeriodYears = 0;
		double interestRate = 0.0;
		double y = 1;

	//User input for loan amount and period of years for loan.	
		System.out.println("Enter loan amount: ");
		loanAmount = input.nextDouble();
		System.out.println("Enter period of years for loan:");
		loanPeriodYears = input.nextInt();
	//Creates columns for: InterestRate, MonthlyPayment, Total Payment	
		System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
		
				//y = interestRate
				//Loop: Y loops 8 times.
				// y <= 8 : Prints when why is equal to 8 to print 8.000%
				for ( y = 5;  y <= 8 ; y+= 0.125) {
					//Interest rate increases through each iteration by 0.125. 
					//calculates monthly interest rate
					double monthlyInterestRate = y / 1200;
					
					//calculates monthly payments
					double monthlyPayments = loanAmount * monthlyInterestRate / (1 - (Math.pow(1/(1 + monthlyInterestRate), 12 * loanPeriodYears)));
					//Calculates total payments
					double totalPayments = monthlyPayments * 12 * loanPeriodYears;
					
					//Used to print out a % next to the interest rate value.
					String str = "%";
					// %8.3 : width of 8 for Interest Rate header title.
					// %19.2 : width of 19 for Monthly payments header title.
					// %22.2 : width of 22 for total payments header title.
		            System.out.printf("%8.3f%s%19.2f%22.2f\n", y, str,monthlyPayments,totalPayments );
		          //0.125 is the decimal value of 1/8
				}
			input.close();
	}
}
				
				
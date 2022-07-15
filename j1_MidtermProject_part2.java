package javaclass;
import java.util.Scanner;
public class j1_MidtermProject_part2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
/* Part 2: Account Saving Checking
* A bank in your town updates its customers' accounts at the end of each month.
* The bank offers two types of accounts:
* 		-Savings
* 		-Checking
* Every customer must maintain a minimum balance. If a customer's balance falls 
* below the minimum balance, there is a service charge:
* 		-$10.00 for savings
* 		-$25.00 for Checking accounts
* If the balance at the end of the month is at least the minimum balance, account receives:
* 		( a ) Savings accounts receives 4% interest.
* 		( b ) Checking accounts with balances of up to $5000 more than the minimum balance
* 			  receive 3% interests; otherwise, the interest is 5%.
* Write a program that:
* 	-Reads a customer's ...
* 		- account number ( int type )
* 		- account type ( char type; s/S for savings. c/C for checking)
* 		-minimum balance the account should maintain, and current balance. 
* Program should output
* 		-account number
* 		-account type
* 		-current balance
* 		-new balance
* Test your program by running it five times, using the following data
* 	46728 S 1000 2700
*	87324 C 1500 7689
*	  873 S 1000 800
*	89832 C 2000 3000
*	98322 C 1000 750
*/
		System.out.println("Enter account number:");
		int accountNum = input.nextInt();
		System.out.println("Enter account type:s for saving or c for checking:");
		char accountType = input.next().charAt(0);
		System.out.println("Enter minimum balance account should maintain");
		double minBal = input.nextDouble();
		System.out.println("Enter account balance:");
		double curBal = input.nextDouble();
		
		if (accountType == 'c' && curBal > minBal && (curBal - minBal) > 5000){
			double interestRate = curBal * 0.05;
			curBal = interestRate + curBal;
			}else if (accountType == 'c' && curBal > minBal && (curBal - minBal) < 5000){
				double interestRate = curBal * 0.03;
				curBal = interestRate + curBal;
				}else if (accountType == 's' && curBal > minBal){
					double interestRate = curBal * 0.04;
					curBal = interestRate + curBal;
					}else if (accountType == 's' && curBal < minBal){
						double serCharge = 10.00;
						curBal = curBal - serCharge;
						}else{
							double serCharge = 25.00;
							curBal = curBal - serCharge;
			}
		System.out.printf("%-1s%19s%19s\n", "Account#", "Type", "Balance");
		System.out.printf("%d%20s%20.2f",accountNum, accountType, curBal);	
		}
	}

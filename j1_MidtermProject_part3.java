package javaclass;
import java.util.Scanner;
public class j1_MidtermProject_part3 {
/*Part 3: Parking Charges
* A parking garage charges a $2.00 minimum parking fee for up to three hours.
* The garage charges an additional $0.50 per hour for each hour or part
* thereof in excess of three hours.
* The maximum charge for any given 24-hour period is $10.00.
* Assume that no car parks for longer than 24 hrs at a time.
* Write an application that calculates parking charges.
* Displays the parking charges for each customer who parked in the garage yesterday.
* You should enter the hours parked for each customer.
* The program should display the charge for the current customer
* should calculate and display the running total of yesterdays's receipts.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int customerNum = 1; //Keeps track of customers
		int numOfHours = 0; // Number of hours parked
		double parkingCharge = 0; //Total charges for everybody
		double fee = 0; //Parking fee for over 3hrs
		double runningTotal = 0; //totalCharges for everybody.
		//Prompts user to input 1 or 2. 1 assigns user as yesterdays customer
		//2 for current customer
		System.out.println("Enter 1 to input yesterday's customers, enter 2 to input the current customer, enter -1 to quit");
		int userInput = keyboard.nextInt();
		
		while (userInput != -1){// takes in user inputs until user inputs -1
			//User inputs something that's not 1 or 2
			if(userInput != 1 && userInput != 2){
				System.out.println("Invalid option selected!");
			}
			//user input option 1
			else if(userInput == 1){
				System.out.printf("Input the number of hours parked for customer %d,", customerNum);
				numOfHours = keyboard.nextInt();
				//Customer parked for three or less hours
				if(numOfHours <= 3){
					parkingCharge = 2.00;
				} else { //customer parked for more than three hours
					fee = 0.50;
					parkingCharge = 2.00 + (fee * (numOfHours - 3));
				}
				runningTotal = runningTotal + parkingCharge;
				//print the parking charge for this particular customer
				System.out.printf("Customer %s%5.2f\n", customerNum, parkingCharge);
				customerNum++;
			} else if (userInput == 2) { //user input option 2
				System.out.printf("Input the number of hours parked for customer %d,", customerNum);
				numOfHours = keyboard.nextInt();
					parkingCharge = 2.00;
			   }if (numOfHours <= 3){ //customer parks for more than three hours
						parkingCharge = 2.00; 
			   }else{
				   fee = 0.50;
					parkingCharge = 2.00 + (fee * (numOfHours - 3)); 
			}
			System.out.println("Enter 1 to input yesterday's customers, enter 2 to input the current customer, enter -1 to quit");
			userInput = keyboard.nextInt();
		}
		//user input -1; print yesterday's total parking charges
		System.out.printf("%.02f", runningTotal);
		}

	}

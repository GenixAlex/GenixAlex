package javaclass;
import java.util.Scanner;
public class j1_MidtermProject_part1 {

	public static void main(String[] args) {
		//Creates scanner for user input
		Scanner input = new Scanner (System.in);
/* Part 1: Calculating Sales
* Online retailer sells five products whose retail prices are as follows:
* 	-Product 1: $2.98
* 	-Product 2: $4.50
* 	-Product 3: $9.98
* 	-Product 4: $4.49
* 	-Product 5: $6.87
* Write an application that reads a series of pairs of numbers as follows:
* 	(a) Product number
* 	(b) Quantity Sold
* Program should:
* 	-Use a switch statement to determine the retail price for each product
* 	-Calculate and display the total retail value of all products sold
* 	-Use a sentinel-controlled loop to determine when the program should stop looping
* and display the final results
*/	
	int product; // Product number entered by user
	int quantity; // Number of items sold entered by user
	double price; // Price of each product
	double totalCounter; // Total for the week
	double cost = 0;
	double cost1 = 0;
	double cost2 = 0;
	double cost3 = 0;
	double cost4 = 0;
	// Initialization 
	double totalCost = 0; // clears total, // The total for all products sold
	totalCounter = 0; // prepare to loop
	Scanner keyboard = new Scanner(System.in);
	//User inputs product number and quantity sold
	System.out.println("Enter product number (1-5),or -1 to quit");
	product = keyboard.nextInt();

	while ( product >= 1 && product <= 5) {
		//Switch multiple-selection structure
		switch ( product ) {
		case 1:
			System.out.println("Enter number of quantities sold for product 1:");
			quantity = keyboard.nextInt();
			price = 2.98;
			cost = cost + (price * quantity);
			break;
		
		case 2:
			System.out.println("Enter number of quantities sold for product 2:");
			quantity = keyboard.nextInt();
			price = 4.50;
			cost1 = cost1 + (price * quantity);
			break;
		
		case 3:
			System.out.println("Enter number of quantities sold for product 3:");
			quantity = keyboard.nextInt();
			price = 9.98;
			cost2 = cost2 + (price * quantity);
			break;
		
		case 4:
			System.out.println("Enter number of quantities sold for product 4:");
			quantity = keyboard.nextInt();
			price = 4.49;
			cost3 = cost3 + (price * quantity);
			break;
		
		case 5:
			System.out.println("Enter number of quantities sold for product 5:");
			quantity = keyboard.nextInt();
			price = 6.87;
			cost4 = cost4 + (price * quantity);
			System.out.print("price of line five: $" + cost4);
			break;
		default:
		}
		// Calculate products sold
		// Show results:
			System.out.println("Enter product number (1-5),or -1 to quit");
			product = keyboard.nextInt();
	}
	//prints the table for Product Number and Quantity Sold
	//Creates columns for: Product Number, Quantity Sold
		System.out.printf("%-1s%20s\n", "Product Number", "Quantity Sold");
		System.out.printf("%-1s%20.2f\n", "Product 1", cost);
		System.out.printf("%-1s%20.2f\n", "Product 2", cost1);
		System.out.printf("%-1s%20.2f\n", "Product 3", cost2);
		System.out.printf("%-1s%20.2f\n", "Product 4", cost3);
		System.out.printf("%-1s%20.2f\n\n", "Product 5", cost4);
		totalCost = cost + cost1+ cost2 + cost3 + cost4;
		System.out.printf("The total retail value of all product's is: $%.2f",totalCost);
	}
}


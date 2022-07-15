package javaclass;

import java.text.DecimalFormat;
import java.util.Scanner;

public class j1_finalProjectB2_CashRegister extends j1_finalProjectA2_RetailItem {


	public static void main(String[] args) {
	      // Creates a Scanner
	            Scanner input = new Scanner(System.in);
	            DecimalFormat df = new DecimalFormat("#0.00");

	            RetailItem items = new RetailItem();
	            CashRegister CashRegister1 = new CashRegister();
	            int choice = 0;
	   do {
	      System.out.println("Input which item you would like to purchase.");
	      System.out.println("Input 1 = Jacket");
	      System.out.println("Input 2 = Designer Jeans");
	      System.out.println("Input 3 = Shirt");
	      System.out.println("Input 4 = exit the system:");
	      choice = input.nextInt();
	   }while(choice>=3); 
	         switch (choice) {
	         case 1: 
	            System.out.println("Input quantity of item:");
	            int quantity = input.nextInt();
	            RetailItem.SubtractAmount(quantity);
	            break;
	         case 2:
	            System.out.println("Input quantity of item:");
	            break;
	         case 3:
	            System.out.println("Input quantity of item:");
	            break;
	         default: choice = 0;
	         }
	      }
	   }

	class CashRegister{
	   private int quantityOfItems;
	   private double salesTax = 0.06;
	   private double subtotal;
	   double total;
	   private String description;
	   double price;
	   private RetailItem retailItemObject;
	   //--------------------------------------------------------------------------------
	   public CashRegister(){// Creates a class constructor
	      //Sets default
	      quantityOfItems = 0;
	      subtotal = 0;
	      total = 0;
	      description = "";
	      price = 0;
	   }
	   //--------------------------------------------------------------------------------
	   public CashRegister(RetailItem retailItemObject, int quantity){
	      quantityOfItems = quantity;
	      this.retailItemObject = retailItemObject;
	   }


	      public void SetCashRegister( int quantity) {
	         quantityOfItems = quantity;
	      }
	   //---------------------------------------------------------------------------------
	//Setter/Mutator methods
	   public void setRetailItemObject(RetailItem newRetailItemObject) {
	      retailItemObject = newRetailItemObject;
	   }

	   public void setSalesTax(double newSalesTax ) {
	      salesTax = newSalesTax;
	   }
	//---------------------------------------------------------------------------------
	//Getter/accessor methods

	   public double getSubtotal(RetailItem retailItemObject){
	      return quantityOfItems * retailItemObject.getPrice();
	   }
	   public double getTax(){
	      return subtotal * salesTax;
	   }
	   public double getTotal(){
	      return subtotal + getTax();
	   }
	   public String toString()
	   {
	      return "Items Sold: ";
	   }

	}
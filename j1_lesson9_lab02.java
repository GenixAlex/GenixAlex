package javaclass;

public class j1_lesson9_lab02 {
/*9.7 ( The account class )
 * Design a class named account that contains:
 * 	/>A private int data field named id for the account (default 0)
 *	/>A private double data field named balance for the account (default 0)
 * 	/>A private double data field named annualInterestRate that store the current
 * 	 interest rate ( default value 0 ).
 * 		-Assume that all accounts have the same interest rate.
 * 	/>A private Date data field named dateCreated that stores the date
 * 	 when the account was created.
 * 	/>A no-arg constructor that creates a default account
 * 	/>A constructor  that creates an account with the specified id and
 * 	 initial balance.
 * 	/>The accessor and mutator methods for id, balance, and annualInterestRate.
 * 	/>The accessor method for dateCreated
 * 	/>A method named getMonthlyInterestRate( ) that returns the monthly interest
 * 	 rate.
 * 	/>A method named getMonthlyInterest( ), that returns the monthly interest
 * 	/>A method named withdraw that withdraws a specified amount from the account.
 * 	/>A method named deposit that deposits a specified amount.
 * ----------------------------------------------------------------------------
 * Draw a UML diagram for the class, then implement the class.
 * HINT: The method getMonthlyInterest( ) is to return monthly interest, not
 * the interest rate.
 * ----------------------------------------------------------------------------
 * monthlyInterest = balance * monthlyInterestrate
 * monthlyInterestRate = annualInterestRate / 12
 * annualInterestRate = annualInterestRate(4.5%) / 100
 * ----------------------------------------------------------------------------
 * Write a test program that:
 * 	>Creates an Account object with an ID of 1122
 * 		-a balance of $20,000
 * 		-annual interest of 4.5%
 * 	>Use the withdraw method to withdraw $2,500
 * 	>Use the deposit method to deposit $3,000
 * 	>Print the:
 * 		-balance, Monthly interest, and the date when the account was created
 * ----------------------------------------------------------------------------------------
 */
	public static void main(String[] args) {
//Account ID 1122, account beginning balance 20000, Annual Interest rate 4.5%/100
		Account account1 = new Account();//Account object
		account1.setDateCreated();//calls setDateCreated
		System.out.println("This account was created at " + account1.getDateCreated());
		account1.setId(1122);//calls setId
		account1.setBalance(20000);
		System.out.println("Balance:" + account1.getBalance());
		account1.setAnnualInterestRate(4.5);
		account1.withdraw(2500);//$2,500 is withdrawn
		account1.deposit(3000);//$3,00 is deposited
		java.util.Date dateCreated = new java.util.Date();//date initializer
		
		System.out.println("Account ID:" + account1.getId());
		System.out.println("Interest Rate:" + account1.getAnnualInterestRate());
		System.out.println("Balance after withdraw of 2500: " + account1.getBalance());
		System.out.println("Balance after deposit of 3000: " + account1.getBalance());
		System.out.println("Monthly Interest:" + account1.getMonthlyInterest());
	}
}
//----------------------------------------------------------------------------------------------------------------
class Account {
	//Declaration of data fields
	  private int id;
	  private double balance;
	  private double annualInterestRate;//stores the current interest rate
	  private java.util.Date dateCreated;//stores the date account created
 
 
//-----------------------------------------------------------------------------------------------------------------	
//A no-arg constructor that creates a default 
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
//-----------------------------------------------------------------------------------------------------------------
//constructor with specific id and initial balance

	public Account(int id2, double balance2) {
	      id = id2;
	      balance = balance2;
	      dateCreated = new java.util.Date();
	}
//----------------------------------------------------------------------------------------------------------------
//MUTATOR METHODS:id, balance, and annualInterestRate.

	public void setId(int newId) {//Setter method sets id
		id = newId;
	}
	public void setBalance(double newBalance) {//Setter method sets balance
		 balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate ) {//Setter method sets annual interest rate
		annualInterestRate = newAnnualInterestRate;
	}

	public void setDateCreated(  ) {
		dateCreated = new java.util.Date();
}
	
//-----------------------------------------------------------------------------------------------------------------
//ACCESSOR METHODS:id, balance, and annualInterestRate.
	
	public int getId(){//Getter method returns id
		return id;
	}
	public double getBalance(){//Getter method returns balance
		return balance;
	}
	public double getAnnualInterestRate(){//Getter method returns Annual Interest Rate
		return annualInterestRate/100;
	}
//method named getMonthlyInterestRate( ) that returns the monthly interest rate.
	public java.util.Date getDateCreated () {//setter method sets date
		return dateCreated;
	}
	public double getMonthlyInterestRate () {
		 return getAnnualInterestRate() / 12;
	}
//method named getMonthlyInterest( ), that returns the monthly interest
	public double getMonthlyInterest() {
		return balance*getMonthlyInterestRate();
	}
//method named withdraw that withdraws a specified amount from the account
	public void withdraw (double amount) {
		 balance = getBalance() - amount;
	}
//method named deposit that deposits a specified amount.
	public void deposit(double amount) {
		balance = getBalance() + amount;
	}
}



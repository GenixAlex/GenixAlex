package javaclass;
public class j1_lesson6_lab02 {
	/* 6.11 (Financial application: compute commissions) Write a method that computes the
	 * commission, using the scheme in programming exercise 5.39. 
	 * 
	 * The header of the method 
	 * is as follows:
	 * public static double computeCommission ( double salesAmount)
	 * 
	 * Write a test program that displays the following table:
               Sales Amount        Commission
               --------------------------------
               10000                 900.0
               15000                1500.0
               ...
               95000               11100.0
               100000              11700.0
               commission = salesAmount * commissionRate;
     *5.39 (Financial application: find the sales amount) You have just started a sales job
 * in a department store. Your pay consists of a base salary and a commission. The
 * base salary is $5,000. The scheme shown below is used to determine the commission rate.
 * <p>
 * Sales Amount --------- Commission Rate
 * <p>
 * $0.01–$5,000 --------------- 8 percent
 * <p>
 * $5,000.01–$10,000 ---------- 10 percent
 * <p>
 * $10,000.01 and above ------- 12 percent
 * <p>
 * <p>
 * Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
 * $5000 is at 10%, and the rest is at 12%. If the sales amount is:
 *  25,000, the commission is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
     *
	 */
	public static void main(String[] args) {
        System.out.println("Sales  Commission Amount");
        //prints the table for sales and commission amount
        for (int sales = 10000; sales <= 100000; sales += 5000) {
            System.out.print(sales);
            System.out.print("   ");
            System.out.printf("%.1f\n", computeComission(sales)); //calling a method to compute the commission
		}
	}
	//method declaration
	public static double computeComission (double salesAmount) {
		//declare commission variable
		double commission; //= salesAmount * commissionRate; ----removing this. you can just declare the "commission" variable here. no need to assign anything to it yet, especially since you don't have a value for commissionRate yet.

		//if sales is less than $5000 commission rate is just 8%
		if ( salesAmount <= 5000 ) {
			commission = salesAmount * 0.08;
			//salesAmount -= 5000; ----removing this, not sure why it's needed here
		//if sales is more than $5000 (but less than $10000), use 8% commissionRate for the first $5000 and then 10% commissionRate for the rest
		} else if (salesAmount <= 10000) {
			salesAmount -= 5000;
			commission = (5000 * 0.08) + (salesAmount * .10);
		//if sales is more than $10000 use 8% commissionRate for the first $5000, 10% commissionRate for the next $5000, and 12% commissionRate for the rest
		} else {
			commission = (5000 * 0.08);
			salesAmount -= 10000;

			commission += (5000 * .10);
			salesAmount -= 10000;

			commission += salesAmount * .12;
			
		}
			//return the calculated commission back to the main method
			return commission;
		}
	}

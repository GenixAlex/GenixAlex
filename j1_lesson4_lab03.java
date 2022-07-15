package javaclass;
import java.util.Scanner;
public class j1_lesson4_lab03 {
	/*
	(Convert letter grade to number) Write a program that prompts the user to enter
	a letter grade: A, B, C, D, or F.
	Then display its corresponding numeric value: 4, 3, 2, 1, or 0.
	For other input display invalid grade
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creates Scanner			    
	    Scanner input = new Scanner (System.in);
	    //Get user input
	  	System.out.println("Enter letter grade EXAMPLE F: ");
	  	char ch = input.next().charAt(0);
	  	
	  	int gradeNum;
	  	//convert to uppercase letter
	  	ch = Character.toUpperCase(ch);
	  	//check if user input is valid
	  	if(ch >= 'A' && ch <= 'F' && ch != 'E') {
	  		//assign a number based on the letter that the user input
	  		switch (ch) {
	            case 'A': gradeNum = 4;
	            case 'B': gradeNum = 3;
	            case 'C': gradeNum = 2;
	            case 'D': gradeNum = 1;
	            case 'F': gradeNum = 0;
	            default: gradeNum = -1;
	        }
	  		System.out.printf("Input is valid. %d", gradeNum);
	  	}else {
	  		System.out.println("Invalid input");
	  		}
	  	}
	    
}
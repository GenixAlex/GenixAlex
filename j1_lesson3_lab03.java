package javaclass;
import java.util.Scanner;
public class j1_lesson3_lab03 {
	/*
(Palindrome integer) Write a program that prompts the user to enter a
three-digit integer and determines whether it is a palindrome integer.
An integer is a palindrome if it reads the same from right to left and left to right.
A negative integer is treated the same as a positive integer.                
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three digit integer.");
        int digits = input.nextInt();
        boolean palindrome = (digits / 100 == (digits % 10));
        if(palindrome)
                System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");

	}
}

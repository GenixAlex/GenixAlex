package javaclass;
import java.util.Scanner;
public class j1_lesson5_lab02 {
	/* (Find the highest score) Write a program that prompts the user to
	    enter the number of student's name and score, and finally displays
	    the name of the students with the highest score
	    use the next() method in the Scanner class to read a name, rather 
	    than using the nextLine() method
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// TODO Auto-generated method stub
		//initialize variables: 
		String x = ""; //user input student name
		int y = 0; //user input student score
		int i = 0; //used to iterate While loop
		int highestScore = 0; //holds the current highest score
		String highScorer = ""; //holds the name of the student with the highest score
		
		//allow user to input 5 different student names + scores
		while (i < 5) {
			System.out.print("Enter student name: ");
			//capture user input for student name
			x= input.next();
			System.out.print("Enter students score:");
			//capture user input for student's score
			y = input.nextInt();
			//if user's input is higher than the current highest score,
			//replace it with the user's input.
			//also replace the name of the student
			if (highestScore < y) {
				highestScore = y;
				highScorer = x;
			}
			//increment loop
			i++;
		}
		//print highest score
		System.out.println("Highest Score:" + highestScore);
		//print student's name
		System.out.println("High scoring student:" + highScorer);
		//close input
		input.close();
	}
}

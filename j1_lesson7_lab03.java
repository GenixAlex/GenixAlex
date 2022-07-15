package javaclass;
public class j1_lesson7_lab03 {
/* 7.17 (Sort Students)
 * Write a program that:
 * 	-Prompts the user to:
 * 		-Enter the number of students
 * 		-the students names
 * 		-Their scores
 * Prints:
 * 		-Student names in decreasing order of their scores.
 * Assume the name is a string without spaces.
 * Use the Scanner's next() method to read a name.
 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner (System.in);
		String [] studentNames = new String [input.nextInt()];
		int [] listScores = new int [studentNames.length];
		
		
		System.out.println("Enter the name & score of each student:");
		for(int i = 0; i < studentNames.length; i++) {
		System.out.println("Student" + (i + 1) + ":");
		studentNames[0] = input.nextLine();
		System.out.println("Score: ");
		listScores[0] = input.nextInt();
	}
		input.close();
		sort (studentNames, listScores);
}
		// Sorts a string and integer array in decreasing order
		public static void sort(String [] str, int[] num) {
			for (int i = 0; i < num.length; i++) {
				int max = num[i];
				int maxIndex = i;
				String temp;

				// Find the minimum in the list[i..nums.length - 1]
				for (int j = i + 1; j < num.length; j++) {
					if (num [j] > max) {
						max = num[j];
						maxIndex = j;
					}
				}
				//If maxIndex is not equal to i, swap string array
				if (maxIndex != i) {
					// Swap string array
					temp = str[i];
					str[i] = str[maxIndex];
					str[maxIndex] = temp;

					// Swap int array
					num[maxIndex] = num[i];
					num[i] = max;
				}
		}
	}
}


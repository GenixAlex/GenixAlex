package javaclass;

public class j1_lesson8_lab01 {
/*8.3 (Sort students on grades)
 *Re-write listing 8.2 GradeExam.java, to display the students in
 *increasing order of the number of correct answers 
 */
	public static void main(String[] args) {
		//Student answers to questions
		char[][] answers = {
			//    0    1    2    3    4    5    6    7    8    9
		/*0*/	{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
			    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
			    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
			    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		// Key to the questions
	    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
	    // Student numbers and correct answers
	    int[][] correctCounts = new int[answers.length][2];
	    
	    // Grade all answers
	    for (int i = 0; i < answers.length; i++) {
	      // Grade one student
	      for (int j = 0; j < answers[i].length; j++) {
	    	  //if student answer is equal to the key, add 1 to their score
	        if (answers[i][j] == keys[j]) {
	    
	        	correctCounts[i][0] = i;
				correctCounts[i][1]++;
	      }
	    }
	  }
	    sort(correctCounts);
		 // Display sorted matrix
		 		for (int row = 0; row < correctCounts.length; row++) {
		 			System.out.println("Student " + correctCounts[row][0] + 
		 				"'s correct count is " + correctCounts[row][1]);  
		 		}
	}
	// sort sorts by column 1 in ascending order 
	public static void sort(int[] [] m) {
		for (int i = 0 ; i < m.length; i++ ) {
			//Locate minimum in column 1
				int minCol1 = m[i][1];
				int minCol0 = m[i][0];
				int minIndex = i;
				for (int j = i ; j < m.length; j++ ) {
					if (minCol1 > m[j][1]) {
						minCol1 = m[j][1];
						minCol0 = m[j][0];
						minIndex = j;
					}
				}
				//Initiates swap
				if (minIndex != i) {
					m[minIndex][1] = m[i][1];
					m[minIndex][0] = m[i][0];
					m[i][1] = minCol1;
					m[i][0] = minCol0;
				}
		}
	}
}
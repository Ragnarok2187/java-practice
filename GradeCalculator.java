package practiceProject;
import java.util.Scanner;
/**
 *  Asks how many scores to enter (at least 1)
 *  Collects each score, re-asking if it's not 0-100
 *  Averages the scores and prints the letter grade
 */
public class GradeCalculator {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);



		//Getting input
		System.out.print("How many scores? ");
		int nmbrOfScores = kbd.nextInt();

		//Loop so that if there are less than one score it'll reprint 
		while(nmbrOfScores<1) {
			System.out.print("Must be one or more scores. How many scores? ");
			nmbrOfScores = kbd.nextInt();
		}


		int total = 0; 
		for (int i=1; i<=nmbrOfScores ; i++) {
			System.out.print("Enter score "+i+": ");
			int studentScore = kbd.nextInt();


			while(studentScore <0 || studentScore>100) {
				System.out.print("Score must be 0-100. Enter a new score " +i+": ");
				studentScore = kbd.nextInt();
			}

			total += studentScore; // I moved this to outside while loop so that bad number doesn't get added in
		}

		//Calculate average
		int averageScore =  total / nmbrOfScores; 

		// Check the average score to see what letter grade the student gets
		char grade; 

		if(averageScore>=90) {
			grade = 'A';
		}else if (averageScore>=80){
			grade = 'B';
		}else if (averageScore >=70) {
			grade='C';
		}else if (averageScore >= 60){
			grade = 'D';
		}else {
			grade = 'F';  // Kick out else if the grade is anything below 60 then its an F
			System.out.println("Your student didn't pass");
		}

		// Final print out
		System.out.println("Your student's average grade across "+nmbrOfScores+" scores is: " +  averageScore + "%");
		System.out.println("Your student's grade is: " + grade);

		kbd.close();
	}

}

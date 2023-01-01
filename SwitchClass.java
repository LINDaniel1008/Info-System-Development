public class switchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if score > 90              ==> grade is A
		// if score from 80 to 90     ==> grade is B
		// if score from 70 to 80     ==> grade is C
		// if score from 60 to 70     ==> grade is D
		// if score < 60              ==> grade is F
		
		int score = 95;
		char grade = 'Z';
		String feedback = "";
		
		if (score >= 90)
			grade = 'A';
		else if (score >= 80) //score is in the 80s
			grade = 'B';
		else if (score >= 70) //score is in the 70s
			grade = 'C';
			else 
				grade = '?';
		System.out.printf("Grade: %s", grade);
		
		switch (score / 10) // it has to be a single value, not a range
		{
		case 10: // combine case 10 and 9 together
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = '?';
			break;
		}
		// if grade is A, feedback is "Awesome"
		// if grade is B, feedback is "Beautiful"
		// if grade is C, feedback is "Completed"
		// if grade is D, feedback is "Done"
		// if grade is F, feedback is "Forget it"
		
		switch (grade)
		{
		case 'A':
			feedback = "Awesome";
			break;
		case 'B':
			feedback = "Beautiful";
			break;
		case 'C':
			feedback = "Completed";
			break;
		case 'D':
			feedback = "Done";
			break;
		case 'F':
			feedback = "Forget it";
			break;
		default:
			feedback = "Not sure of your grade";
			break;
		}
		System.out.printf("\nFeedback is %s", feedback);
	}

}

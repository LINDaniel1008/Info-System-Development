import java.util.Scanner;
public class Grades
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String studentName = "";
		int score = 0;
		char grade = 'Z';
		
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Letter Grade Calculator");
		System.out.print("What's your name? ");
		studentName = inputDevice.nextLine();
		System.out.printf("Enter an integer score for %s: ",studentName);
		score = Integer.parseInt(inputDevice.nextLine());
		if (score >= 90)
		{
			grade = 'A';
			System.out.printf("The grade for this class is %s. You passed. Awesome!",grade);
			System.out.println("\nKeep doing what you're doing.");
		}
		else if (score >= 80)
		{
			grade = 'B';
			System.out.printf("The grade for this class is %s. You passed. Beautiful!",grade);
			System.out.println("\nKeep doing what you're doing.");
		}
		else if (score >= 70)
		{
			grade = 'C';
			System.out.printf("The grade for this class is %s. You passed. Completed!",grade);
			System.out.println("\nDo better next semester.");
		}
		else if (score >= 60)
		{
			grade = 'D';
			System.out.printf("The grade for this class is %s. You passed. Done!",grade);
			System.out.println("\nDo better next semester.");
		}
		else if (score < 60)
		{
			grade = 'F';
			System.out.printf("The grade for this class is %s. You failed. Forget it happened!",grade);
		}

		inputDevice.close();

	}

}

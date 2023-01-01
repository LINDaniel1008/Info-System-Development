import java.util.Scanner;
public class MP1
{
	static int studentNum = 3;
	static String[] studentName;
	static double[][] studentScore;
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int scoreNum = 0;
		double result1 = 0.0;
		double result2 = 0.0;
		double result3 = 0.0;
		char command = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.print("How many scores for student? ");
		scoreNum = Integer.parseInt(scan.nextLine());
		studentName = new String[3];
		studentScore = new double[3][scoreNum];
		
		// Enter scores for student1
		System.out.print("\nEnter name for student 1: ");
		studentName[0] = scan.nextLine();
		studentName[0] = studentName[0].toUpperCase(); // Make the student name to uppercase
		System.out.printf("\nEntering scores for %s",studentName[0]);
		System.out.println();
		for(int i = 0; i < studentScore[0].length; i++ )
		{
			System.out.printf("Quiz %d: ", i+1);
			studentScore[0][i] = Double.parseDouble(scan.nextLine());
		}
		
		// Enter scores for student2
		System.out.print("\nEnter name for student 2: ");
		studentName[1] = scan.nextLine();
		studentName[1] = studentName[1].toUpperCase(); // Make the student name to uppercase
		System.out.printf("\nEntering scores for %s",studentName[1]);
		System.out.println();
		for(int j = 0; j < studentScore[1].length; j++ )
		{
			System.out.printf("Quiz %d: ", j+1);
			studentScore[1][j] = Double.parseDouble(scan.nextLine());
		}
		
		// Enter scores for student3
		System.out.print("\nEnter name for student 3: ");
		studentName[2] = scan.nextLine();
		studentName[2] = studentName[2].toUpperCase(); // Make the student name to uppercase
		System.out.printf("\nEntering scores for %s",studentName[2]);
		System.out.println();
		for(int k = 0; k < studentScore[2].length; k++ )
		{
			System.out.printf("Quiz %d: ", k+1);
			studentScore[2][k] = Double.parseDouble(scan.nextLine());
		}
		
		do
		{
			printMenu();
			System.out.print("\nEnter choice number, or x to exit: ");
			command = scan.nextLine().charAt(0);
			switch(command)
			{
				// Class Average
				case '1':
					
					result1 = classAverage(scoreNum);
					System.out.printf("Class average for all quizzes is %.2f", result1);
					System.out.println();
					break;
				
				// Student Average
				case '2':
					String name1 = "";
					String name2 = "";
					int studentPosition = -1;
					System.out.println("\nCalculating average by student.");
					System.out.print("\nEnter student name: ");
					name1 = scan.nextLine();
					name2 = name1.toUpperCase();
					for(int i = 0; i < 3; i++)
					{
						if(studentName[i].equals(name2))
						{
							studentPosition = i;
							System.out.printf("%s's scores are: ", name1);
							for(int j = 0; j < scoreNum; j++)
							{
								System.out.printf("%.2f ",studentScore[studentPosition][j]);
							}
							result2 = studentAverage(studentPosition, scoreNum);
							System.out.printf("\n%s's average is %.2f", name1, result2);
							break;
						}
							
					}
					if(studentPosition == -1)
					{
						System.out.println("Student not found.");
					}
					break;	
				
				// Quiz Average
				case '3':
					int quizNumber = 0;
					System.out.println("\nCalculating average by Quiz Number");
					System.out.print("Enter Quiz number: ");
					quizNumber = Integer.parseInt(scan.nextLine());
					result3 = quizAverage(quizNumber);
					System.out.printf("\nQuiz %d average is %.2f", quizNumber, result3);
					break;
				
				default:
					System.out.println("Please enter a valid value.");
					break;
					
			}
			System.out.println("\n\nPress Enter to continue......"); // ask user to press enter to continue 
			String userResponse = "no";
			userResponse = scan.nextLine();
			if(userResponse.equalsIgnoreCase(""))
			{
				continue;
			}
			else
			{
				command = 'x';
			}
		
		
		}while(command != 'x');
		
	}
	
	public static void printMenu()
	{
		System.out.println("\n\n\n\t\tMenu");
		System.out.println("1. Class Average");
		System.out.println("2. Student Average");
		System.out.println("3. Quiz Average");
	}
	// method for Class Average
	public static double classAverage(int scoreNum)
	{
		int totalNum = 0;
		double classAvg = 0.0;
		double totalScore = 0.0;
		for(int l = 0; l < studentNum; l++)
		{
			for(int m = 0; m < studentScore[l].length; m++)
			{
				 totalScore = studentScore[l][m] + totalScore;
			}
			
		}
		totalNum = scoreNum * 3; // the total number of scores is the score for each student multiply by the number of the student
		classAvg = totalScore / totalNum; // the average of the class is the total of all the scores divided by the total number of scores
		return classAvg;
	}
	
	// method for Student Average
	public static double studentAverage(int studentPosition, int scoreNum)
	{
		double totalScore = 0.0;
		double studentAvg = 0.0;
		for(int n = 0; n < studentScore[studentPosition].length; n++)
		{
			totalScore = studentScore[studentPosition][n] + totalScore; // totalScore for each student is the sum of the score in student's score array
		}
		studentAvg = totalScore / scoreNum; // the student's score average is the totalScore of student multiply by the number of student score
		return studentAvg;
	}
	
	// method for Quiz Average
	public static double quizAverage(int number)
	{
		double totalScore = 0.0;
		double avg = 0.0; // quiz average
		// since the array starts from 0, we should make the number of score minus 1 to match the array
		totalScore = studentScore[0][number-1] + studentScore[1][number-1] + studentScore[2][number-1]; // for the same quiz, each student has a same column
		avg = totalScore / 3; // average score for the quiz is the total score multiply by the student number(3)
		return avg;
	}
	
}

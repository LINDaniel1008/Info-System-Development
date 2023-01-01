import java.util.Scanner;
public class TwoDArrays
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner inputDevice = new Scanner(System.in);
		
		// store test scores for 3 students
		// each student will have 2 test scores
		
		// declare a 2D array
		int[][]testScores;
		
		// initialize the 2D array;
		testScores = new int[3][2];
		
		// loop thru all students
		for(int i = 0; i < testScores.length; i++)
		{
			// loop thru all test for each student
			for(int j = 0; j < testScores[i].length; j++)
			{
				System.out.printf("Enter test score (%d, %d): ", i, j);
				testScores[i][j] = Integer.parseInt(inputDevice.nextLine());
			}
		}
		
		
		for(int i = 0; i < testScores.length; i++)
		{
			// loop thru all test for each student
			for(int j = 0; j < testScores[i].length; j++)
			{
				System.out.printf("%d ", testScores[i][j]);
			}
			
			System.out.println();
		}

	}

}

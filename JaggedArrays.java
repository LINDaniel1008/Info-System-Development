import java.util.Scanner;
public class JaggedArrays
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		// declare variables
		int[][] scores;
		int scoreTotal;
		double scoreAvg;
		int scoreCount;
		int totalNum;
		
		// initialize the arrays
		scores = new int[3][];
		
		// create header of the program
		System.out.println("\t\tTest Average Calculator");
		System.out.println();
		
		
		// create for loop for traversing through rows
		totalNum = 0;
		scoreTotal = 0;
		for(int i = 0; i < scores.length; i++)
		{
			// prompt the user to enter how many scores the current Student will have
			System.out.printf("How many scores for Student %d? ", i+1);
			scoreCount = Integer.parseInt(scan.nextLine());
			totalNum = totalNum + scoreCount;
			scores[i] = new int[scoreCount];
			System.out.printf("\nEnter Scores for Student %d", i+1);
			System.out.println();
			for(int j = 0; j < scores[i].length; j++)
			{
			System.out.printf("Score %d: ", j+1);
			scores[i][j] = Integer.parseInt(scan.nextLine());
			scoreTotal = scores[i][j] + scoreTotal;
			}
			System.out.println();
			
		}
		// calculate the average
		scoreAvg = (float)scoreTotal / totalNum;
		
		// print the number of scores present
		System.out.printf("There were %d scores.", totalNum);

		// print the average to the Console
		System.out.printf("\nThe class average for all test is %.2f",scoreAvg);

		scan.close();
	}

}

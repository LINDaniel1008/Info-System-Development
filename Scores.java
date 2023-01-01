import java.util.Scanner;
public class Scores
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		// declare variables
		int[] scores;
		String[] names;
		
		// initialize the arrays
		scores = new int[5];
		names = new String[5];
		
		// create header of the program
		System.out.println("\t\tStudnt Grade System");
		System.out.println("\nThis program will store student grades and look them up for you.");
		System.out.println("\n***********************************");
		System.out.println("Enter names. One name per line.");
		System.out.println("***********************************");
		
		// create prompts for the user to enter names
		System.out.println("\n");
		for(int i = 0; i < names.length; i++)
		{
		System.out.print("Enter name: ");
		names[i] = scan.nextLine();
		}
		System.out.println("\n\n***********************************");
		System.out.println("Enter scores. One score per line.");
		System.out.println("***********************************");
		
		// create prompts for the user to enter scores
		System.out.println("\n");
		for(int j = 0; j < scores.length; j++)
		{
		System.out.printf("Enter score for %s: ",names[j]);
		scores[j] = Integer.parseInt(scan.nextLine());
		}
		
		// put in a couple of new lines to create whitespace
		System.out.println("\n\n");
		
		// print the data user entered
		String a = "Name";
		String b = "Score";
		System.out.println("You entered the following data:");
		System.out.println();
		System.out.printf("%-10s %10s",a, b);
		System.out.println();
		for(int k = 0; k < scores.length; k++)
		{
		System.out.printf("%-10s %10d",names[k], scores[k]);
		System.out.println();
		}
		
		scan.close();
	}

}

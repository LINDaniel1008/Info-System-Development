import java.util.Scanner;
public class GradeSystem 
{
	// declare static variables
	private static int[] scoreArray;
	private static String[] nameArray;
	
	// main method
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		scoreArray = new int[5];
		nameArray = new String[5];
		String studentName = "";
		int studentPosition = 0;
		System.out.println("\t\tStudent Grade System");
		System.out.println("\nThis program will store student grades and look them up for you.");
		populateNameArray();
		populateScoreArray();
		
		
		String userResponse = "";
		do
		{
			System.out.print("\n\n\nEnter name of student whose score you want to find: ");
			studentName = scan.nextLine();
			studentPosition = findStudentPosition(studentName);
			if(studentPosition == -1)
			{
				System.out.println("I'm sorry. There is no student by the name.");
				System.out.println("\nPress Enter key to exit.....");
				userResponse = scan.nextLine();
			}
			else
			{
				System.out.printf("%s's score is %d", studentName, scoreArray[studentPosition]);
				System.out.println("\nPress Enter key to exit.....");
				userResponse = scan.nextLine();
			}
		}while(!userResponse.equalsIgnoreCase(""));
		
		
	}
	// populateNameArray method
	public static void populateNameArray()
	{
		System.out.println("\n*********************************");
		System.out.println("Enter the names of 5 students");
		System.out.println("*********************************\n\n");
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < nameArray.length; i++)
		{
			nameArray[i] = scan.nextLine();
		}
		
		
	}
	
	// populateScoreArray method
	public static void populateScoreArray()
	{
		System.out.println("\n\n\n*********************************");
		System.out.println("Enter scores. One score per line");
		System.out.println("*********************************\n\n");
		Scanner scan = new Scanner(System.in);
		for(int j = 0; j < scoreArray.length; j++)
		{
			System.out.printf("Enter score for %s: ", nameArray[j]);
			scoreArray[j] = Integer.parseInt(scan.nextLine());
		}
		
	}
	
	// findStudent method
	public static int findStudentPosition(String nameOfStudent)
	{
		int position = -1;
		for(int k = 0; k < nameArray.length; k++)
		{
			if(nameArray[k].equals(nameOfStudent))
			{
				position = k;
				break;
			}
			
		}
		return position;
	}
	
	
	

}

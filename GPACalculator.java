import java.util.Scanner;
public class GPACalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String[] grade;
		int[] credit;
		int sumPoints = 0;
		int sumCredits = 0;
		double gpa = 0.0;
		
		grade = new String[4];
		credit = new int[4];
		
		System.out.println("\t\tGPA Calculator");
		System.out.println("\n\n\n\nThis program will calculate GPAs based on course grades");
		for(int i = 0; i < 4; i++)
		{
		System.out.print("Enter grade: ");
		grade[i] = scan.nextLine();
		System.out.print("Enter number of credits for grades: ");
		credit[i] = Integer.parseInt(scan.nextLine());
		System.out.println();
		}
		for(int i = 0; i < 4; i++)
		{
			if(grade[i].equalsIgnoreCase("A"))
			{
				sumPoints = sumPoints + 4 * credit[i];
				sumCredits = sumCredits + credit[i];
			}
			else if(grade[i].equalsIgnoreCase("B"))
			{
				sumPoints = sumPoints + 3 * credit[i];
				sumCredits = sumCredits + credit[i];
			}
			else if(grade[i].equalsIgnoreCase("C"))
			{
				sumPoints = sumPoints + 2 * credit[i];
				sumCredits = sumCredits + credit[i];
			}
			else if(grade[i].equalsIgnoreCase("D"))
			{
				sumPoints = sumPoints + 1 * credit[i];
				sumCredits = sumCredits + credit[i];
			}
			else
			{
				sumPoints = sumPoints + 0 * credit[i];
				sumCredits = sumCredits + credit[i];
			}
		
		}
	
		gpa = (float)sumPoints / sumCredits;
		System.out.printf("The GPA is %.2f", gpa);
		
		scan.close();
	}

}

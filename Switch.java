import java.util.Scanner;
public class SwitchExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String StudentID = "";
		int StudentType = 0;
		double GPA = 0.0;
		String Thesis = "";
		String Dissertation = "";
		String ZIP = "";
		
		
		System.out.println("\tStudent Information System");
		System.out.print("\nEnter Student ID: ");
		StudentID = scan.nextLine();
		System.out.println("\n\n\n1. Undergraduate\n2. Graduate\n3. PhD\n4. Non-degree Certificate");
		System.out.print("\nEnter option (1-4): ");
		StudentType = Integer.parseInt(scan.nextLine());
		System.out.print("\nEnter ZIP code: ");
		ZIP = scan.nextLine();
		
		switch (StudentType)
		{
			case 1:
				System.out.print("Enter GPA: ");
				GPA = Double.parseDouble(scan.nextLine());
				break;
			case 2:
				System.out.print("Enter thesis title: ");
				Thesis = scan.nextLine();
				break;
			case 3:
				System.out.print("Enter dissertation title:");
				Dissertation = scan.nextLine();
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid option was selected");
				
		}
		System.out.println("\n****** Recorded Data ******");
		System.out.println("Student ID: " + StudentID);
		System.out.println("ZIP: " + ZIP);
		switch (StudentType)
		{
			case 1:
			case 4:
				System.out.printf("GPA: %.2f",GPA);
				break;
			case 3:
				System.out.printf("Dissertation: %s",Dissertation);
				break;
			case 2:
				System.out.printf("Thesis: %s", Thesis);
				break;
				
			
		}
		System.out.println("\n\nPress Enter to exit...");
		scan.close();

	}

}

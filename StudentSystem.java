import java.util.ArrayList;
import java.util.Scanner;
public class StudentSystem 
{
	// State / Attributes / Variables / Fields
	private static ArrayList<Student> studentRoster;

	// Behaviors / Operations / Methods
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// Call the loadStudents() method
		loadStudents();

	}

	private static void loadStudents()
	{
		// Instantiate the studentRoster Arraylist. The Arraylist do not need their size specified
		studentRoster = new ArrayList<>();
		
		// Declare a boolean variable, continueLoop and initialize it to false
		boolean continueLoop = false;
		
		// Declare local variables for storing student name and ID
		String studentName = "";
		String studentId = "";
		String userResponse = "";
		
		// Create a do-while loop, and keep looping while continueLoop is true
		do
		{
			// Set continueLoop to false. We are assuming that the user does not want to enter any more students
			continueLoop = false;
			
			// Ask the user for the name and ID of a new student. Store them in the appropriate variables
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter Student Name: ");
			studentName = scan.nextLine();
			System.out.print("Enter Studetn ID: ");
			studentId = scan.nextLine();
			
			// Instantiate a new student object by calling its constructor and pass it the necessary arguments in the correct order
			Student temptStudent = new Student(studentName, studentId);
			
			// Store the temptStudent reference in the studentRoster data structure
			studentRoster.add(temptStudent);
			
			// Ask if the user would like to "create" another student. Read input and store it in a string
			System.out.println("\nDo you want to enter information for another student?");
			System.out.print(" Enter 'Y' for Yes. Any other key for No. ");
			userResponse = scan.nextLine();
			
			// Using an if statement, test to see if the user entered a "Y"
			if(userResponse.equalsIgnoreCase("y"))
			{
				continueLoop = true;
			}
			System.out.println();
		}while(continueLoop == true);
		
		// Loop through all the students in the studentRoster using a for-each(i.e. enhanced) loop and print out a list of students
		String a = "Name";
		String b = "ID";
		System.out.printf("\n%-15s %s\n",a, b);
		for(Student s : studentRoster)
		{
			
			System.out.printf("%-15s %s", s.getName(), s.getId());
			System.out.println();
		}
	}

}

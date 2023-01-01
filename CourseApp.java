import java.util.Scanner;
public class CourseApp 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		// Declare two object references, courseOne and courseTwo of type Course
		Course courseOne;
		Course courseTwo;
		
		// Instantiate a new Course object. Store the resulting reference in your Course object reference
		courseOne = new Course();
		courseTwo = new Course();
		
		// Course One
		// Set the coursePrefix and courseNumber using setter
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the first course prefix: ");
		String temptString1 = scan.nextLine();
		courseOne.setCoursePrefix(temptString1);
		System.out.print("Please enter the course number: ");
		int temptInt1 = Integer.parseInt(scan.nextLine());
		courseOne.setCourseNumber(temptInt1);
		
		// Set the college name using setter
		Course.setCollegeName("ASU");
		System.out.printf("\nA new Course have been created for %s %d at %s.\n", courseOne.getCoursePrefix(), courseOne.getCourseNumber(),Course.getCollegeName());
		
		// Call the displayMessage() method for the objects
		courseOne.displayMessage();
		
		// Course Two
		// Set the coursePrefix and courseNumber using setter
		System.out.print("\n\nPlease enter the second course prefix: ");
		String temptString2 = scan.nextLine();
		courseTwo.setCoursePrefix(temptString2);
		System.out.print("Please enter the course number: ");
		int temptInt2 = Integer.parseInt(scan.nextLine());
		courseTwo.setCourseNumber(temptInt2);
		
		// Set the college name using setter
		Course.setCollegeName("ASU");
		System.out.printf("\nA new Course have been created for %s %d at %s.\n", courseTwo.getCoursePrefix(), courseTwo.getCourseNumber(),Course.getCollegeName());
		
		// Call the displayMessage() method for the objects
		courseTwo.displayMessage();
	}

}

import java.util.ArrayList;
import java.util.Scanner;
public class References 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// Place a println() statement showing that you are going to pass an array by value
		System.out.println("\t\t**** Passing References - Reading 5 Names ****");
		System.out.println("\n\n\nMain Method: Passing an Array, nameArray, by-value");
		
		// Declare an array of strings as a local variable and call it nameArray. Initialize & allocate 5 elements
		String[] nameArray = new String[5];
		// Call the readStudentNames method and pass the nameArray as an argument
		readStudentsNames(nameArray);
		// Print the value of the strings inside the array to the Console
		System.out.println("\nMain Method: The contents of nameArray are:");
		for(int i = 0; i < 5; i++)
		{
			System.out.println(nameArray[i]);
		}
		
		// Place a println() statement showing that you are going to pass an array by value
		System.out.println("\nMain Method: Passing an ArrayList, nameArrayList, by-value");
		
		// Declare and initialize an ArrayList of Strings as a local variable. Name it nameArrayList
		ArrayList<String> nameArrayList;
		nameArrayList = new ArrayList<>(5);
		// Call the readStudentNames method and pass nameArrayList as an argument
		readStudentsNames(nameArrayList);
		// Using a for-each loop, iterate through the nameArrayList
		System.out.println("\nMain Method: The contents of nameArrayList are:");
		for(String x : nameArrayList)
		{
			System.out.println(x);
		}
		

	}
	
	// Implement readStudentNames method
	public static void readStudentsNames(String[] stringArray)
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("readStudentNames Method: Putting values inside stringArray parameter");
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("Enter name %d: ", (i+1));
			stringArray[i] = scan1.nextLine();
		}
		
		
	}
	
	// Implement another readStudentNames method
	public static void readStudentsNames(ArrayList<String> stringList)
	{
		Scanner scan2 = new Scanner(System.in);
		String name = "";
		System.out.println("readStudentNames Method: Putting values inside stringListParameter");
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("Enter name %d: ", (i+1));
			name = scan2.nextLine();
			stringList.add(name);
			
		}
		
		
	}

}

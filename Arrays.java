import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arrays
		// declare an array of strings
		// syntax: dataType[] variable
		
		String[] studentNames;
		int [] testScores;
		
		// initialize (or actually create) the array
		// syntax: variablename = new dataType[size]
		studentNames = new String[3];
		testScores = new int[10];
		
		studentNames[2] = "Marry";
		testScores[2] = 95;
		
		Scanner inputDevice = new Scanner(System.in);
		// loop thru or traverse the array
		for(int i = 0;i < studentNames.length; i++)
		{
			System.out.print("Enter a student name: ");
			
			// read input from the user and store it inside the array element using a subscript
			studentNames[i] = inputDevice.nextLine();
			
			System.out.printf("Enter test score for %s: ", studentNames[i]);
			testScores[i] = Integer.parseInt(inputDevice.nextLine());
		}
		// retrieve values from both arrays
		for(int j = 0; j < studentNames.length; j++)
		{
			System.out.printf("Element %d of Student Names array is %s whose test score is %d\n", j,studentNames[j],testScores[j]);
		}
		
		// enhanced for loop, it take away your control of lcv
		for(int aScore:testScores)
		{
			System.out.printf("Test Score is %d: ", aScore);
		}
	}

}

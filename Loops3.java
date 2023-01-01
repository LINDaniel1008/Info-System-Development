import java.util.Scanner;
public class Loops
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String inputValue = "";
		int inputNum = 0;
		double avgNum = 0.0;
		int total = 0;
		int count = 0;
		
		System.out.println("\t\tIn-class: Logic and Looping Exercises");
		System.out.println("\n\n\nAverage Demo using Do Loop");// do loop
		System.out.println("\nCalculates an average of all numbers entered. Enter \"x\" when finished entering numbers.");
		
		do 
		{
			System.out.print("Enter number: ");
			inputValue = scan.nextLine();
			if(inputValue.equalsIgnoreCase("x"))
			{
				break;
			}
			else
			{
				inputNum = Integer.parseInt(inputValue);
				total = total + inputNum;
				count++;
			}
			avgNum = (float)total / count;
			
		}while(!inputValue.equalsIgnoreCase("x"));
		System.out.printf("The average of all numbers is %.2f", avgNum);
		
		// reset the value of the variables
		total = 0;
		count = 0;
		avgNum = 0.0;
		inputValue = "";
		inputNum = 0;
		
		
		System.out.println("\n\n\nAverage Demo using While loop"); // while loop
		System.out.println("\nCalculates an average of all numbers entered. Enter \"x\" when finished entering numbers.");
		while(!inputValue.equalsIgnoreCase("x"))
		{
			System.out.print("Enter number: ");
			inputValue = scan.nextLine();
			if(inputValue.equalsIgnoreCase("x"))
			{
				break;
			}
			else
			{
				inputNum = Integer.parseInt(inputValue);
				total = total + inputNum;
				count++;
			}
		}
		avgNum = (float)total / count;
		System.out.printf("The average of all numbers is %.2f", avgNum);
		System.out.println("\nCheck to see that the average produced using while and do is identical.");
		
		// creating a triangle pattern using nested for loops
		
		for (int i = 1; i <= 10; i++) // outer for loop or i loop
		{
			// inner for loop or j loop
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}
	

}

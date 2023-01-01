import java.util.Scanner;
public class Methods 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int result = 0;
		int calNum = 0;
		// test the overloaded product method by providing it with two arguments
		System.out.println("*** Testing Product method using 2 arguments: 5 and 2***");
		result = product(5,2);
		System.out.printf("The product is %d", result);
		
		// test the overloaded product method by providing it with three arguments
		System.out.println("\n\n*** Testing Product method using 3 arguments: 2, 3, and 5***");
		result = product(2, 3, 5);
		System.out.printf("The product is %d", result);
		
		// test the overloaded calculateAverage() method with one integer argument
		System.out.println("\n\n*** Testing Average Method With 3 Arguments: 10, 20, and 30***");
		System.out.printf("The avergae is %.2f", calculateAverage(10, 20, 30));
		
		// test the overloaded calculateAvergae() method with one integer argument
		System.out.println("\n\n*** Testing Average Method With Integer Argument***");
		System.out.println("This method will calculate the average of all numbers from 1 to n.");
		System.out.print("Enter n: ");
		Scanner scan = new Scanner(System.in);
		calNum = Integer.parseInt(scan.nextLine());
		System.out.printf("The average is %.2f", calculateAverage(calNum));
		
		
		

	}
	
	// declare the product method
	private static int product(int param1, int param2)
	{
		int result = 0;
		result = param1 * param2;
		return result;
	}
	
	// declare another product method (making it an overload method)
	private static int product(int param1, int param2, int param3)
	{
		int result = 0;
		result = param1 * param2 * param3;
		return result;
	}
	
	// declare the calculateAverage method
	private static double calculateAverage(int p1, int p2, int p3)
	{
		double result = 0.0;
		result = (p1 + p2 + p3) / 3;
		return result;
	}
	
	// declare another calculateAverage method (making it an overload method)
	private static double calculateAverage(int p1)
	{
		int Count = 0;
		int Sum = 0;
		double result = 0.0;
		for(int i = 1; i <= p1; i++)
		{
			Sum = Sum + i;
			Count++;
		}
		result = (float)Sum / Count ;
		return result;
	}

}

import java.util.ArrayList;
public class Methods 
{
	static ArrayList<Integer>  listOfNumbers =  new ArrayList<Integer>();
	public static void main(String[] args)
	{
		int prodResult = 0;
		// TODO Auto-generated method stub
		
		// Test the printGreetings method
		printGreetings();
		
		// Test the product method
		System.out.println("\n*** Testing Product and return values ***");
		prodResult = product(5, 2);
		System.out.printf("The product of 5 and 2 is %d", prodResult);
		
		// Test the concatenate method
		System.out.println("\n\n*** Testing Concatenate and nested method calls ***");
		System.out.printf("The return value is \"%s\"", concatenate("Hello", "World"));
		
		// Test the listContains method
		System.out.println("\n\n***Testing ArrayList Search ***");
		boolean numberFound = false;
		addTestData();
		// Testing number 4
		System.out.println("Testing if the number 4 is present in the ArrayList.....");
		numberFound = listContains(4);
		if(numberFound == true)
		{
			System.out.println("numberList contains the number 4");
		}
		else
		{
			System.out.println("numberList does not contains the number 4");
		}
		// Testing number 56
		System.out.println("\nTesting if the number 56 is present in the ArrayList.....");
		numberFound = listContains(56);
		if(numberFound == true)
		{
			System.out.println("numberList contains the number 56");
		}
		else
		{
			System.out.println("numberList does not contains the number 56");
		}
		
		// Test the divide method
		System.out.println("\n*** Testing Divide and return values ***");
		double quotient = 0.0;
		quotient = divide(7, 6);
		System.out.printf("The result of dividing 7 and 6 is %.4f", quotient);
			
	}
	
	// Method 1
	private static void printGreetings()
	{
		System.out.println("Hello");
	}
	
	// Method 2
	private static int product(int param1, int param2)
	{
		int result2 = 0;
		result2 = param1 * param2;
		return result2;
	}
	
	// Method 3
	private static String concatenate(String param1, String param2)
	{
		String result3 = "";
		result3 = param1 + param2;
		return result3;
	}
	
	// Method 4
	private static double divide(int param1, int param2)
	{
		double quotient = 0.0;
		quotient = (double)param1 / param2;
		return quotient;
	}
	
	// Method 5
	private static void addTestData()
	{
		listOfNumbers.add(23);
		listOfNumbers.add(34);
		listOfNumbers.add(45);
		listOfNumbers.add(56);
	}
	
	// Method 6
	private static boolean listContains(int param1)
	{
		boolean found = false;
		for(int x : listOfNumbers)
		{
			if(x == param1)
			{
				found = true;
				break;
			}
		}
		return found;
	}

}

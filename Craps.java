import java.util.Random;
import java.util.Scanner;
public class Craps 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String userResponse = "";
		int dieValue1 = 0;
		int dieValue2 = 0;
		System.out.println("\t\tCraps Die Roll");
		System.out.println("\nPress Enter to roll a pair of dice...\n");
		Scanner scan = new Scanner(System.in);
		do
		{
		dieValue1 = generateRandomNumber();
		dieValue2 = generateRandomNumber();
		System.out.printf("Rolling die.... %s\n", numberToText(dieValue1));
		System.out.printf("Rolling die.... %s", numberToText(dieValue2));
		if(dieValue1 == 6 && dieValue2 == 6)
		{
			System.out.println("\nYou rolled a Boxcar!");
		}
		if(dieValue1 == 1 && dieValue2 == 1)
		{
			System.out.println("\nYou rolled Snake Eyes!");
		}
		System.out.print("\n\nType x to exit or press Enter to roll again...");
		userResponse = scan.nextLine();
		}while(!userResponse.equalsIgnoreCase("x"));
		

	}
	
	// Declare the numberToText method
	public static String numberToText(int param)
	{
		String numberText = "";
		switch(param)
		{
			case 1:
				numberText = "ONE";
				break;
			case 2:
				numberText = "TWO";
				break;
			case 3:
				numberText = "THREE";
				break;
			case 4:
				numberText = "FOUR";
				break;
			case 5:
				numberText = "FIVE";
				break;
			case 6:
				numberText = "SIX";
				break;
			default:
				break;
		}
		
		return numberText;
	}
	
	// Declare the generateRandomNumber method in the Class block
	public static int generateRandomNumber()
	{
		int randomNumber = 0;
		Random randomGenerator = new Random();
		randomNumber = randomGenerator.nextInt(6);
		randomNumber = randomNumber + 1;
		return randomNumber;
	}


}

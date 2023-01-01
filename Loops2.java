import java.util.Scanner;
public class Loops 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int asteriskCount = 0;
		
		System.out.println("I can build you a line of asterisks.");
		System.out.print("\nHow many asterisks do you want? ");
		asteriskCount = Integer.parseInt(scanner.nextLine());
		
		System.out.println("\nPrinting a line of asterisks using a while loop");
		int counter = 0;
		while(counter < asteriskCount)
		{
			System.out.print("*");
			counter++;
		}
		
		
		System.out.println("\n\nPrinting a line of asterisks using a for loop");
		for(int i = 0; i < asteriskCount; i++)
		{
			System.out.print("*");
		}
		
		
		System.out.println("\n\nList of numbers from 1 to 5");
		for(int i = 1; i <= asteriskCount; i++)
		{
			System.out.printf("%d ",i);
		}
		
		
		System.out.println("\n\nList of multiples of 5 from 5 to 50");
		for(int i = 5; i <= 50; i+=5)
		{
			System.out.printf("%d ",i);
		}
		
		System.out.println("\n\nMultiplication Table for 2");
		for(int i = 1; i <= 10; i++)
		{
			System.out.printf("2 * %2d = %2d\n", i, i*2);
		}
		
		scanner.close();
		
	}

}

import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Part 1 - Odd Numbers"); // Part1
		int loopLimit = 20;
		int count = 0;
		int factorialNumber = 0;
		for (int i = 1; i <= loopLimit; i+=2)
		{
			System.out.print(i + " ");
		}
		
		System.out.println("\n\n\nPart 2 - Even Numbers"); // Part2
		int num = 1;
		while (num <= loopLimit)
		{
			if (num % 2 == 0)
			{
				System.out.print(num + " ");
			}
			num += 1;
		}
		
		System.out.println("\n\n\nPart 3 - factorial"); // Part3
		System.out.print("Enter a number for the factorial: ");
		factorialNumber = Integer.parseInt(scanner.nextLine());
		int result = 1;
		for (int i = factorialNumber; i >= 1; i--)
		{
			result = result * i;
		}
		System.out.println("The factorial is " + result);

		System.out.println("\n\n\nPart 4 - Triangle"); // Part4
		int tierNumber = 10;
		for (int i = tierNumber; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		String userResponse1 = "";
		String userResponse2 = "";
		System.out.print("\nPress Enter for next page...");
		userResponse1 = scanner.nextLine();
		int student1Score1 = 0;
		int student1Score2 = 0;
		int student2Score1 = 0;
		int student2Score2 = 0;
		int student3Score1 = 0;
		int student3Score2 = 0;
		double average = 0.0;
		if (userResponse1.equalsIgnoreCase(""))
		{
			System.out.println("\nPart 5 - Average calculator");
			System.out.println("\nThis program will ask you to enter 2 scores each for 3 students.\n");
			System.out.print("Student 1, score 1: ");
			student1Score1 = Integer.parseInt(scanner.nextLine());
			System.out.print("Student 1, score 2: ");
			student1Score2 = Integer.parseInt(scanner.nextLine());
			System.out.print("Student 2, score 1: ");
			student2Score1 = Integer.parseInt(scanner.nextLine());
			System.out.print("Student 2, score 2: ");
			student2Score2 = Integer.parseInt(scanner.nextLine());
			System.out.print("Student 3, score 1: ");
			student3Score1 = Integer.parseInt(scanner.nextLine());
			System.out.print("Student 3, score 2: ");
			student3Score2 = Integer.parseInt(scanner.nextLine());
			average = (float)(student1Score1 + student1Score2 + student2Score1 + student2Score2 + student3Score1 + student3Score2) / 6;
			System.out.printf("\nThe average of all scores is %.2f",average);
		}
		else
		{
			System.out.println("User didn't press the <Enter> key!");
		}
		System.out.println("\n\nPress Enter for next page...");
		userResponse2 = scanner.nextLine();
		if (userResponse2.equalsIgnoreCase(""))
		{
			System.out.println("Part 6 - Multiplication Table\n");
			{
				for (int i = 5; i <=10; i++)
				{
					for (int j = 10; j <= 50; j+=10)
						System.out.printf("%2d * %2d =  %3d\n",i ,j ,i*j);
					System.out.println();
				}
			}
			System.out.println("Press Enter to exit....");
		}
		else
		{
			System.out.println("User didn't press the <Enter> key!");
		}
		scanner.close();
	}

}

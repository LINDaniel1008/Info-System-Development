import java.util.Scanner;
public class IfClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// under 18, can't drive
		// at 18, can drive a car
		// at 25, can rent a car
		Scanner scan = new Scanner(System.in);
		int userAge = 16;
		/*
		if(userAge < 18)  // a boolean expression; must evaluate to true or false
		{
			System.out.println("Sorry, can't drive yet.");
			System.out.println("You'll be able to drive soon!");
		}
		
		

		if (userAge >= 18)
		{
			System.out.println("You can drive!");

			if (userAge >= 25)
			{
				System.out.println("You can rent a car!");
			}
		}
		else
		{
			System.out.println("You'll be able to drive soon");
		}
		*/
		
		if  (userAge < 18)
		{
			System.out.println("Be able to drive soon");
		}
		else 
		{
			if (userAge >= 18 && userAge < 25)
			{
				System.out.println("Can drive.");
			}
			else
			{
				System.out.println("Allowed to rent.");
			}
		}
		
		char hasLicense = 'N';
		boolean canRent = false; // 0 is consider false, 1 is consider true
		if(userAge < 18 || hasLicense == 'N')// a boolean expression; must evaluate to true or false
			canRent = false;
		else
			if (userAge >= 18 && userAge < 25)
				canRent = false;
			else
				canRent = true;
		
		// (canRent == true) and (canRent) are equivalent
		// (!canRent) and (canRent != true) are equivalent
		if (canRent == true)
		{
			System.out.println("Allowed to rent!");
		}
		else 
			System.out.println("NOT allowed to rent.");
		
		System.out.println("After the statement");
		
		// test equality of two string variables
		String name1 = "John";
		String name2 = "";
		
		System.out.print("Enter your name: ");
		name2 = scan.nextLine();
		
		if (name1.equals(name2)) // equalsIgnoreCase: ignoring case consideration
		{
			System.out.println("Match");
		}
		else
		{
			System.out.println("Not match");
		}
	}

}

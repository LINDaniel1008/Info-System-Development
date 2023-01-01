import java.util.Scanner;
public class BasicIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a Scanner object for reading input from keyboard
		Scanner inputDevice = new Scanner(System.in);
		
		String userName = "";
		int userAge = 0;
		double userGPA = 0.0;
				
		//println() terminates a line w/ a "new line" character
		System.out.print("What is your name? ");
		
		// Read one line of text and assign it to the userName variable
		userName = inputDevice.nextLine();
		
		System.out.println("Hello " + userName + ". Nice to meet you!");
		
		System.out.print("How old are you? ");
		userAge = Integer.parseInt(inputDevice.nextLine()); // takes a string and convert to an integer value
		
		System.out.println("You are " + userAge + " years-old. ");
		
		System.out.print("What is your GPA? ");
		userGPA = Double.parseDouble(inputDevice.nextLine());
		
		//System.out.println("You are" + userAge + "and your GPA is " + userGPA);
		
		System.out.printf("%s, you are %d years-old and your GPA is %.2f",userName, userAge, userGPA); //%d represent the integer, %f represent the double, %s represent the string and boolean
		
		inputDevice.close(); // \n: new line, \t: tap character
	}

}

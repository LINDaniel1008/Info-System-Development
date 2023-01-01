import java.util.Scanner;
public class MilesCalculator 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		String Destination = "";
		int Status = 0;
		double Distance = 0.0;
		System.out.println("This program will calculate how many miles you earn on your Phoenix Air flight");
		System.out.println("\nDESTINATIONS\nLos Angeles (LAX)\nSan DIego (SAN)\nLas Vegas (LAS)");
		System.out.print("\nEnter destination airport code: ");
		Destination = scan.nextLine();
	
		switch(Destination)
		{
		case "LAX":
			Distance = 369;
			break;
		case "SAN":
			Distance = 304;
			break;
		case "LAS":
			Distance = 255;
			break;
		default:
			Distance = 0;
			System.out.printf("\nPhoenix Air does not fly to %s. There will be zero miles earned.",Destination);
			System.out.println("\nPress enter to quit....");
			break;
		}
		if(Destination.equals("LAX") || Destination.equals("SAN") || Destination.equals("LAS"))
		{
		System.out.println("\nSTATUS\n1. Bronze\n2. Silver\n3. Gold\n4. Platinum");
		System.out.print("\nEnter frequent flyer status option (1-4): ");
		Status = Integer.parseInt(scan.nextLine());
		
		switch(Status)
		{
		case 1:
			Distance = Distance * 1.0;
			System.out.printf("\nYou will earn %.2f miles flying from Phoenix to %s.",Distance, Destination);
			break;
		case 2:
			Distance = Distance * 1.25;
			System.out.printf("\nYou will earn %.2f miles flying from Phoenix to %s.",Distance, Destination);
			break;
		case 3:
			Distance = Distance * 1.5;
			System.out.printf("\nYou will earn %.2f miles flying from Phoenix to %s.",Distance, Destination);
			break;
		case 4:
			Distance = Distance * 2.0;
			System.out.printf("\nYou will earn %.2f miles flying from Phoenix to %s.",Distance, Destination);
			break;
		default:
			Distance = Distance * 1.0;
			System.out.printf("\nYou will earn %.2f miles flying from Phoenix to %s.",Distance, Destination);
			break;
		}
		}
		
		scan.close();
	}

}

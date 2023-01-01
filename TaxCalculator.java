import java.util.Scanner;
public class TaxCalculator
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		double grossIncome = 0.0;
		double deduction = 0.0;
		double netIncome = 0.0;
		double federalTax = 0.0;
		double stateTax = 0.0;
		double incomeTax = 0.0;
		double finalTax = 0.0;
		String filingStatus = "";
		
		System.out.println("\tIncome Tax Calculator");
		System.out.println("\n\nThis program will calculate your income tax.");
		System.out.print("\nWhat is your gross income? ");
		grossIncome = Double.parseDouble(scan.nextLine());
		
		System.out.println("\nFILING STATUS.\nSingle - SG\nMarried Joint - MJ\nMarried Sepertately - MS\nHeadof Household - HH");
		
		
		System.out.print("\nEnter the two letter code corresponding with your status: ");
		filingStatus = scan.nextLine();
		switch (filingStatus)
		{
			case "SG":
				deduction = 5950.0;
				netIncome = grossIncome - deduction;
				break;
			case "MJ":
				deduction = 11900.0;
				netIncome = grossIncome - deduction;
				break;
			case "MS":
				deduction = 5950.0;
				netIncome = grossIncome - deduction;
				break;
			case "HH":
				deduction = 8700.0;
				netIncome = grossIncome - deduction;
				break;
			default:
				deduction = 0.0;
				netIncome = grossIncome - deduction;
				break;
		}
		stateTax = netIncome * 0.025;
		if (netIncome < 30000)
		{
			incomeTax = 0.0;
			federalTax = netIncome * incomeTax;
		}
		else if (netIncome >= 30000 && netIncome < 60000)
		{
			incomeTax = 0.1;
			federalTax = netIncome * incomeTax;
		}
		else if (netIncome >= 60000 && netIncome < 100000)
		{
			incomeTax = 0.2;
			federalTax = netIncome * incomeTax;
		}
		else if (netIncome >= 100000 && netIncome < 250000)
		{
			incomeTax = 0.3;
			federalTax = netIncome * incomeTax;
		}
		else if (netIncome >= 250000)
		{
			incomeTax = 0.4;
			federalTax = netIncome * incomeTax;
		}
		finalTax = stateTax + federalTax;
		System.out.printf("\nYour stated income was $%.2f.",grossIncome);
		System.out.printf("\nYour final tax liability is $%.2f.",finalTax);
		scan.close();
	}

}

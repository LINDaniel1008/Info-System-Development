import java.util.Scanner;
public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		String[] prodNames;
		String[] prodCategories;
		double[] prodPrices;
		double techSum = 0.0;
		double grocerySum = 0.0;
		double officeSum = 0.0;
		double otherSum = 0.0;
		int countTech = 0;
		int countGrocery = 0;
		int countOffice = 0;
		int countOther = 0;
		double avgTech = 0.0;
		double avgGrocery = 0.0;
		double avgOffice = 0.0;
		double avgOther = 0.0;
		
		
		
		prodNames = new String[5];
		prodCategories = new String[5];
		prodPrices = new double[5];
		System.out.println("This program maintains a list of products (name, category, price). It will calculate average dollars spent per category for you.");
		
		
		for(int i = 0; i < prodNames.length; i++)
		{
			System.out.print("\nEnter product name: ");
			prodNames[i] = scan.nextLine();
			System.out.print("Enter product category: ");
			prodCategories[i] = scan.nextLine();
			System.out.print("Enter product price: ");
			prodPrices[i] = Double.parseDouble(scan.nextLine());
			
		}
		
		// loop for tech products
		System.out.println("\nTECH PRODUCTS");
		for(int i = 0; i < prodNames.length; i++)
		{
			if(prodCategories[i].equalsIgnoreCase("Tech"))
			{
				techSum = prodPrices[i] + techSum;
				countTech = countTech + 1;
				System.out.println(prodNames[i]);
			}
		}
		// if there is no tech items
		if(countTech == 0)
		{
			avgTech = 0.0;
		}
		else
		{
			avgTech = techSum / countTech;
		}
		System.out.printf("Average dollars spent: %.2f", avgTech);
		
		// loop for grocery products
		System.out.println("\n\nGROCERY PRODUCTS");
		for(int i = 0; i < prodNames.length; i++)
		{
			if(prodCategories[i].equalsIgnoreCase("Grocery"))
			{
				grocerySum = prodPrices[i] + grocerySum;
				countGrocery = countGrocery + 1;
				System.out.println(prodNames[i]);
			}	
		}
		// if there is no grocery items
		if(countGrocery == 0)
		{
			avgGrocery = 0.0;
		}
		else
		{
			avgGrocery = grocerySum / countGrocery;
		}
		System.out.printf("Average dollars spent: %.2f", avgGrocery);
		
		// loop for office product
		System.out.println("\n\nOFFICE PRODUCTS");
		for(int i = 0; i < prodNames.length; i++)
		{
			if(prodCategories[i].equalsIgnoreCase("Office"))
			{
				officeSum = prodPrices[i] + officeSum;
				countOffice = countOffice + 1;
				System.out.println(prodNames[i]);
			}
		}
		// if there is no office items
		if(countOffice == 0)
		{
			avgOffice = 0.0;
		}
		else
		{
			avgOffice = officeSum / countOffice;
		}
		System.out.printf("Average dollars spent: %.2f", avgOffice);
		
		
		// loop for other category
		System.out.println("\n\nOTHER");
		for(int i = 0; i < prodNames.length; i++)
		{
			if(prodCategories[i].equalsIgnoreCase("Tech")|| prodCategories[i].equalsIgnoreCase("Grocery")|| prodCategories[i].equalsIgnoreCase("Office"))
			{
				System.out.print("");
			}
			else
			{
				otherSum = prodPrices[i] + otherSum;
				countOther = countOther + 1;
				System.out.println(prodNames[i]);
			}
		}
		// if there is no other items
		if(countOther == 0)
		{
			avgOther = 0.0;
		}
		else
		{
			avgOther = otherSum / countOther;
		}
		System.out.printf("Average dollars spent: %.2f", avgOther);
		
		System.out.println("\n\nPress Enter to Exit...");
		
		scan.close();
	}

}

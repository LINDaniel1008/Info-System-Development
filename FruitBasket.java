import java.util.Scanner;
public class FruitBasket 
{
	
	// State / Attributes / Variables / Fields
	private Apple apple;
	private Banana banana;
	private String basketName;
	
	
	// Behaviors / Operations / Methods
	public String getBasketName()
	{
		return basketName;
	}
	public void setBasketName(String basketName)
	{
		this.basketName = basketName;
	}
	public void makeFruits()
	{
		apple = new Apple(1.5);
		banana = new Banana(3.5);
		apple.setPeelThickness(1);
		banana.setPeelThickness(4);
	}
	public void eatFruits()
	{
		// Print the name of the Basket at the top, use the toUpperCase() convert the name to all upper case
		System.out.printf("\t\t***%s***",getBasketName().toUpperCase());
		
		// Inform users that they have an apple and a banana in their fruit basket
		System.out.printf("\nYou have an apple and a banana in your %s basket.", getBasketName());
		Scanner scan = new Scanner(System.in);
		double amountToEat = 0.0;
		System.out.print("\nWhat percent of the apple would you like to eat? ");
		amountToEat = Double.parseDouble(scan.nextLine());
		apple.eat(amountToEat);
		double appleLeft =0.0;
		appleLeft = apple.getPercentLeft();
		System.out.print("What percent of the banana would you like to eat? ");
		amountToEat = Double.parseDouble(scan.nextLine());
		banana.eat(amountToEat);
		double bananaLeft = 0.0;
		bananaLeft = banana.getPercentLeft();
		System.out.printf("\nYou have %.2f of your apple and %.2f of your banana left in your %s basket\n", appleLeft, bananaLeft, getBasketName());

	}
	
	//public void setRadius(double value)
	//{
		
	//}
	//public void eat(double eatenAmount)
	//{
		
	//}

}

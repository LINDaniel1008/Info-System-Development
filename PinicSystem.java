public class PicnicSystem 
{

	
	// Behaviors / Operations / Methods
	public static void main(String[] args) 
	{
		// Declare and instantiate an instance of the PicnicSystem class. Call it my PicnicSystem
		PicnicSystem myPicnicSystem = new PicnicSystem();
		// Call the make fruitBaskets() method i reference to myPicnicSystem
		myPicnicSystem.makeFruitBaskets();
		
	}
	
	public void makeFruitBaskets()
	{
		
		// Declare two local variables, both of type FruitBasket
		FruitBasket basket1;
		FruitBasket basket2;
		
		// Instantiate them by calling the default constructor
		basket1 = new FruitBasket();
		basket2 = new FruitBasket();
		
		// Using setters available within the objects, set the name of the baskets to "Weekend" and "Weekday"
		basket1.setBasketName("Weekend");
		basket2.setBasketName("Weekday");
		
		// Call the makeFruits() method for both FruitBasket object
		basket1.makeFruits();
		basket2.makeFruits();
		
		// Call the eatFruits() method for both FruitBasket object
		basket1.eatFruits();
		basket2.eatFruits();
		
	}

}

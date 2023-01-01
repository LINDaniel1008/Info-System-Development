public class SuperClass 
{
	// Create our own constructor replacing the default constructor
	public SuperClass()
	{
		System.out.println("This is the SuperClass constructor...");
	}
	public void display(String msg)
	{
		System.out.println("Inside the display() method of the SuperClass..." + msg);
	}
}

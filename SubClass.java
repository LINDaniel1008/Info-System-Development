public class SubClass extends SuperClass // SubClass inherit from the SupperClass
{
	
	public SubClass()
	{
		System.out.println("This is the SubClass constructor...");
	}
	
	
	@Override // @Override is optional
	public void display(String msgParam)
	{
		System.out.println("Inside the display() method of the SubClass..." + msgParam);
		
		// use the superclass' display method
		super.display("Using the 'super' keyword to access SuperClass' overriden method.");
	}
}

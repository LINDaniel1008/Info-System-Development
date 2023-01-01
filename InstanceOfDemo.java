public class InstanceOfDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		SubClass sampleObj = new SubClass();
		
		// a simple case
		if (sampleObj instanceof SubClass)
			System.out.println("Sample Object is an instance of SubClass.");
		else
			System.out.println("Sample Object is NOT an instance of SubClass");
		
		// instanceof returns true for SuperClass as well, because subclass inherit from the superclass
		if (sampleObj instanceof SuperClass)
			System.out.println("Sample Object is an instance of SuperClass.");
		else
			System.out.println("Sample Object is NOT an instance of SuperClass");
		
		// instanceof returns true for all ancestors
		if (sampleObj instanceof Object)
			System.out.println("Sample Object is an instance of Object Class.");
		else
			System.out.println("Sample Object is NOT an instance of Object Class");
		
		SuperClass sampleObj2 = new SuperClass();
		
		// a parent object is not an instance of a child object
		if (sampleObj2 instanceof SubClass)
			System.out.println("Sample Object2 is an instance of SubClass.");
		else
			System.out.println("Sample Object2 is NOT an instance of SubClass");
	}

}

public class Student
{
	// State / Attributes / Variables / Fields
	private static int studentCount;
	private String name;
	private String id;

	
	// Behaviors / Operations / Methods
	public Student(String name)
	{
		// Assign the name received as a parameter to the instance variable
		setName(name);
		
		// Increment the student count by 1
		studentCount = studentCount + 1;
		
		// Output to the Console the fact that a new student has been created
		System.out.printf("A new student, %s, has been created.\n", name);
		
		// Output the total number of students to the Console
		System.out.printf("There are now %d students in the system.\n", getStudentCount());
		
	}
	
	public Student(String name, String id)
	{
		// Assign the name and ID parameters to the instance variables
		setName(name);
		setId(id);
		
		// Increment the student count by 1
		studentCount = studentCount + 1;
		
		// Output to the Console the fact that a new student has been created
		System.out.printf("A new student, %s, with ID #%s has been created.\n", name,id);
		
		// Output the total number of students to the Console
		System.out.printf("There are now %d students in the system.\n", getStudentCount());
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	public static int getStudentCount()
	{
		return studentCount;
	}
	

}

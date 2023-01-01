public class Course
{
	// State / Attributes / Variables / Fields
	private String coursePrefix;
	private int courseNumber;
	private static String collegeName;
	private double classAverage = 0.0;
	
	// Behaviors / Operations / Methods
	public void displayMessage()
	{
		System.out.printf("Welcome to the grade book for %s %d!", coursePrefix, courseNumber);
	}
	
	public String getCoursePrefix()
	{
		coursePrefix = coursePrefix.toUpperCase();
		return coursePrefix;
	}
	
	public void setCoursePrefix(String coursePrefix)
	{
		this.coursePrefix = coursePrefix;
	}
	
	public int getCourseNumber()
	{
		return courseNumber;
	}
	
	public void setCourseNumber(int courseNumber)
	{
		this.courseNumber = courseNumber;
	}
	
	public static String getCollegeName()
	{
		return collegeName;
	}
	
	public static void setCollegeName(String collegeName)
	{
		Course.collegeName = collegeName;
	}
	
	public double getClassAverage()
	{
		return classAverage;
	}
}

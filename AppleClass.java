public class Apple 
{

	
	// State / Attributes / Variables / Fields
	private int peelThickness;
	private double percentLeft;
	private double radius;
	
	
	// Behaviors / Operations / Methods
	public Apple()
	{
		percentLeft = 100.0;
	}
	public Apple(double radius)
	{
		percentLeft = 100.0;
		this.radius = radius;
	}
	public int getPeelThickness()
	{
		return peelThickness;
	}
	public void setPeelThickness(int value)
	{
		peelThickness = value;
	}
	public double getPercentLeft()
	{
		return percentLeft;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double value)
	{
		radius = value;
	}
	public void eat(double eatenAmount)
	{
		percentLeft = percentLeft - eatenAmount;
	}
	
	

}

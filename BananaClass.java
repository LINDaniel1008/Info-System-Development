public class Banana 
{

	
	// State / Attributes / Variables / Fields
	private double length;
	private int peelThickness;
	private double percentLeft;
	
	// Behaviors / Operations / Methods
	public Banana()
	{
		percentLeft = 100.0;
	}
	public Banana(double length)
	{
		percentLeft = 100.0;
		this.length = length;
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double value)
	{
		length = value;
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
	public void eat(double eatenAmount)
	{
		percentLeft = percentLeft - eatenAmount;
	}

}

public class Device 
{
	private String skuNumber;
	private String deviceName;
	private String deviceStatus;
	
	
	public Device()
	{
		skuNumber = "";
		deviceName = "";
	}
	
	public void setDeviceName(String deviceNameParam)
	{
		deviceName = deviceNameParam;
	}
	
	public String getDeviceName()
	{
		return deviceName;
	}
	
	public void setSkuNumber(String skuNumberParam)
	{
		skuNumber = skuNumberParam;
	}
	
	public String getSkunumber()
	{
		return skuNumber;
	}
	
	public void setDeviceStatus(String deviceStatusParam)
	{
		deviceStatus = deviceStatusParam;
	}
	public String getDeviceStatus()
	{
		return deviceStatus;
	}
}

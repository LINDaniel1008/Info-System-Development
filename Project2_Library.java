import java.util.Scanner;
import java.util.ArrayList;
public class Library
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		Library checkoutSystem = new Library();
		
		
		// Create an ArrayList of devices
		ArrayList<Device> deviceList;
		deviceList = new ArrayList<>(10); // The ArrayList have a minimum size of 10
		
		// Add initial values into the ArrayList
		Device temptDevice1 = new Device();
		temptDevice1.setSkuNumber("6757A");
		temptDevice1.setDeviceName("Apple 9.7-inch iPad Pro");
		temptDevice1.setDeviceStatus("Available");
		deviceList.add(temptDevice1);
				
		Device temptDevice2 = new Device();
		temptDevice2.setSkuNumber("93P51B");
		temptDevice2.setDeviceName("Amazon Kindle Fire kids Eiditon");
		temptDevice2.setDeviceStatus("Available");
		deviceList.add(temptDevice2);
				
		Device temptDevice3 = new Device();
		temptDevice3.setSkuNumber("10N8C");
		temptDevice3.setDeviceName("LeapFrog Epic Learning Tablet");
		temptDevice3.setDeviceStatus("Available");
		deviceList.add(temptDevice3);
				
		Device temptDevice4 = new Device();
		temptDevice4.setSkuNumber("85U2O");
		temptDevice4.setDeviceName("Amazon Kindle Fire HD 8");
		temptDevice4.setDeviceStatus("Checked Out");
		deviceList.add(temptDevice4);
				
		Device temptDevice5 = new Device();
		temptDevice5.setSkuNumber("91H2D");
		temptDevice5.setDeviceName("HP Envy 8 Note");
		temptDevice5.setDeviceStatus("Available");
		deviceList.add(temptDevice5);
		
		int command = 0;
		do
		{
			// Display menu
			checkoutSystem.displayMenu();
			
			// Ask user to enter option
			System.out.print("Select menu options 1-7: ");
			command = Integer.parseInt(scan.nextLine());
			switch(command)
			{
				case 1:
					String userResponse = "";
					checkoutSystem.displayDeviceList(deviceList);
					// Ask user to press enter to continue
					do
					{
						System.out.print("\nPress Enter to continue...");
						userResponse = scan.nextLine();
					}while(!userResponse.equalsIgnoreCase(""));
					break;
				case 2:
					checkoutSystem.addDevice(deviceList);
					// Ask user to press enter to continue
					do
					{
						System.out.print("Press Enter to continue...");
						userResponse = scan.nextLine();
					}while(!userResponse.equalsIgnoreCase(""));
					break;
				case 3:
					checkoutSystem.displayDeviceList(deviceList);
					checkoutSystem.editDeviceList(deviceList);
					// Ask user to press enter to continue
					do
					{
						System.out.print("Press Enter to continue...");
						userResponse = scan.nextLine();
					}while(!userResponse.equalsIgnoreCase(""));
					break;
				case 4:
					checkoutSystem.searchDevice(deviceList);
					// Ask user to press enter to continue
					do
					{
						System.out.print("\nPress Enter to continue...");
						userResponse = scan.nextLine();
					}while(!userResponse.equalsIgnoreCase(""));
					break;
				case 5:
					checkoutSystem.checkOutDevice(deviceList);
					// Ask user to press enter to continue
					do
					{
						System.out.print("Press Enter to continue...");
						userResponse = scan.nextLine();
					}while(!userResponse.equalsIgnoreCase(""));
					break;
				case 6:
					checkoutSystem.checkInDevice(deviceList);
					// Ask user to press enter to continue
					do
					{
						System.out.print("Press Enter to continue...");
						userResponse = scan.nextLine();
					}while(!userResponse.equalsIgnoreCase(""));
					break;
				default:
					break;
			}
		}while(command != 7);
		System.out.print("Good bye!");
		
	}
	
	public void displayMenu()
	{
		System.out.println("\t\tLibrary Device Checkout System\n");
		System.out.println("1. List Devices by Title");
		System.out.println("2. Add New Devices");
		System.out.println("3. Edit Device Information");
		System.out.println("4. Search by Device Name");
		System.out.println("5. Check Out Devices");
		System.out.println("6. Check In Devices");
		System.out.println("7. Exit\n\n\n");
		
		
	}
	
	public void addDevice(ArrayList<Device> deviceListParam)
	{
		System.out.println("\n\n\n\n\t\tLibrary Device Checkout System - Add New Device\n");
		Device temptDevice = new Device();
		String sku = "";
		String name = "";
		String userResponse = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("Sku: ");
		sku = scan.nextLine();
		sku = sku.toUpperCase();
		temptDevice.setSkuNumber(sku);
		System.out.print("Name: ");
		name = scan.nextLine();
		temptDevice.setDeviceName(name);
		temptDevice.setDeviceStatus("Available");
		deviceListParam.add(temptDevice);
		System.out.printf("\nAdded %s to Catalog.\n", name);
		
		// Ask user to press enter to continue
		//do
		//{
			//System.out.print("Press Enter to continue...");
			//userResponse = scan.nextLine();
		//}while(!userResponse.equalsIgnoreCase(""));
		
	}
	
	public void displayDeviceList(ArrayList<Device> deviceListParam)
	{
		String a = "SKU";
		String userResponse = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("\t\tLibrary Device Checkout System - List\n");
		System.out.printf("# %-10s Name\n", a);
		int index = 0;
		Device x = new Device();
		for (int i = 0; i < deviceListParam.size(); i++)
		{
			index = index + 1;
			x = deviceListParam.get(i);
			System.out.printf("%d %-10s %-35s %s\n", index, x.getSkunumber(), x.getDeviceName(), x.getDeviceStatus());
		}
		
		// Ask user to press enter to continue
		//do
		//{
			//System.out.print("\nPress Enter to continue");
			//userResponse = scan.nextLine();
		//}while(!userResponse.equalsIgnoreCase(""));
	}
	
	public void editDeviceList(ArrayList<Device> deviceListParam)
	{
		Device temptDevice = new Device();
		int deviceNum = 0;
		String sku = "";
		String name = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter Device number to edit (1-6): ");
		deviceNum = Integer.parseInt(scan.nextLine());
		System.out.print("Sku: ");
		sku = scan.nextLine();
		temptDevice.setSkuNumber(sku);
		System.out.print("Name: ");
		name = scan.nextLine();
		temptDevice.setDeviceName(name);
		temptDevice.setDeviceStatus("Available");
		deviceListParam.set(deviceNum-1, temptDevice);
		System.out.println("\nDevice information updated.\n");
	}
	
	public void searchDevice(ArrayList<Device> deviceListParam)
	{
		int index = 0;
		String deviceName1 = "";
		String y = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("\t\tLibrary Device Checkout System - Search");
		System.out.print("\n\nEnter Device to search for: ");
		deviceName1 = scan.nextLine();
		System.out.printf("\nListings for '%s'\n", deviceName1);
		Device x = new Device();
		
		
		for (int i = 0; i < deviceListParam.size(); i++)
		{
			index = index + 1;
			x = deviceListParam.get(i);
			y = (x.getDeviceName()).toLowerCase();
			if(y.contains(deviceName1.toLowerCase()))
			{
			System.out.printf("%d %-10s %s\n", index, x.getSkunumber(), x.getDeviceName());
			}
		}
		
	}
	
	public void checkOutDevice(ArrayList<Device> deviceListParam)
	{
		String a = "SKU";
		int index = 0;
		Scanner scan = new Scanner(System.in);
		int deviceNum = 0;
		System.out.println("\t\tLibrary Device Checkout System - Check Out Device\n\n");
		System.out.println("Available Devices\n");
		System.out.printf("# %-10s Name\n", a);
		Device x = new Device();
		Device y = new Device();
		for (int i = 0; i < deviceListParam.size(); i++)
		{
			index = index + 1;
			x = deviceListParam.get(i);
			if(x.getDeviceStatus().equals("Available"))
			{
			System.out.printf("%d %-10s %s\n", index, x.getSkunumber(), x.getDeviceName());
			}
		}
		System.out.print("\nEnter device number: ");
		deviceNum = Integer.parseInt(scan.nextLine());
		y = deviceListParam.get(deviceNum - 1);
		y.setDeviceStatus("Checked Out");
		deviceListParam.set(deviceNum-1, y);
		System.out.println("Device Checked Out.\n");
		
	}
	
	public void checkInDevice(ArrayList<Device> deviceListParam)
	{
		String a = "SKU";
		int index = 0;
		Scanner scan = new Scanner(System.in);
		int deviceNum = 0;
		System.out.println("\t\tLibrary Device Checkout System - Check In Device\n\n");
		System.out.println("Checked Out Devices\n");
		System.out.printf("# %-10s Name\n", a);
		Device x = new Device();
		Device y = new Device();
		for (int i = 0; i < deviceListParam.size(); i++)
		{
			index = index + 1;
			x = deviceListParam.get(i);
			if(x.getDeviceStatus().equals("Checked Out"))
			{
			System.out.printf("%d %-10s %s\n", index, x.getSkunumber(), x.getDeviceName());
			}
		}
		System.out.print("\nEnter device number: ");
		deviceNum = Integer.parseInt(scan.nextLine());
		y = deviceListParam.get(deviceNum - 1);
		y.setDeviceStatus("Available");
		deviceListParam.set(deviceNum-1, y);
		System.out.println("Device Checked In.\n");
	}
	

}

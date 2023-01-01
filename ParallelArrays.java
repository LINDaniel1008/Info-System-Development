
public class ParallelArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] courseNames = {"Intro to Info Systems", "Bus Info Sys Dev I", "DB Structures"};
		String[] courseIDs = {"235", "340", "360"};
		int[] creditHours = {2, 3, 4};
		
		for(int lcv = 0; lcv < courseIDs.length; lcv++)
		{
			System.out.printf("CIS %s is named %s and is worth %d credits.\n", courseIDs[lcv], courseNames[lcv], creditHours[lcv]);
			
		}
		
		
	}

}

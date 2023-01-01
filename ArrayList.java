import java.util.ArrayList;
public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare an arrayList of integers
		// syntax: ArrayList<reference datatype> identifier;
		
		ArrayList<Integer> testScores;
		
		testScores = new ArrayList<>(100); // it would also be correct if you type <Integer>
		
		testScores.add(5); // add value to the next location that is available
		testScores.add(10);
		testScores.add(15);
		testScores.add(20);
		
		for(int x : testScores)// use enhanced for loop
		{
			System.out.printf("Current element of testScores is %d", x);
			System.out.println();
		}
		
		// declare and initialize an arrayList of strings
		ArrayList<String> empNames = new ArrayList<String>();
		
		empNames.add("Frank");
		empNames.add("Ed");
		empNames.add("Erica");
		empNames.add("madison");
		
		empNames.remove("Ed"); // you don't have to know where your object is
		empNames.add(2, "Jim"); // add a value at a specific location, you can't do this with normal array
		
		for(String cAM : empNames)
		{
			System.out.printf("Current employee is %s\n", cAM);
		}
	}

}

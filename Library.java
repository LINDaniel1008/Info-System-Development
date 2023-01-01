import java.util.ArrayList;
import java.util.Scanner;
public class Library
{

	
	public static void main(String[] args)
	{
	
	
		Library bookSystem = new Library();
		bookSystem.displayHeader();
		int bookNum = bookSystem.loadLibrarySystem();
		
		
		// Create an ArrayList of books
		ArrayList<Book> bookList;
		bookList = new ArrayList<>(bookNum);
		bookSystem.addBook(bookList, bookNum);
		
		bookSystem.displayBookList(bookList);
		
	
	}
	
	// Create a displayHeader () method that writes the title of the application at the top
	public void displayHeader()
	{
		System.out.println("\t\tNew Library System");
	}
	
	// Create an addBook() method that asks the user for information on one book and adds it to the ArrayList of books
	public void addBook(ArrayList<Book> bookListParam, int bookNumParam)
	{
		Scanner scan = new Scanner(System.in);
		String name = "";
		String userResponse = "";
		int year = 0;
		//Book temptTitle = new Book();
		//Book temptYear = new Book();
		//Book temptBook = new Book();
		//bookList = new ArrayList<>(bookNum);
		for(int i = 0; i < bookNumParam ; i++)
		{
			Book temptBook = new Book();
			System.out.print("Enter Book title: ");
			name = scan.nextLine();
			temptBook.setBookTitle(name);
			System.out.print("Enter Book Year: ");
			year = Integer.parseInt(scan.nextLine());
			temptBook.setBookYear(year);
			bookListParam.add(temptBook);
			System.out.printf("Title '%s' added to the library.\n", name);
		}
		// Ask user to press enter to continue
		do
		{
			System.out.println("\nAdding books complete. Press enter to continue.");
			userResponse = scan.nextLine();
			
		}while(!userResponse.equalsIgnoreCase(""));
		
		
	}
	
	// Create a displayBookList() method that loops through the ArrayList and displays a list of books and their publication year
	public void displayBookList(ArrayList<Book> bookListParam)
	{
		String b = "Title";
		System.out.println("\n\n\n\n\t\tNew Library System\n");
		System.out.printf("%-50s Year\n",b);
		for (Book x : bookListParam)
		{
			System.out.printf("%-50s %d\n", x.getBookTitle(), x.getBookYear());
		}
	}
	
	// Have a loadLibrarySystem() method that asks the users how many books are needed and calls all the other methods as appropriate in the proper sequence
	public int loadLibrarySystem()
	{
		int bookNum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("\n\nHow many new books do you want ot add to the library? ");
		bookNum = Integer.parseInt(scan.nextLine());
		return bookNum;
	}
}

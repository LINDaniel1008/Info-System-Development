public class Book 
{

	
	private String bookTitle;
	private int bookYear;

	
	
	public Book()
	{
		bookTitle = "";
		bookYear = 0;
	}
	
	
	
	public void setBookTitle(String bookTitleParam)
	{
		bookTitle = bookTitleParam;
	}
	
	public String getBookTitle()
	{
		return bookTitle;
	}
	
	public void setBookYear(int bookYearParam)
	{
		// Modifies "bad" values, if the value doesn't fall between the years of 1100 and 2022, automatically default it to 1900
		if(bookYearParam < 1100 || bookYearParam > 2022)
		{
			bookYear = 1900;
		}
		else
		{
			bookYear = bookYearParam;
		}
	}

	public int getBookYear()
	{
		return bookYear;
	}
}

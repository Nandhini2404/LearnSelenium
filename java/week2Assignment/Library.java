package week2Assignment;

public class Library {
	
	public static String addBood(String bookTitle) 
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
public void issueBook() 
    {
	System.out.println("Book issued successfully");
    }
	public static void main(String[] args) 
	{
		
Library lib= new Library();
String book1=lib.addBood("selenium book");
System.out.println(book1+ "" +"Book issues successfully");
lib.issueBook();
	}

}

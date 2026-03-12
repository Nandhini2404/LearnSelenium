package week2Assignment;

public class LibraryManagement {

	public static void main(String[] args) 
	{
		Library lib1=new Library();
		String book=lib1.addBood("java");
		System.out.println(book + ""+"Book added successfully");
		lib1.issueBook();
	}

}


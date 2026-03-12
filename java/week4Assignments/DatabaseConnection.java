package week4Assignments;

public interface DatabaseConnection 
{
	// abstract method is called a design say what we are going to implement in future
	public void connect();
	
	public void  disconnect();
	
	public void executeUpdate();

}

package week4Assignments;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() 
	{
		System.out.println("Take database connection from database");
		
	}

	@Override
	public void disconnect()
	{
		System.out.println("disconnect the database");
		
	}

	@Override
	public void executeUpdate() 
	{
		System.out.println("execute the update");
		
	}
	public static void main(String[] args) 
	{
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();

	}


}

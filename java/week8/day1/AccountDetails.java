package week8.day1;

public class AccountDetails {
	
	private int accountNumber;
	
	
	public void set(int accountNumber) 
	{
		this.accountNumber=accountNumber;
	}
	
	
	public int get() 
	{
		return accountNumber;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		AccountDetails acc = new AccountDetails();
		
		System.out.println(acc.accountNumber);
	}

}

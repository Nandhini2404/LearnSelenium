package week8.day1;

public class FetchDetails {

	public static void main(String[] args) {
		AccountDetails acc1 =  new AccountDetails();
		acc1.set(123);
		int accountNumber = acc1.get();
		
		System.out.println(accountNumber);
		
		

	}

}

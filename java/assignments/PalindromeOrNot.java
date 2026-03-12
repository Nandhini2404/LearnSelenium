package assignments;

public class PalindromeOrNot {
	public static void main(String[] args)
	{
		//int input = 121;
		int input =123;
		int reversed = 0;
	
		for(int i = input; i > 0; i = i / 10) 
		{
			int rem = i % 10;
			reversed = (reversed * 10) + rem;
		}
		
		if (reversed == input) {
			System.out.println("Polindrome");
		} else {
			System.out.println("Not a Polindrome");
		}
	}
}
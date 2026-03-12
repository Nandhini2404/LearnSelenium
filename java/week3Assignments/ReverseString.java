package week3Assignments;

public class ReverseString {

	public static void main(String[] args) 
	{
		String companyName= "TestLeaf";
		
		// to convert string array to char array should use toCharArray[]
		
		char[] charArray = companyName.toCharArray();
		
		for(int i=charArray.length-1; i>=0;i--) 
		{
			System.out.println(charArray[i]);
		}

	}

}

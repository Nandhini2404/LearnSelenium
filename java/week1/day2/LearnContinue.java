package week1.day2;

public class LearnContinue {

	public static void main(String[] args) 
	{
		// Continue statement skip the current iteration alone 
		
		for(int i=1;i<=5;i++) 
		{
			if(i==3||i<=4) 
			{
				continue;
			}
			System.out.println(i);
		}

	}

}

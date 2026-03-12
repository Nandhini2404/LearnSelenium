package assignments;

public class PrimeNumbers {

	public static void main(String[] args)
	{
		//to print 1 to 20 
		
	for(int num=2;num<=20;num++) 
	{
		boolean isPrime = true;
		
		// looping to divide the number
		
		for(int i=2;i<num;i++) 
		{
			if(num%i==0) 
			{
				isPrime=false;
				break;
				
			}
		}
		
		// if it is prime 
		if(isPrime) 
		{
			System.out.println(num +" ");
		}
	}
	

		
		
		
		
		
	}
	}
		

package week3.day1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) 
	{
		// array variables 
		/*int[] num = {2,5,7,7,5,9,2,3};
		System.out.println("Duplicate numbers are :");
		Arrays.sort(num);
		for(int i=0;i< num.length-1;i++) 
		{
			if(num[i]==num[i+1]) 
			{
				System.out.println(num[i]);
			}
		}*/
		
		String a = "Hello World";
		String[] c = a.split(" ");
		int b= c.length;
		System.out.println("Last word is :"+c[b-1] +" & count is: "+c[b-1].length());
		

	}

}

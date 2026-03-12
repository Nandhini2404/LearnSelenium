package week3.day1;

public class LastString {

	public static void main(String[] args) 
	{
		String a = "Hello World";
		String[] c = a.split(" ");
		int b= c.length;
		System.out.println("Last word is :"+c[b-1] +" & count is: "+c[b-1].length());
	}
	
}

package week3.day1;

public class LastString1 {

	public static void main(String[] args)
	{
		String a = "fly me to the moon";
		String[] c = a.split(" ");
		int b= c.length;
		System.out.println("Last word is :"+c[b-1] +" & count is: "+c[b-1].length());

	}

}

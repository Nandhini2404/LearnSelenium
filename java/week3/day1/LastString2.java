package week3.day1;

public class LastString2 {

	public static void main(String[] args)
	{
		String a= "luffy is still joyboy";
		String[] b=a.split(" ");
		int c= b.length;
		System.out.println("Last word is :"+b[c-1] +" & count is: "+b[c-1].length());

	}

}

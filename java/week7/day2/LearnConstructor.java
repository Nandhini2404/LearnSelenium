package week7.day2;

public class LearnConstructor {
	
	int number;
	String name;
	
	// constructor
	// default constructor 
	// Parameterized constructor
	
	public LearnConstructor() 
	{
		System.out.println(" I am a default constructor");
	}
	

	public LearnConstructor(int number, String name) 
	{
		this();
		this.number=number;
		this.name=name;
	}
	
	public static void main(String[] args) 
	{
		LearnConstructor lc = new LearnConstructor(7,"Nandhini");
		
		System.out.println("The number is :" +lc.number);
		System.out.println("The name is :" +lc.name);
	}

}

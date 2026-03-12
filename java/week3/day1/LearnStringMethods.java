package week3.day1;

public class LearnStringMethods {

	public static void main(String[] args)
	{
		// 2 ways we can ahandle string 1. string literal & string instantiation
		
		String str1 = "TestLeaf";
		String str2 = new String("Testleaf");
		
		// there are many mothods to validate string
		
		// == and .equals methods here 
		// == compares the 2 string memory/reference address 
		// .equals compares the 2 string values.
		
		System.out.println(str1==str2); // output is false
		System.out.println(str1.equals(str2)); // output is false even though value is same becasue of case sensitive it return false. to avoid this we can use .equalIgnore method.
		
		System.out.println("___________________");
		
		// .equalIgnore method to avoid the case sensitive.
		
		String str3="Selenium";
		String str4="selenium";
		str3.equalsIgnoreCase(str4);
		System.out.println(str3.equalsIgnoreCase(str4)); // output is true since we have use equalIgnore case
	
		
		// .equal contains() method it should contain partial value but case sensitive.
		
		System.out.println("__________________________");
		
		System.out.println(str3.contains("sele")); // false becase case sensitive
		
		System.out.println(str3.contains("Sele")); // true 
		
		System.out.println("_________________________");
		
		// .equal method to find the length of the string or no of characters 
		
		int length=str3.length();
		
		System.out.println("the length of the string :" +length);
		
		System.out.println("********* to upper case begin *********");
	
		
		// to convert given string to uppercase
		
		String str5="selenium";
		 String upperCase= str5.toUpperCase();
		 
		 System.out.println(upperCase);
		 
		 System.out.println("******* Lower case  ******");
		 
		 // to convert into small case
		 
		 String str6 = "SELENIUM JAN";
		 String lowerCase = str6.toLowerCase();
		 
		 System.out.println(lowerCase);
		 
		 System.out.println("********** to retrive single character from string");
		 
		 // to retrive single character from the string use charAt()
		 
		 String str7 = "Sel jan 2026";
		 char chatAt2= str7.charAt(1);
		  System.out.println(chatAt2);
		  
		  System.out.println("*** to convert string into char array ****");
		  
		  // to convert string into char array
		  // String str8[] ={'S','e','l',e etc};
		  
		  String str8 = "Selenium java";
		   char[] charArray = str8.toCharArray();
		System.out.println(charArray[5]);
		
		System.out.println("****** split method *******");
		
		// split method is used to convert 1 string in to multiple string 
		
		String name = "openAI jAN 2026";
		String[] split = name.split(" ");
		System.out.println(split[1]);
		
		System.out.println("****** sub String *******");
		
		
		// subString method convert string into much shorter format
		String name1 = "NameOfbatch";
		String subString1 = name1.substring(2);
		
		System.out.println(subString1); // meOfbatch output
		
		String subString2 = name1.substring(2, 4);
		
		System.out.println(subString2); // output is  -me
		
		System.out.println("***** ReplaceAll ****");
		
		int amount1 = 1000;
		String amount2 = "200Rupees";
		
		System.out.println(amount1+amount2); // output is 1000200Rupees
		String replace = amount2.replaceAll("[a-zA-Z]", "");
		System.out.println(replace+amount1); // 2001000
		
		// to convert string into int need to use wrapper class in data type.
		
		int converted = Integer.parseInt(replace);
		System.out.println(converted+amount1); // 1200
		
		
		
	
		
		}

}

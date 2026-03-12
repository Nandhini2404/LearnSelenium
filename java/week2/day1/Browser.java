package week2.day1;

public class Browser 
{
	public String launchBrowser(String browserName) 
	{
		System.out.println(browserName);
		return browserName;
	}
	public String loadUrl(String url) 
	{
		System.out.println(url);
		return url;
	}
	

	public static void main(String[] args) 
	{
		Browser browOption = new Browser();
		String browname=browOption.launchBrowser("Chrome");
		String str=browOption.loadUrl("https://www.facebook.com/");
		System.out.println(str);

	}

}

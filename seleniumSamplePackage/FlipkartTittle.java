package seleniumSamplePackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTittle 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String Tit=driver.getTitle();
		System.out.println(Tit);
	}

}

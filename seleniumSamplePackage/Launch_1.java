package seleniumSamplePackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_1 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.close();

	}

}

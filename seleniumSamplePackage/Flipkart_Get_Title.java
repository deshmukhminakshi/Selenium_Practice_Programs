package seleniumSamplePackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Get_Title 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String tittle=driver.getTitle();
		System.out.println(tittle);
	}

}

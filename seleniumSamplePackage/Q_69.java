package seleniumSamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q_69 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search_1=driver.findElement(By.className("gLFyf"));
		search_1.sendKeys("India");
	}

}

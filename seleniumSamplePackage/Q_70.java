package seleniumSamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q_70 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement a1=driver.findElement(By.xpath("(/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea)"));
		a1.sendKeys("India");
	}

}

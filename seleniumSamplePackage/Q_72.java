package seleniumSamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Q_72 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement ddown=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(ddown);
		s1.selectByValue("search-alias=alexa-skills");
		Thread.sleep(5000);
		s1.selectByVisibleText("Appliances");
		Thread.sleep(5000);
		s1.selectByIndex(8);
		Thread.sleep(8000);
		WebElement search_1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search_1.sendKeys("Shoes");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		
	}

}

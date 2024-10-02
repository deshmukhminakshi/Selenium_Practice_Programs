package seleniumSamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_My_Trip 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		//WebElement l1=driver.findElement(By.xpath("//input[@id=\"username\"]"));
		//l1.sendKeys("minakshideshmukh1998@gmail.com");
		//WebElement l2=driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']"));
		//l2.click();

	}

}

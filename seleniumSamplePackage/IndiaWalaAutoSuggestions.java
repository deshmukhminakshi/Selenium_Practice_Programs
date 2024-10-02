package seleniumSamplePackage;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndiaWalaAutoSuggestions 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		WebElement s1=driver.findElement(By.id("APjFqb"));
		s1.sendKeys("India");
		List<WebElement> s2=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=s2.size();                              
		System.out.println(count);

	}

}

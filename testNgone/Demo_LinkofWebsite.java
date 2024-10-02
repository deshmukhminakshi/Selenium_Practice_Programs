package testNgone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo_LinkofWebsite 
{
	@Test
	public void Demo_LinkofWebsite_1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> s1=driver.findElements(By.tagName("a"));
		
	}

}

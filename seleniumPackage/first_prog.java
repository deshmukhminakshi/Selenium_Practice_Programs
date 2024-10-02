package seleniumPackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_prog 
{
   public static void main(String[]args)
   {
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://www.google.com/");
	   WebElement a1=driver.findElement(By.id("APjFqb"));
	   a1.sendKeys("India");
	   List<WebElement> a2=driver.findElements(By.xpath("//div/div[@class='OBMEnb'][1]/ul/li"));
	   a2.size();
	   System.out.println(a2.size());
   }
}

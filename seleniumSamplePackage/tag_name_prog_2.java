package seleniumSamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tag_name_prog_2 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement log_in =driver.findElement(By.xpath("(/html/body//div/input)[1]"));
		log_in.sendKeys("minakshideshmukh@gmail.com");
	}

}

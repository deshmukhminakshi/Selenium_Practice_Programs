package seleniumSamplePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys(" ");
		Thread.sleep(3000);
		List<WebElement> a1=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count_of_a1=a1.size();
		System.out.println(count_of_a1);
		a1.get(7).click();
		
		
	}

}

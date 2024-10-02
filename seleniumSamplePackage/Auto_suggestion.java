package seleniumSamplePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> autosuggestion=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		int countof_auto=autosuggestion.size();//It will give u the no of autosuggestions we have here.
		System.out.println(countof_auto);
		autosuggestion.get(6).click();
	}

}

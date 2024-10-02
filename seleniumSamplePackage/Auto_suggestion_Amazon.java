package seleniumSamplePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion_Amazon 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Tshirts");
				Thread.sleep(5000);
		List<WebElement> a1=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count_of_a1=a1.size();
		System.out.println(count_of_a1);
		a1.get(9).click();
	}

}

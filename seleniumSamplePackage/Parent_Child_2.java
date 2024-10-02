package seleniumSamplePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Child_2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("tshirts");
		Thread.sleep(4000);
		List <WebElement> a1=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div[1]"));
		int count_of_a1=a1.size();
		System.out.println(count_of_a1);
		a1.get(0).click();
		Thread.sleep(3000);
		List <WebElement> a2=driver.findElements(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
	    int count_of_a2=a2.size();
	    System.out.println(count_of_a2);
	    a2.get(0).click();
	    Thread.sleep(3000);
	    WebElement payment=driver.findElement(By.xpath("//span/span/input[@id='buy-now-button']"));
	    payment.click();
	    
	}

}

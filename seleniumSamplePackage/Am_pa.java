package seleniumSamplePackage;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Am_pa 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		WebElement am=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base a-text-center'])[1]"));
		Thread.sleep(200);
		am.click();
		String id1=driver.getWindowHandle();
		Set<String> id2=driver.getWindowHandles();
		Iterator <String> pc=id2.iterator();
		//String id3=pc.next();
		String id4=pc.next();
		driver.switchTo().window(id4);
		WebElement by=driver.findElement(By.id("buy-now-button"));
		Thread.sleep(200);
		by.click();
		driver.quit();
		}

}

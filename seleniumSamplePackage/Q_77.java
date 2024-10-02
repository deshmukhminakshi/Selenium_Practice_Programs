package seleniumSamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q_77 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s1=new Select(dropdown);
		s1.selectByVisibleText("Books");
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("humans");
		search.sendKeys(Keys.ENTER);

	}

}

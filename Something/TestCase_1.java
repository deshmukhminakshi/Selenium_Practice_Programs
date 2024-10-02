package Something;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase_1 
{
	@Test(retryAnalyzer=Something.Retry.class)
	public void scenario1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s1=new Select(dropdown);
		s1.selectByVisibleText("Books");
		WebElement search=driver.findElement(By.xpath("//input[@id='minakshi']"));
		search.sendKeys("humans");
		search.sendKeys(Keys.ENTER);
	}

}

package seleniumSamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_DropDown 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		WebElement w1=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(w1);
		//s1.selectByVisibleText("Furniture");
		s1.selectByIndex(4);
		WebElement s2=driver.findElement(By.id("twotabsearchtextbox"));
		s2.sendKeys("Sofa for living room");
		s2.sendKeys(Keys.ENTER);

	}

}

package seleniumSamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lauch_3 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Anant/Documents/learningHTML1.html");
		WebElement Rel=driver.findElement(By.xpath("//select[@id='Relegion']"));
		Select s1=new Select(Rel);
		s1.selectByVisibleText("Christian");
		WebElement lin=driver.findElement(By.xpath("//a"));
		lin.click();
	}
}

package seleniumSamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click_Prog
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/");
		WebElement a1=driver.findElement(By.linkText("About Us"));
		Actions a=new Actions(driver);
		a.doubleClick(a1).perform();
	}

}

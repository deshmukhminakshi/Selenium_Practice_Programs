package seleniumSamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regis_gro 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/user-account/");
		WebElement Enterusername=driver.findElement(By.name("login"));
		Enterusername.sendKeys("Minakshi");
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("Minakshi@123");
		WebElement login=driver.findElement(By.xpath("//span[.='Login']"));
		login.click();
	}

}

package seleniumSamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_to_facebook 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("deshmukhminakshi1998@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Ananta_Wawge");
		driver.findElement(By.name("login")).click();
	}

}

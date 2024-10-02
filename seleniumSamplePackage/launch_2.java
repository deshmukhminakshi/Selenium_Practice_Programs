package seleniumSamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_2 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Anant/Documents/learningHTML1.html");
		WebElement hint=driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("Password is my pet name");
		WebElement firstname=driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		firstname.sendKeys("Minakshi");
		WebElement Check=driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		Check.click();
		WebElement Check1=driver.findElement(By.xpath("(/html/body/form/input)[5]"));
		Check1.click();
		//WebElement Signup=driver.findElement(By.xpath("(/html/body/form/input)[7]"));
		//Signup.click();
		WebElement img=driver.findElement(By.xpath("(/html/body/img)[1]"));
		img.isDisplayed();
	}

}

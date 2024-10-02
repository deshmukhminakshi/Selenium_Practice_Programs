package seleniumSamplePackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Child_Prog 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.manage().window().maximize();
		WebElement s1=driver.findElement(By.xpath("//span[@class='google-text']"));
		s1.click();
		String id1=driver.getWindowHandle();
		System.out.println("Parentid is:" +id1);
		Set<String> id2=driver.getWindowHandles();
		System.out.println("Parentandchild are:" +id2);
		driver.switchTo().window(id1);
		driver.close();
	}

}

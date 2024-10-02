package seleniumSamplePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon_Prog 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("deshmukhminakshi1998@gmail.com");
        WebElement conti=driver.findElement(By.id("continue"));
        conti.click();
	}

}

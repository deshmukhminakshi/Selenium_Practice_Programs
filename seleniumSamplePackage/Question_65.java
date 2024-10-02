package seleniumSamplePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Question_65
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String Tittle=driver.getTitle();
		System.out.println(Tittle);
		WebElement un =driver.findElement(By.id("email"));
		un.sendKeys("deshmukhminakshi1998@gmail.com");
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("Minakshi@1234");
		WebElement lo=driver.findElement(By.name("login"));
		lo.click();	
	}

}

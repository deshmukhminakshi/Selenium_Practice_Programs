package seleniumSamplePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class First_Code 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		WebElement Signin=driver.findElement(By.id("signIn"));
		Signin.click();
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='f4f9d406a2fbe']"));
		Select s1=new Select(dropdown);
		s1.selectByVisibleText("हिन्दी");
	}

}

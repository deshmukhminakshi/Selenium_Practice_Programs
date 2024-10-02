package seleniumSamplePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Co_ordinates_Prog 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement countryname=driver.findElement(By.linkText("Canada"));
		Point xandy=countryname.getLocation();
		int x=xandy.getX();
		int y=xandy.getY();
		System.out.println(x);
		System.out.println(y);
		
	}

}

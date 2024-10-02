package seleniumSamplePackage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Co_ordinates_Prog1 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement su=driver.findElement(By.linkText("Japan"));
		Point xandy=su.getLocation();
		int x=xandy.getX();
		int y=xandy.getY();
		System.out.println(x);
		System.out.println(y);
	}

}

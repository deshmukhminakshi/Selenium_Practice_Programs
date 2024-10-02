package testNgone;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report_prog 
{
@Test
public void google()
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	WebElement link=driver.findElement(By.linkText("Australia"));
	Point xandy=link.getLocation();
	double X=xandy.getX();
	double Y=xandy.getY();
	System.out.println(X);
	System.out.println(Y);
	Reporter.log("Test Case1");
}
}

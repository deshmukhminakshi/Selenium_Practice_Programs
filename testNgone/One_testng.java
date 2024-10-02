package testNgone;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class One_testng 
{
@Test

	public void launch()
	{
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	}
}


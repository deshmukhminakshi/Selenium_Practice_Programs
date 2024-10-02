package testNgone;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Enabled_prog 
{
@Test  (enabled=false)
public void A()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https:www.amazon.in");
}
}

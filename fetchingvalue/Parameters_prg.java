package fetchingvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_prg 
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void google_India(String nameofthebrowser)
	{
		if(nameofthebrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(nameofthebrowser.equals("edge"))
		{
			driver=new EdgeDriver();//calling choosebrowser.xml
		}
		if(nameofthebrowser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s1=new Select(dropdown);
		s1.selectByVisibleText("Amazon Fashion");
	}

}

package seleniumSamplePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//scenario->launch amazon->select books->type humans and press enter button
public class Fb 
{
	
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s1=new Select(dropdown);
		System.out.println(s1.getOptions());
		s1.selectByVisibleText("Books");
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Humans");
		search.sendKeys(Keys.ENTER);
		
	}

}

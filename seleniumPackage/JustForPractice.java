package seleniumPackage;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustForPractice 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("T-shirts for women");
	    //WebElement s2=driver.findElement(By.id("nav-search-submit-button"));
	    //s2.click();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    List <WebElement> s3=driver.findElements(By.className("s-suggestion-container"));
	    System.out.println(s3.size());
	    s3.get(6).click();
	}

}

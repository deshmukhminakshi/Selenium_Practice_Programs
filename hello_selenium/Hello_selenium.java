package hello_selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hello_selenium 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String a1=driver.getTitle();
		System.out.println(a1);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Krutis for Womes");
        Thread.sleep(200);
        WebElement dp=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select s1=new Select(dp);
        //s1.selectByVisibleText("Amazon Fashion");
        s1.selectByValue("search-alias=amazon-pharmacy");
        Thread.sleep(4000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        WebElement b2=driver.findElement(By.xpath("(//span[@class='nav-line-2'])[1]"));
        Actions c1=new Actions(driver);
        c1.moveToElement(b2).perform();
        Thread.sleep(3000);
        WebElement e1=driver.findElement(By.partialLinkText("हिन्दी"));
        e1.click();
        Thread.sleep(4000);
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();
        driver.findElement(By.id("APjFqb")).sendKeys("India");
        //driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        List <WebElement> o1=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
        o1.size();
        System.out.println(o1.size());
        Thread.sleep(200);
        o1.get(5).click();
	}

}

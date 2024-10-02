package seleniumPackage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag1=driver.findElement(By.id("drag7"));
		WebElement drop1=driver.findElement(By.id("div2"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag1, drop1).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement drag2=driver.findElement(By.id("div2"));
		WebElement drop2=driver.findElement(By.id("container-6"));
		a1.dragAndDrop(drag2, drop2).perform();
	}

}

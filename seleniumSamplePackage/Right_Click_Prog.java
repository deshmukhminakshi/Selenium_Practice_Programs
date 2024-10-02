package seleniumSamplePackage;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click_Prog 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grotechminds.com/");
		WebElement Right_Click=driver.findElement(By.linkText("Courses"));
		Actions a=new Actions(driver);
		a.contextClick(Right_Click).perform();
		Robot r1=new Robot();
        r1.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        r1.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        r1.keyPress(KeyEvent.VK_DOWN);
        r1.keyPress(KeyEvent.VK_ENTER);
        
	}

}

package seleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavascriptPopUp 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		driver.findElement(By.className("btnjs")).click();
		driver.switchTo().alert().accept();
	}

}

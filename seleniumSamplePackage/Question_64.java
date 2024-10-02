package seleniumSamplePackage;
  //String Manupulation
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_64 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("1st American president");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		String Tittle=driver.getTitle();
		System.out.print(Tittle);
		Thread.sleep(2000);
		for(int i=0;i<Tittle.length();i++)
		{
			System.out.println(Tittle.charAt(i));
		}
	}
}

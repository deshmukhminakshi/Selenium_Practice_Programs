package seleniumSamplePackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resume_Upload_prog 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement upload=driver.findElement(By.name("file-935"));
		upload.sendKeys("C:\\Users\\Anant\\Downloads\\Minakshi_Deshmukh_Resume.pdf");
		
		
	}

}

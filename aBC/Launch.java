package aBC;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("www.facebook.com");
		driver.close();
		

	}

}
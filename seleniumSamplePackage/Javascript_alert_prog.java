package seleniumSamplePackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_alert_prog 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		driver.switchTo().alert().accept();

	}

}

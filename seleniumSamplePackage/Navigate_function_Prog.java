package seleniumSamplePackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_function_Prog 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
	}

}

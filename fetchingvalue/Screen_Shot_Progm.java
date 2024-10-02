package fetchingvalue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screen_Shot_Progm 
{
  @Test
  public void launch() throws IOException
  {
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  TakesScreenshot s1=driver;
	File source= s1.getScreenshotAs(OutputType.FILE);
	File destination=new  File("C:\\Users\\Anant\\eclipse-workspace\\SeleniumProject\\ScreenShot\\Screeshottwo.png");
	FileUtils.copyFile(source, destination);  
	  
  }
  
}

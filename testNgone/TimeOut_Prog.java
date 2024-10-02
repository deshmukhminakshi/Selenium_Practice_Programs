package testNgone;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOut_Prog 
{
  @Test(timeOut=2000)
  public void login()
  {
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println("Login");
  }
}

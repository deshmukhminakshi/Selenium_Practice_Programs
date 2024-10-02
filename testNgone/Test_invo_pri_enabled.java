package testNgone;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_invo_pri_enabled 
{
 @Test(priority=1,invocationCount=2)
	 public void some()
	 {
		 System.out.println("Write Something");
	 }
 @Test(priority=-1,invocationCount=2,enabled=false)
 public void some1()
 {
	System.out.println("Why Me"); 
 }
 @Test(priority=-2,invocationCount=5,timeOut=5000)
 public void some2()
 {
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https:www.amazon.in");
	 System.out.println("I am right");
 }
 }


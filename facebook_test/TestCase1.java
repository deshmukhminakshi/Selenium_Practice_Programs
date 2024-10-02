package facebook_test;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import facebook_source.Fb_Login;

public class TestCase1 
{
	
  public static void main(String[]args)
  {
	  //prerequiset tings
	  //start
	  //1.launching browser.
	  //2.maximize it
	  
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  //over
	  
	  Fb_Login f1=new Fb_Login(driver);
	  f1.unsername_();
	  f1.password_();
	  f1.login_button_();
  }

}

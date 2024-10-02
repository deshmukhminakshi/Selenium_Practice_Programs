package fetchingvalue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo_DataProvider 
{
	@DataProvider(name="data2")
	public Object[] [] amazonlogin()
	{
		Object data[][]=new Object[2][2];
		data[0][0]="ram";
		data[0][1]="123";
		data[1][0]="rahul";
		data[1][1]="456";
		return data;	
	}
	@Test(dataProvider="data1")
	public void loginamazon(String un,String pw) throws InterruptedException
	{
		System.out.println(un+pw);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//WebElement em=driver.findElement(By.id("ap_email"));
		//em.sendKeys(un);
		//WebElement ep=driver.findElement(By.id("ap_password"));
		//ep.sendKeys(pw);
		//WebElement SignIn=driver.findElement(By.id("signInSubmit"));
		//SignIn.click();
		//Thread.sleep(3000);
		//driver.close();
	}
}
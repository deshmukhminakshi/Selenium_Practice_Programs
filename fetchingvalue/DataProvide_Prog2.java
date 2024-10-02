package fetchingvalue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide_Prog2 
{
	@DataProvider(name="data1")
	public Object[][] amazonlogin()
	{
		Object data[][]=new Object[2][2];
		data[0][0]="ram";
		data[0][1]="123";
		data[1][0]="sita";
		data[1][1]="123";
		return data;
		
	}
	@Test(dataProvider="data1")
	public void loginamazon(String un,String pwd) throws InterruptedException
	{	
		System.out.println(un+pwd);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to"
				+ "=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs."
				+ "openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id="
		        + "http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement Email=driver.findElement(By.id("ap_email"));
		Email.sendKeys(un);
		
		WebElement Cont=driver.findElement(By.id("continue"));
		Cont.sendKeys(pwd);
		
		WebElement pw=driver.findElement(By.id("ap_password"));
		pw.sendKeys(pwd);
		
		WebElement SignIn=driver.findElement(By.id("signInSubmit"));
		SignIn.click();
		Thread.sleep(3000);
		driver.close();
	}
}

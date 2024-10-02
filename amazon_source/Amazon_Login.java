package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login 
{
	WebDriver driver;
 //step1
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continue_btn;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signInSubmit_btn;

	
//Step2
	
	public void username_()
	{
		username.sendKeys("7350904236");
	}
	
	public void continue_btn_()
	{
		continue_btn.click();
	}
	
	public void password_()
	{
		password.sendKeys("Minakshi@1234");
	}
	
	public void signInSubmit_()
	{
		signInSubmit_btn.click();
	}
	
	//step3
	
	public Amazon_Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
}

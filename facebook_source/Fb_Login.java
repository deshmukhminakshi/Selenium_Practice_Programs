package facebook_source;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Login 
{
    //1.Locate each elements with @FindBy annotation.
	
	@FindBy(id="email")
	WebElement unsername;
	
    @FindBy(id="pass")
    WebElement password;
    
    @FindBy(name="login")
    WebElement login_button;
    
  //2.create separate methods for each elements.
  public void  unsername_()
  {
	  unsername.sendKeys("deshmukhminakshi1998@gmail.com");
  }
  public void  password_()
  {
	  password.sendKeys("ananta_wawge");
  }
  public void  login_button_()
  {
	  login_button.click();
  }
	
  //3.Initilize the element using the concept of pagefactory class.
  public Fb_Login(ChromeDriver driver)  //constructor--you have to intilize the element within it.
  {
	  PageFactory.initElements(driver,this);
  }
  
  
}

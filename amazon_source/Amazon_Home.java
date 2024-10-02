package amazon_source;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home 
{
	WebDriver driver;
	 //step1
		@FindBy(id="twotabsearchtextbox")
		WebElement searchtextBox;
		
		@FindBy(xpath="(//input)[6]")
		WebElement search_btn;
		
		
		//Step2
		
		public void searchtextBox_()
		{
			searchtextBox.sendKeys("shoes for men");
			//searchtextBox.sendKeys(Keys.ENTER);
		}
		
		public void search_btn_()
		{
			search_btn.click();
		}
		
		//step3
		
		public Amazon_Home(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		
		
		
	}



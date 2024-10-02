package testNgone;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Three_Test_trail 
{
	
	String id_1;
	String id_2;
	
	@Test
	public void test_1() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
	    WebElement se=driver.findElement(By.id("twotabsearchtextbox"));
	    se.sendKeys("Kurtis for women");
	    Thread.sleep(4000);
	    List <WebElement> list_1= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	    int count=list_1.size();
	    System.out.println(count);
	    list_1.get(7).click();
	    List <WebElement> list_2= driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
	    int count_2=list_2.size();
	    Thread.sleep(3000);
	    System.out.println(count_2);
	    list_2.get(4).click();
	    Set<String> parent_child=driver.getWindowHandles();
	    Iterator<String> pc=parent_child.iterator();
	    String id_1=pc.next();
	    String id_2=pc.next();
	    driver.switchTo().window(id_2);
	    Thread.sleep(3000);
	    WebElement add_to_cart=driver.findElement(By.id("add-to-cart-button"));
	    add_to_cart.click();
	    Thread.sleep(3000);
	    driver.switchTo().window(id_1);
	    driver.close();
	    Thread.sleep(3000);
	    driver.switchTo().window(id_2);
	    driver.close();
	    System.out.println("This is the 1st Test");
		
	}
	@Test
	public void test_2() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement fn= driver.findElement(By.id("fname"));
		fn.sendKeys("Manasi");
		Thread.sleep(3000);
		WebElement ln=driver.findElement(By.id("lname"));
		ln.sendKeys("Naik");
		Thread.sleep(3000);
		WebElement us=driver.findElement(By.id("Username"));
		us.sendKeys("manasinaik@1234");
		Thread.sleep(3000);
		WebElement ps=driver.findElement(By.name("password"));
		ps.sendKeys("12345678");
		WebElement ge=driver.findElement(By.id("FeMale"));
		ge.click();
		WebElement se=driver.findElement(By.id("Skills"));
		Select s1=new Select(se);
		s1.selectByVisibleText("Technical Skills");
		WebElement ad=driver.findElement(By.id("w3review"));
		ad.sendKeys("Nagpur");
		//int min=60;
		Thread.sleep(3000);
		WebElement f1=driver.findElement(By.id("Country"));
		Select s2=new Select(f1);
		s2.selectByVisibleText("Combodia ");
		Thread.sleep(3000);
		WebElement pe=driver.findElement(By.id("Address"));
		pe.sendKeys("Pune");
		Thread.sleep(2000);
		WebElement pi=driver.findElement(By.id("Pincode"));
		pi.sendKeys("443404");
		Thread.sleep(2000);
		WebElement sr=driver.findElement(By.id("Relegion"));
		Select s3=new Select(sr);
		s3.selectByVisibleText("Adherent");
		Thread.sleep(2000);
		WebElement res=driver.findElement(By.name("Resume"));
		res.sendKeys("C:\\f1\\Manasi_N.pdf");
		WebElement check_box=driver.findElement(By.id("Agree"));
		check_box.click();
		Thread.sleep(2000);
		WebElement sub=driver.findElement(By.xpath("(//div//input)[38]"));
		sub.click();
		System.out.println("This is the 2nd test");	
	}
	@Test
	public void test_3() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		WebElement a1= driver.findElement(By.xpath("//span[@class=\"icp-nav-link-inner\"]"));
		Actions a2=new Actions(driver);
		a2.moveToElement(a1).perform();
		Thread.sleep(3000);
		List<WebElement> s1= driver.findElements(By.xpath("//div[@class='nav-template nav-flyout-content nav-tpl-itemList']/a"));
		int count_of_dp=s1.size();
		System.out.println(count_of_dp);
		s1.get(7).click();
		System.out.println("This is the 3rd test");
		Reporter.log("This is failed");
		
	}
	@BeforeMethod
	public void Bm()
	{
		System.out.println("This is BM");
	}
	@AfterMethod
	public void Am()
	{
		System.out.println("This is AM");
	}

}

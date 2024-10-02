package testNgone;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Three_test 
{
	ChromeDriver driver=new ChromeDriver();
	String id_1;
	String id_2;
@Test
public void test_1() throws InterruptedException
{
	 WebElement add_to_cart=driver.findElement(By.id("add-to-cart-button"));
	    add_to_cart.click();
	    Thread.sleep(3000);
	    driver.switchTo().window(id_1);
	    driver.close();
	    Thread.sleep(3000);
	    driver.switchTo().window(id_2);
	    driver.close();
	
}
@Test
public void test_2() throws InterruptedException
{
	Set<String> parent_child=driver.getWindowHandles();
	Iterator<String> pc=parent_child.iterator();
	String id_1=pc.next();
	String id_2=pc.next();
	driver.switchTo().window(id_2);
    Thread.sleep(3000);
}
@Test
public void test_3() throws InterruptedException
{
	List <WebElement> list_2= driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
    int count_2=list_2.size();
    Thread.sleep(3000);
    System.out.println(count_2);
    list_2.get(4).click();
	
}
@BeforeMethod
public void beforemethod() throws InterruptedException
{

	driver.navigate().to("https://www.amazon.in/");
    WebElement se=driver.findElement(By.id("twotabsearchtextbox"));
    se.sendKeys("kurtis for women");
    Thread.sleep(4000);
}
@AfterMethod
public void aftermethod()
{
	List <WebElement> list_1= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
    int count=list_1.size();
    System.out.println(count);
    list_1.get(7).click();
	
}
}

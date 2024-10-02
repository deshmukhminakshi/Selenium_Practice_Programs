package testNgone;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Broken_Links_of_Flipkart 
{
  
	@Test
	public void Broken_Links_of_Flipkart_1() throws IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	    List<WebElement>links=driver.findElements(By.tagName("a"));
	    int count=links.size();
	    System.out.println("List of all Links:  "+count);
	    
	    WebElement url= links.get(2);
	    System.out.println("List of all Elements:  "+url);
	    
	    for(int i=0;i<=count-1;i++)
	    {
	    	WebElement linksurl=links.get(i);
			   String url1=linksurl.getAttribute("href");
				System.out.println("List of all Urls in Flipkart website: " +url1);
				CheckValidLinks(url1);
	    }
	}
	public static void CheckValidLinks(String url1) throws IOException
	   {
		   try
		   {
		   URL u1=new URL(url1);
		   HttpURLConnection c1=(HttpURLConnection) u1.openConnection();
		   c1.connect();
		   if(c1.getResponseCode()<=200)
		   {
			   System.out.print("It is the valid link:  "+url1);
		   }
		   else
		   {
			   System.out.println("It is the Invalid Link: "+url1+c1.getResponseCode()+c1.getResponseMessage());
		   }
		   }
		   catch(MalformedURLException a1)
		   {
			   System.out.println("There was null url exception so I have handlded it");
		   }
		  // catch(StaleElementReferenceException a2)
		   //{
			//   System.out.println("There was an stale element exception so I have handled it");
		  // }
}
}

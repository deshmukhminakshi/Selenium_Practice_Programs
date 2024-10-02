package fetchingvalue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Links 
{
  static ChromeDriver driver;
  
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		List<WebElement>links1=driver.findElements(By.tagName("a"));
		int totalcount=links1.size();
		System.out.println(totalcount);
		for(int i=0;i<=totalcount-1;i++)
		{
			WebElement linkur1=links1.get(i);
			String urlis=linkur1.getAttribute("href");
			System.out.println(urlis);
		}

	}

}

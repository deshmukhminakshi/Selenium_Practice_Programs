package aBC;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube 
{

	public static void main(String[] args) throws InterruptedException 
	{
		/*ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=23nZ_6y0x7U");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//ScrollTo
	    //js.executeScript("window.scrollTo(0,400)"); //ScrollDown
	    //Thread.sleep(3000);
	    
	    //ScrollUp
	   // js.executeScript("window.scrollTo(0,-400)");
	    Thread.sleep(3000);
	    
	    
	    //ScrollBy()
	    //js.executeScript("window.scrollBy(0,300)");
	    
	   // long height =(long)js.executeScript("return document.body.scrollHeight");
	    //System.out.println(height);*/
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/?gad_source=1&gclid=EAIaIQobChMI0OW3tMiShQMVQiZ7Bx2DvgGiEAAYASAAEgJ5QvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		long height =(long)js.executeScript("return document.body.scrollHeight");
	    System.out.println(height);
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}


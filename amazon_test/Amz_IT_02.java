package amazon_test;
import org.testng.annotations.Test;
import amazon_source.Amazon_Home;
import amazon_source.Amazon_Login;

public class Amz_IT_02 extends LaunchAndQuit
{
	@Test
	public void scenario2()
	{
		Amazon_Login a1=new Amazon_Login(driver);
		a1.username_();
		a1.continue_btn_();
		a1.password_();
		a1.signInSubmit_();
		
		Amazon_Home a2=new Amazon_Home(driver);
		a2.searchtextBox_();
		a2.search_btn_();
	}
}

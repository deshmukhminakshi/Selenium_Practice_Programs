package amazon_test;

import org.testng.annotations.Test;

import amazon_source.Amazon_Login;

public class Amz_IT_01 extends LaunchAndQuit
{
@Test
public void scenario1()
{
	Amazon_Login a1=new Amazon_Login(driver);
	a1.username_();
	a1.continue_btn_();
	a1.password_();
	a1.signInSubmit_();
}
}

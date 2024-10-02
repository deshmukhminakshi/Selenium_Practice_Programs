package testNgone;

import org.testng.annotations.Test;

public class Priority_1 
{ 
	@Test
	public void login()
	{
		System.out.println("Login");
	}
	@Test(priority=-1)
	public void registration()
	{
		System.out.println("Registration");
	}

}

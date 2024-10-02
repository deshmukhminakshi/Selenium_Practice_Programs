package testNgone;

import org.testng.annotations.Test;

public class Test_invocation 
{
	@Test(invocationCount=10)
	public void ABC()
	{
		System.out.println("Hey here is invocationcount");
	}

}

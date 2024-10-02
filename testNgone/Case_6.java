package testNgone;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Case_6 
{
	@BeforeMethod
		public void A()
		{
		System.out.println("BM");
		}
    @Test
      public void abc()
      {
	     System.out.println("T1");
      }
    @Test
    public void xyz()
    {
    	System.out.println("T2");
    }
    @Test
    public void xyz1()
    {
    	System.out.println("T3");
    }
    @AfterMethod
    	public void x()
    	{
    	System.out.println("AM");
    	}
   /* @BeforeMethod
	public void B()
	{
    	System.out.println("4");
	}*/
    
    /*@AfterMethod
	public void z()
	{
    	System.out.println("6");
	}*/

}



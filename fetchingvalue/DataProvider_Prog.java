package fetchingvalue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Prog 
{
  @DataProvider(name="data1")
  public Object[] []method1()
  {
	 return new Object[] [] {{10},{20},{30}}; 
  }
  @Test(dataProvider="data1")
  public void testcase1(int value1)
  {
	 System.out.println(value1);
	  
	  
  }
  
}

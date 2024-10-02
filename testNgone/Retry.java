package testNgone;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer 
{
      int count=0; //initial count retry is zero
      int retrynumber=3;  //this is time i wish to retry
	@Override
	public boolean retry(ITestResult result) {
		if(retrynumber>count)
		{
			count++;
			return true;
		}
		
		
		return false;
	}

}

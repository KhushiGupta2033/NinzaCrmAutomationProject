package ninzaCRM.genericUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserImplemnetation implements IRetryAnalyzer{
	
int count=0;
int retrycount=3;//After manual analysis - the script is working fine manually then do this

public boolean retry(ITestResult result) {
	
	while(count<retrycount)
	{
		count++;
		return true; 
	}
	
	return false;
}


}

package ninzaCRM.genericUtilities;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IRetryAnalyzerPractice {
	
	@Test(retryAnalyzer = ninzaCRM.genericUtilities.RetryAnalyserImplemnetation.class)
	public void sample() {
		Assert.fail();
		System.out.println("Demo");
	}

}

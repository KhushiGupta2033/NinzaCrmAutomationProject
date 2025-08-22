package practice;

import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;

public class ReportLoggingLowLevelReporting {
	
	@Test
	public void sample1() {
		
		System.out.println("line 1");
//		Reports.log("Line 1 executedd",true);
		System.out.println("line 2");
//		Report.log("Line 1 executedd",true);
		System.out.println("line 3");
		
	}
	
	

}

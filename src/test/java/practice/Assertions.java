package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
//	Hard Assertions
//	@Test
//	public void sampleTest() {
//		System.out.println("Step 1");
//		System.out.println("Step 2");
//		System.out.println("Step 3");
//		
//		Assert.assertEquals(1,5);
//		System.out.println("Step 4");
//		System.out.println("Step 5");
//	 
//	}
	
//	Soft Assertions
	@Test
	public void sampleTest() {
		SoftAssert sa=new SoftAssert();
		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
		
		sa.assertEquals(1, 5);
		System.out.println("Step 4");
		System.out.println("Step 5");
		sa.assertAll();
	 
	}
	
	

}

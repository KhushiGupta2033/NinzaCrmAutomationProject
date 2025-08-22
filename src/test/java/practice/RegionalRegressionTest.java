package practice;

import org.testng.annotations.Test;

public class RegionalRegressionTest {
	
	@Test(alwaysRun = true)
	public void test1() {
		System.out.println("Method 1");
	}
	
	@Test(alwaysRun = true)
	public void test2() {
		System.out.println("Method 2");
	}
	
	@Test(alwaysRun = true)
	public void test3() {
		System.out.println("Method 3");
	}

}

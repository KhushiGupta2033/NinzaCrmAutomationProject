package practice;

import org.testng.annotations.Test;

public class ToReadDataFromCmdLine {
	
	@Test
	public void readData() {
		
		String BROWSER=System.getProperty("browser");
		System.out.println(BROWSER);
		
		String USERNAME=System.getProperty("username");
		System.out.println(USERNAME);
		
		String PASSWORD=System.getProperty("password");
		System.out.println(PASSWORD);
	}

}

package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ninzaCRM.ObjectRepository.CreatePurchaseOrder;
import ninzaCRM.genericUtilities.FileUtility;
import ninzaCRM.genericUtilities.WebDriverUtility;

public class TC_03 {

	public static void main(String[] args) throws IOException {
		
		//Create Object of utility
		FileUtility fu= new FileUtility();
		WebDriverUtility web=new WebDriverUtility();
		
		
		//Reading Data
		String browser=fu.readDataFromPropertyFile("browser");
		String URL= fu.readDataFromPropertyFile("url");
		String user=fu.readDataFromPropertyFile("username");
		String pass=fu.readDataFromPropertyFile("password");
		
		WebDriver driver=web.getDriver(browser);
		web.maximizeWindow(driver);
		driver.get(URL);
		
		//Login with credentials
		driver.findElement(By.id("username")).sendKeys(user);
        driver.findElement(By.id("inputPassword")).sendKeys(pass);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Login Verified");
        
        //Purchase Order Button
        driver.findElement(By.xpath("//a[.='Purchase Order']")).click();
        
        //Create order button
        driver.findElement(By.className("btn btn-info")).click();
        
        
        
		
		
		

	}

}

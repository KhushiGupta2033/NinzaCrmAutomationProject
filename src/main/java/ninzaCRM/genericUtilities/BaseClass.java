package ninzaCRM.genericUtilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import ninzaCRM.ObjectRepository.DashBoardPage;
import ninzaCRM.ObjectRepository.LoginPage;


/**
 * This class consists of basic configuration annotations of TestNG
 */
public class BaseClass {
	
	public WebDriverUtility webUtil= new WebDriverUtility();
	public FileUtility fUtil= new FileUtility();
	public WebDriver driver;
//	For listeners
	public static WebDriver sdriver;
	
	@BeforeSuite(alwaysRun = true)
	public void bsConfig() {
		System.out.println("==DB connection Sucessful==");
	}
	
//	@BeforeClass
//	@Parameters("browser")
	@BeforeTest
	public void bcConfig(/*String BROWSER*/) throws IOException {
		
		String BROWSER=fUtil.readDataFromPropertyFile("browser");
		String URL=fUtil.readDataFromPropertyFile("url");
		
		if(BROWSER.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		webUtil.maximizeWindow(driver);
		driver.get(URL);
		
		System.out.println("== Browser Launched==");
		
		//For listner
		sdriver=driver;
		
	}
	
	@BeforeMethod
	public void bmConfig() throws IOException {
		String USERNAME=fUtil.readDataFromPropertyFile("username");
		String PASS= fUtil.readDataFromPropertyFile("password");
		
		LoginPage lp= new LoginPage(driver);
		lp.getUsernameTF().sendKeys(USERNAME);
		lp.getPasswordTF().sendKeys(PASS);
		lp.getSignInBtn().click();
		System.out.println("==Sign In Sucessfull=");
	}
	
	@AfterMethod
	public void amConfig() throws InterruptedException {
		DashBoardPage db= new DashBoardPage(driver);
		db.getUserBtn().click();
		Thread.sleep(2000);
		db.getLogoutBtn().click();
		System.out.println("=Logout sucessfull=");
	}
	
//	@AfterClass(alwaysRun = true)
	@AfterTest
	public void acConifg() {
		
		driver.quit();
		System.out.println("==Broswer Closed==");
	}
	
	@AfterSuite(alwaysRun = true)
	public void asConfig() {
		System.out.println("==DB connection Ended Sucessful==");
	}

}

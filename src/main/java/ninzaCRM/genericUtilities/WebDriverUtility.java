package ninzaCRM.genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class will return generic methods related to WebDriver
 * @author KhushiGupta
 */
public class WebDriverUtility {
	
	/**
	 * This method will return the driver type
	 * @param browser
	 * @return
	 */
	//Run Time Polymorphism
	public WebDriver getDriver(String browser) {
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		return driver;
	}
	
	/**
	 * This method will maximize the browser window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * This method will minimize the browser window
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	/**
	 * This method will full screen the browser window
	 * @param driver
	 */
	public void fullScreenWindow(WebDriver driver) {
		driver.manage().window().fullscreen();
	}
	
//	Wait Handling
	/**
	 * This method will contains implicitly wait method with duration of 10s
	 * @param driver
	 */
	public void getImplicitlyWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/**
	 * This method consist of explicity wait condition until the element is visible
	 * @param driver
	 * @param element
	 */
	public void getExplicityWaitForVisibility(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method consist of explicity wait condition until the element is clickable
	 * @param driver
	 * @param element
	 */
	public void getExplicityWaitForClickability(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
//	Select Handling
	/**
	 * This method will select the element based on index 
	 * @param element
	 * @param index
	 */
	public void handleDropDown(WebElement element,int index) {
		Select sc= new Select(element);
		sc.selectByIndex(index);
	}
	
	/**
	 * This method will select the element based on value
	 * @param value
	 * @param element
	 */
	public void handleDropDown(String value,WebElement element) {
		Select sc= new Select(element);
		sc.selectByValue(value);
	}
	
	/**
	 * This method will select the element based on visible Text
	 * @param element
	 * @param visibleText
	 */
	public void handleDropDown(WebElement element,String visibleText) {
		Select sc= new Select(element);
		sc.selectByVisibleText(visibleText);
		
	}
	
//	Action Handling
	
	/**
	 * This method will perform move overing action 
	 * @param driver
	 * @param ele
	 */
	public void actionForMoveOvering(WebDriver driver, WebElement ele) {
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	/**
	 * This method will perform drag and drop action
	 * @param driver
	 * @param src
	 * @param trg
	 */
	public void dragAnddDropAction(WebDriver driver, WebElement src, WebElement trg) {
		Actions act= new Actions(driver);
		act.dragAndDrop(src,trg).perform();
	}
	
	/**
	 * This method will perform click and hold option
	 * @param driver
	 */
	public void clickAndHoldAction(WebDriver driver) {
		Actions act= new Actions(driver);
		act.clickAndHold().perform();
	}
	
	/**
	 * This method will perform release action
	 * @param driver
	 */
	public void releaseAction(WebDriver driver) {
		Actions act= new Actions(driver);
		act.release().perform();
	}
	
	/**
	 * This method will perform moveByOffset action
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void moveByOffseyAction(WebDriver driver, int x,int y) {
		Actions act= new Actions(driver);
		act.moveByOffset(x, y).perform();
	}
	
	/**
	 * This method will perform double click action
	 * @param driver
	 */
	public void doubleClickAction(WebDriver driver) {
		Actions act= new Actions(driver);
		act.doubleClick().perform();
	}
	
	/**
	 * This method will perform context click action
	 * @param driver
	 */
	public void contextClickAction(WebDriver driver) {
		Actions act= new Actions(driver);
		act.contextClick().perform();
	}
	
	/**
	 * This method will perform scroll action by amount
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scrollByAmountAction(WebDriver driver, int x, int y) {
		Actions act= new Actions(driver);
		act.scrollByAmount(x, y).perform();
	}
	
	/**
	 * This method will perfrom scroll action based on element
	 * @param driver
	 * @param ele
	 */
	public void scrollToElement(WebDriver driver, WebElement ele) {
		Actions act= new Actions(driver);
		act.scrollToElement(ele).perform();
	}
	
	
//	Frame Handling
	/**
	 * This method will switch to frame based on index
	 * @param driver
	 * @param index
	 */
	public void frameHandling(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * This method will switch to frame based on window name
	 * @param driver
	 * @param windowName
	 */
	public void frameHandling(WebDriver driver, String windowName) {
		driver.switchTo().frame(windowName);
	}
	
	/**
	 * This method will switch to frame based on WebElement
	 * @param driver
	 * @param element
	 */
	public void frameHandling(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/**
	 * This method will switch to parent frame
	 * @param driver
	 */
	public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	
	/**
	 * This method will switch the control to default content
	 * @param driver
	 */
	public void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	
//	Alerts
	/**
	 * This method will accept the alert
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	/**
	 * This method will dismiss the alert
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	
	/**
	 * This method will send Keys to a alert
	 * @param driver
	 * @param element
	 */
	public void sendKeysToAlert(WebDriver driver, String element) {
		driver.switchTo().alert().sendKeys(element);
	}
	
	/**
	 * This method will capture text of alert
	 * @param driver
	 * @return
	 */
	public String captureAlert(WebDriver driver) {
		String text=driver.switchTo().alert().getText();
		return text;
	}
	
//	Window Handling
	/**
	 * This method will switch to child window
	 * @param driver
	 * @param window
	 * @param parent
	 */
	public void switchtoChildWindow(WebDriver driver, String window,String parent) {
		if(!parent.equals(window))
		driver.switchTo().window(window);
	}
	
	/**
	 * This method will switch to parent if multiple childs are present
	 * @param driver
	 * @param partialTitle
	 */
	public void multipleChildWindow(WebDriver driver, String partialTitle) {
	     Set<String> windows= driver.getWindowHandles();
	     for(String win:windows) {
	    	 driver.switchTo().window(win);
	    	 if(driver.getTitle().contains(partialTitle)) {
	    		 break;
	    	 }
	     }
	}
	
	public String captureScreenShot(WebDriver driver, String screenshotName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(".\\ScreenShotsTS\\"+screenshotName+".png");
	    FileHandler.copy(src, dst);
		
		return dst.getAbsolutePath();
	}
	
}

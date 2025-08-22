package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_02 {

	public static void main(String[] args) throws IOException, InterruptedException {
//		Common Details
		FileInputStream fin= new FileInputStream( "C:\\Selenium\\FireFlink.ninzaCRM.AutoamtionFramework\\src\\test\\resources\\CommonData.properties");
        Properties p=new Properties();
        p.load(fin);
        String browser=p.getProperty("browser");
        String URL=p.getProperty("url");
        String user=p.getProperty("username");
        String pass=p.getProperty("password");
        
//        Excel
        FileInputStream excel=new FileInputStream("C:\\Users\\User\\Desktop\\FireFlink.TestData.xlsx");
        Workbook wobj= WorkbookFactory.create(excel);
        Sheet sobj= wobj.getSheet("Tc_Data");
        WebDriver driver =null;
        
        
        if(browser.equals("Chrome")) {
        	driver= new ChromeDriver();
        }
        else if(browser.equals("Edge")) {
        	driver = new EdgeDriver();
        }
        else if(browser.equals("Firefox")) {
        	driver = new FirefoxDriver();
        }
        
//		 Action class
		 Actions act= new Actions(driver);
        
        driver.manage().window().maximize();
        driver.get(URL);
        String parentWindow=driver.getWindowHandle();
        driver.findElement(By.id("username")).sendKeys(user);
        driver.findElement(By.id("inputPassword")).sendKeys(pass);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        
        //purchase order
        String sub=sobj.getRow(4).getCell(2).toString();
        String date=sobj.getRow(4).getCell(3).toString();
        String add=sobj.getRow(4).getCell(4).toString();
        String billingPO=sobj.getRow(4).getCell(5).toString();
        String city=sobj.getRow(4).getCell(6).toString();
        String state=sobj.getRow(4).getCell(7).toString();
        String post=sobj.getRow(4).getCell(8).toString();
        String country=sobj.getRow(4).getCell(9).toString();
        String shipAdd=sobj.getRow(4).getCell(10).toString();
        String shippingPO=sobj.getRow(4).getCell(11).toString();
        String shippingCity=sobj.getRow(4).getCell(12).toString();
        String shippingState=sobj.getRow(4).getCell(13).toString();
        String shippingPost=sobj.getRow(4).getCell(14).toString();
        String shippingCon=sobj.getRow(4).getCell(15).toString();
        
        
        driver.findElement(By.xpath("//a[.='Purchase Order']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[.='Create Order']")).click();
        driver.findElement(By.name("subject")).sendKeys(sub);
        driver.findElement(By.name("dueDate")).sendKeys(date);
        driver.findElement(By.xpath("(//*[local-name()='svg'])[2]")).click();
		  Thread.sleep(2000);
		  
		  Set<String> windows= driver.getWindowHandles();
		  for(String handle:windows) {
			  driver.switchTo().window(handle);
		  }
		  
		  driver.findElement(By.xpath("(//button[text()='Select'])[1]")).click();	  
		  Thread.sleep(2000);
		 
		  driver.switchTo().window(parentWindow);
		  Thread.sleep(2000);
		  act.scrollByAmount(0,300);
		  
		  driver.findElement(By.name("address")).sendKeys(add);
		  driver.findElement(By.name("poBox")).sendKeys(billingPO);
		  driver.findElement(By.name("city")).sendKeys(city);
		  driver.findElement(By.name("state")).sendKeys(state);
		  driver.findElement(By.name("postalCode")).sendKeys(post);
		  driver.findElement(By.name("country")).sendKeys(country);
		  driver.findElement(By.xpath("(//textarea[@name='address'])[2]")).sendKeys(shipAdd);
		  driver.findElement(By.xpath("(//input[@name='poBox'])[2]")).sendKeys(shippingPO);
		  driver.findElement(By.xpath("(//input[@name='city'])[2]")).sendKeys(shippingCity);
		  driver.findElement(By.xpath("(//input[@name='state'])[2]")).sendKeys(shippingState);
		  driver.findElement(By.xpath("(//input[@name='postalCode'])[2]")).sendKeys(shippingPost);
		  driver.findElement(By.xpath("(//input[@name='country'])[2]")).sendKeys(shippingCon);
		  driver.findElement(By.xpath("//div[@style='margin-top: 20px;']/button[@class='action-button']")).click();
          Thread.sleep(3000);
		  
		  windows= driver.getWindowHandles();
		  for(String handle:windows) {
			  driver.switchTo().window(handle);
		  }
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.xpath("//button[contains(@onclick,'IM_PROD_001')]")).click();
		  driver.switchTo().window(parentWindow);
		  Thread.sleep(2000);
		   
		  driver.findElement(By.xpath("//button[.='Create Purchase Order']")).click();
		  Thread.sleep(1000);
		  act.scrollByAmount(0, 900).perform();
		  System.out.println("Create Purchase Order- verified");
		  
		  
        

	}

}

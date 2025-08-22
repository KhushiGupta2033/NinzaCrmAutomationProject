package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class TC_01 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
//		Random Class
		 Random ran=new Random();
		 int randomInt= ran.nextInt(10000000);
	    
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
        
        //Contact infor
        String organization=sobj.getRow(1).getCell(3).toString();
        String contactName=sobj.getRow(1).getCell(2).toString();
        String mobile=sobj.getRow(1).getCell(5).toString()+randomInt;
        
       
        
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
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		  
//		  Details of contact
		  driver.findElement(By.xpath("//input[@name='organizationName']")).sendKeys("Qspiders");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@name='title']")).sendKeys(organization);
		  driver.findElement(By.xpath("//input[@name='contactName']")).sendKeys(contactName);
		  driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys(mobile);
		  driver.findElement(By.xpath("(//*[local-name()='svg'])[2]")).click();
		  Thread.sleep(2000);
		  
		  Set<String> windows= driver.getWindowHandles();
		  for(String handle:windows) {
			  driver.switchTo().window(handle);
		  }
		   
		  driver.findElement(By.xpath("(//button[text()='Select'])[1]")).click();
		  driver.switchTo().window(parentWindow);
		  
		  driver.findElement(By.xpath("//button[text()='Create Contact']")).click();
		  System.out.println("Contact Details- verified");
		  
		  //Products
		  String productName=sobj.getRow(1).getCell(9).toString();
		  String quan=sobj.getRow(1).getCell(8).toString();
		  String price=sobj.getRow(1).getCell(10).toString();
		  
		  driver.findElement(By.xpath("//a[.='Products']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//span[text()=\"Add Product\"]/..//i")).click();
		  driver.findElement(By.name("productName")).sendKeys(productName);
		  WebElement prodrop=driver.findElement(By.name("productCategory"));
		  Select s=new Select(prodrop);
		  s.selectByValue("Electronics");
		  driver.findElement(By.name("quantity")).sendKeys(quan);
		  driver.findElement(By.name("price")).sendKeys(price);
		  WebElement vendordrop= driver.findElement(By.name("vendorId"));
		  Select s1= new Select(vendordrop);
		  s1.selectByValue("VID_001");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  System.out.println("Product details verified");
		
//        Purchase Order
		  int ranSub = ran.nextInt(10);

		  String sub=sobj.getRow(1).getCell(14).toString() + ranSub;
		  String date=sobj.getRow(1).getCell(13).toString();
		  String add=sobj.getRow(1).getCell(15).toString();
		  String billingPO=sobj.getRow(1).getCell(16).toString();
		  String city=sobj.getRow(1).getCell(17).toString();
		  String state=sobj.getRow(1).getCell(18).toString();
		  String post=sobj.getRow(1).getCell(19).toString();
		  String country=sobj.getRow(1).getCell(20).toString();
		  String shipAdd=sobj.getRow(1).getCell(21).toString();
		  String shippingPO=sobj.getRow(1).getCell(22).toString();
		  String shippingCity=sobj.getRow(1).getCell(23).toString();
		  String shippingState=sobj.getRow(1).getCell(24).toString();
		  String shippingPost=sobj.getRow(1).getCell(25).toString();
		  String shippingCon=sobj.getRow(1).getCell(26).toString();
		  
		  
		  driver.findElement(By.xpath("//a[.='Purchase Order']")).click();
		  driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		  driver.findElement(By.name("subject")).sendKeys(sub);
//		  driver.findElement(By.name("dueDate")).sendKeys(date);
		  driver.findElement(By.xpath("(//*[local-name()='svg'])[2]")).click();
		  Thread.sleep(3000);
		  
		  windows= driver.getWindowHandles();
		  for(String handle:windows) {
			  driver.switchTo().window(handle);
		  }
		   
		  driver.findElement(By.xpath("//button[contains(@onclick,'CON00001')]")).click();
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
		   
		  driver.findElement(By.xpath("//button[contains(@onclick,'IM_PROD_001')]")).click();
		  driver.switchTo().window(parentWindow);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[.='Create Purchase Order']")).click();
		  Thread.sleep(1000);
		  act.scrollByAmount(0, 900).perform();
		  System.out.println("Create Purchase Order- verified");
		  
		  driver.close();
		  
		  
		  
		  
        
        
        
        

	}

}

package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrderPage {
	
	@FindBy(xpath = "//select[@class='form-control']")
	 private WebElement orderIdSelect;

	@FindBy(xpath = "//input[@class='form-control']")
	 private WebElement orderIdTF;
	
	@FindBy(xpath = "//span[.='Create Order']")
	 private WebElement createorderBtn;
	
	public SalesOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getOrderIdSelect() {
		return orderIdSelect;
	}

	public WebElement getOrderIdTF() {
		return orderIdTF;
	}

	public WebElement getCreateorderBtn() {
		return createorderBtn;
	}

}

package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	@FindBy(xpath = "//select[@class='form-control']")
	 private WebElement contIdSelect;

	@FindBy(xpath = "//input[@class='form-control']")
	 private WebElement contIdTF;
	
	@FindBy(xpath = "//span[.='Create Contact']")
	 private WebElement createContBtn;
	
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getContIdSelect() {
		return contIdSelect;
	}

	public WebElement getContIdTF() {
		return contIdTF;
	}

	public WebElement getCreateContBtn() {
		return createContBtn;
	}
}

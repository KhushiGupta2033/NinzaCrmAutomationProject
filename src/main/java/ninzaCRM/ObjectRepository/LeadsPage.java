package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement selectDropDown;
	
	@FindBy(xpath = "//input[@placeholder='Search by Lead Id']")
	private WebElement  serachByIdTF;
	
	@FindBy(xpath = "//span[.='Create Lead']")
	private WebElement createLeadBtn;
	
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectDropDown() {
		return selectDropDown;
	}

	public WebElement getSerachByIdTF() {
		return serachByIdTF;
	}

	public WebElement getCreateLeadBtn() {
		return createLeadBtn;
	}

}

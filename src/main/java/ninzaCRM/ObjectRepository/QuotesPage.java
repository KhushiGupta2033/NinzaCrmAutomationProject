package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotesPage {
	
	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement selectDropDown;
	
	@FindBy(xpath = "//input[@placeholder='Search by Lead Id']")
	private WebElement  serachByOppIdTF;

	@FindBy(xpath = "//span[.='Create Quote']")
	private WebElement createQuotesBtn;
	
	public QuotesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    public WebElement getSelectDropDown() {
		return selectDropDown;
	}

	public WebElement getSerachByOppIdTF() {
		return serachByOppIdTF;
	}

	public WebElement getCreateQuotesBtn() {
		return createQuotesBtn;
	}



}

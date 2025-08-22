package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	
	@FindBy(name = "organizationName")
	private WebElement organizationTF;

	@FindBy(name = "title")
	private WebElement titleTF;
	
	@FindBy(name = "contactName")
	private WebElement contactNameTF;
	
	@FindBy(name = "mobile")
	private WebElement mobTF;
	
	@FindBy(xpath = "//*[local-name()='svg' and @data-icon='plus']")
	private WebElement createCpgBtn;
	
	public CreateContactPage(WebDriver driver) {
	PageFactory.initElements(driver,this);	
	}
	
	public WebElement getOrganizationTF() {
		return organizationTF;
	}

	public WebElement getTitleTF() {
		return titleTF;
	}

	public WebElement getContactNameTF() {
		return contactNameTF;
	}

	public WebElement getMobTF() {
		return mobTF;
	}

	public WebElement getCreateCpgBtn() {
		return createCpgBtn;
	}

}

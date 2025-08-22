package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadsPage {
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement lastNameTF;
	
	@FindBy(name = "company")
	private WebElement companyTF;
	
	@FindBy(name="leadSource")
	private WebElement leadSourceTF;
	
	@FindBy(name="industry")
	private WebElement industryTF;
	
	@FindBy(name="phone")
	private WebElement phoenTF;
	
	@FindBy (name="leadStatus")
	private WebElement leadStatusTF;
	
	@FindBy(xpath = "//*[local-name()='svg' and @data-icon='plus']")
	private WebElement createCpgBtn;
	
	@FindBy(xpath = "//button[.='Create Lead']")
	private WebElement createLeadBtn;
	
	public CreateLeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	public WebElement getCompanyTF() {
		return companyTF;
	}

	public WebElement getLeadSourceTF() {
		return leadSourceTF;
	}

	public WebElement getIndustryTF() {
		return industryTF;
	}

	public WebElement getPhoenTF() {
		return phoenTF;
	}

	public WebElement getLeadStatusTF() {
		return leadStatusTF;
	}

	public WebElement getCreateCpgBtn() {
		return createCpgBtn;
	}

	public WebElement getCreateLeadBtn() {
		return createLeadBtn;
	}
	
	

}

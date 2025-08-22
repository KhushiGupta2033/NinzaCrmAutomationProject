package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOpportunityPage {
	
	@FindBy(name = "opportunityName")
	private WebElement oppNameTF;
	
	@FindBy(name = "nextStep")
	private WebElement nextStepTF;
	
	@FindBy(name = "amount")
	private WebElement amountTF;
	
	@FindBy(name = "businessType")
	private WebElement businessTypeTF;
	
	@FindBy(name = "salesStage")
	private WebElement salesStageTF;
	
	@FindBy(xpath = "//*[local-name()='svg' and @data-icon='plus']")
	private WebElement createLeadBtn;
	
	@FindBy(xpath = "//button[.='Create Opportunity']")
	private WebElement createOppBtn;
	
	public CreateOpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOppNameTF() {
		return oppNameTF;
	}

	public WebElement getNextStepTF() {
		return nextStepTF;
	}

	public WebElement getAmountTF() {
		return amountTF;
	}

	public WebElement getBusinessTypeTF() {
		return businessTypeTF;
	}

	public WebElement getSalesStageTF() {
		return salesStageTF;
	}

	public WebElement getCreateLeadBtn() {
		return createLeadBtn;
	}

	public WebElement getCreateOppBtn() {
		return createOppBtn;
	}

}

package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateQuotePage {
	
	@FindBy(name="subject")
	private WebElement subTF;
	
	@FindBy(name = "quoteStage")
	private WebElement quoteStageTF;
	
	@FindBy(name="validTill")
	private WebElement validDateTF;
	
	@FindBy(xpath = "(//*[local-name()='svg' and @data-icon='plus'])[1]")
	private WebElement OppBtn;
	
	@FindBy(xpath = "(//*[local-name()='svg' and @data-icon='plus'])[2]")
	private WebElement contactBtn;
	
	@FindBy(xpath = "(//textarea[@name='address'])[1]")
	private WebElement billingAddTF;
	
	@FindBy(name="poBox")
	private WebElement billingPoBoxTF;
	
	@FindBy(name="city")
	private WebElement billingCityTF;
	
	@FindBy(name="state")
	private WebElement billingStateTF;
	
	@FindBy(name="postalCode")
	private WebElement billingPostalCodeTF;
	
	@FindBy(name="country")
	private WebElement billingCountryTF;
	
	@FindBy(xpath="(//textarea[@name='address'])[2]")
	private WebElement shippingAddTF;
	
	@FindBy(xpath="(//input[@name='poBox'])[2]")
	private WebElement shippingPoBoxTF;
	
	@FindBy(xpath = "(//input[@name='city'])[2]")
	private WebElement shippingCityTF;
	
	@FindBy(xpath = "(//input[@name='state'])[2]")
	private WebElement shippingStateTF;
	
	@FindBy(xpath = "(//input[@name='postalCode'])[2]")
	private WebElement shippingPostCodeTF;
	
	@FindBy(xpath = "(//input[@name='country'])[2]" )
	private WebElement shippingCountryTF;
	
	@FindBy(xpath = "(//*[local-name()='svg' and @data-icon='plus'])[3]")
	private WebElement addProductBtn;
	
	//Inside Product window
	@FindBy(xpath = "//button[@class='select-btn']")
	private WebElement addProductSelectBtn;
	
	@FindBy(xpath ="//button[.='Create Quote']" )
	private WebElement createQuoteBTn;
	
	public CreateQuotePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubTF() {
		return subTF;
	}

	public WebElement getQuoteStageTF() {
		return quoteStageTF;
	}

	public WebElement getValidDateTF() {
		return validDateTF;
	}

	public WebElement getOppBtn() {
		return OppBtn;
	}

	public WebElement getContactBtn() {
		return contactBtn;
	}

	public WebElement getBillingAddTF() {
		return billingAddTF;
	}

	public WebElement getBillingPoBoxTF() {
		return billingPoBoxTF;
	}

	public WebElement getBillingCityTF() {
		return billingCityTF;
	}

	public WebElement getBillingStateTF() {
		return billingStateTF;
	}

	public WebElement getBillingPostalCodeTF() {
		return billingPostalCodeTF;
	}

	public WebElement getBillingCountryTF() {
		return billingCountryTF;
	}

	public WebElement getShippingAddTF() {
		return shippingAddTF;
	}

	public WebElement getShippingPoBoxTF() {
		return shippingPoBoxTF;
	}

	public WebElement getShippingCityTF() {
		return shippingCityTF;
	}

	public WebElement getShippingStateTF() {
		return shippingStateTF;
	}

	public WebElement getShippingPostCodeTF() {
		return shippingPostCodeTF;
	}

	public WebElement getShippingCountryTF() {
		return shippingCountryTF;
	}

	public WebElement getAddProductBtn() {
		return addProductBtn;
	}

	public WebElement getAddProductSelectBtn() {
		return addProductSelectBtn;
	}

	public WebElement getCreateQuoteBTn() {
		return createQuoteBTn;
	}
}

package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	@FindBy(xpath = "//a[.='Contacts']")
	private WebElement contactLink;
	
	@FindBy(xpath = "//a[.='Leads']")
	private WebElement leadsLink;
	
	@FindBy(xpath = "//a[.='Opportunities']")
	private WebElement opptLink;
	
	@FindBy(xpath = "//a[.='Products']")
	private WebElement producttLink;
	
	@FindBy(xpath = "//a[.='Quotes']")
	private WebElement quotesLink;
	
	@FindBy(xpath = "//a[.='Purchase Order']")
	private WebElement purchaseOrderLink;
	
	@FindBy(xpath = "//a[.='Sales Order']")
	private WebElement salesLink;
	
	@FindBy(xpath = "//a[.='Invoice']")
	private WebElement invoiceLink;
	
	@FindBy(xpath = "//div[@class='user-icon']")
	private WebElement userBtn;
	
	@FindBy(xpath = "//div[@class='dropdown-item logout']")
	private WebElement logoutBtn;

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getOpptLink() {
		return opptLink;
	}

	public WebElement getProducttLink() {
		return producttLink;
	}

	public WebElement getQuotesLink() {
		return quotesLink;
	}

	public WebElement getPurchaseOrderLink() {
		return purchaseOrderLink;
	}

	public WebElement getSalesLink() {
		return salesLink;
	}

	public WebElement getInvoiceLink() {
		return invoiceLink;
	}

	public WebElement getUserBtn() {
		return userBtn;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

}

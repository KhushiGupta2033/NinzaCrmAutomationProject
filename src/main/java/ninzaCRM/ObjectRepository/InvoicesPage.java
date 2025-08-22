package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicesPage {
	
	@FindBy(xpath = "//select[@class='form-control']")
	 private WebElement invoiceIdSelect;

	@FindBy(xpath = "//input[@class='form-control']")
	 private WebElement invoiceIdTF;
	
	@FindBy(xpath = "//span[.='Create Invoice']")
	 private WebElement createInvoicetBtn;
	
	public InvoicesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getInvoiceIdSelect() {
		return invoiceIdSelect;
	}

	public WebElement getInvoiceIdTF() {
		return invoiceIdTF;
	}

	public WebElement getCreateInvoicetBtn() {
		return createInvoicetBtn;
	}

}

package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtilities.WebDriverUtility;

public class AddProductPage extends WebDriverUtility{
	
	@FindBy(name="productName")
	private WebElement productNameTF;
	
	@FindBy(name="quantity")
	private WebElement quantityTF;
	
	@FindBy(name="price")
	private WebElement priceTF;
	
	@FindBy(name="vendorId")
	private WebElement vendorSelect;
	
	@FindBy(name="productCategory")
	private WebElement productCatSelect;
	
	 public  AddProductPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

	 public WebElement getProductNameTF() {
		 return productNameTF;
	 }

	 public WebElement getQuantityTF() {
		 return quantityTF;
	 }

	 public WebElement getPriceTF() {
		 return priceTF;
	 }

	 public WebElement getVendorSelect() {
		 return vendorSelect;
	 }

	 public WebElement getProductCatSelect() {
		 return productCatSelect;
	 }
	 
	 public void addProdducts(String productName,String quan,String price,String category) {
		 productNameTF.sendKeys(productName);
		 quantityTF.sendKeys(quan);
		 priceTF.sendKeys(price);
		 handleDropDown(category,productCatSelect);
	 }

}

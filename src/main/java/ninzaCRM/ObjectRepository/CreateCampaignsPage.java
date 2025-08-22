package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtilities.WebDriverUtility;

public class CreateCampaignsPage extends WebDriverUtility {
	
	@FindBy(name="campaignName")
	 private WebElement campNameTF;
	

	@FindBy(name="targetSize")
	 private WebElement campTargTF;
	
	@FindBy(xpath = "//button[.='Create Campaign']")
	 private WebElement createCampBtn;
	
	 public CreateCampaignsPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	 public WebElement getCampNameTF() {
		return campNameTF;
	}

	public WebElement getCampTargTF() {
		return campTargTF;
	}

	public WebElement getCreateCampBtn() {
		return createCampBtn;
	}
	
//  public void createProduct(String quantity,String productName,String price,String productCategory,String vendor) {
//  quantityTF.sendKeys(quantity);
//  productNameTF.sendKeys(productName);
//  priceTF.clear();
////priceTF.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
//  priceTF.sendKeys(price);
//  handlingDropDownByVisibleText(productCategoryDropDown, productCategory);
//  handlingDropDownByVisibleText(vendorIdDD, vendor);
//  addProductBtn.click();
//}
	
	//business Layer
	public void createCampaign(String name, String targ) {
		campNameTF.sendKeys(name);
		campTargTF.sendKeys(targ);
		createCampBtn.click(); 
	}
}

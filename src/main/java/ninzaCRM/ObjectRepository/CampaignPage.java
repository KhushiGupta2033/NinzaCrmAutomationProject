package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ninzaCRM.genericUtilities.WebDriverUtility;

public class CampaignPage extends WebDriverUtility{
	
	@FindBy(name = "campaignName")
	private WebElement campNameTF;
	
	@FindBy(name = "targetSize")
	private WebElement trgSizeTF;
	
	@FindBy(xpath = "//button[.='Create Campaign']")
	private WebElement createCampBtn;
	
   public CampaignPage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
   }

   public WebElement getCampNameTF() {
	return campNameTF;
   }

   public WebElement getTrgSizeTF() {
	return trgSizeTF;
   }

   public WebElement getCreateCampBtn() {
	return createCampBtn;
   }
   
   //Business Logic
   public void clickCreateBtn() {
	   createCampBtn.click();
   }
   

}

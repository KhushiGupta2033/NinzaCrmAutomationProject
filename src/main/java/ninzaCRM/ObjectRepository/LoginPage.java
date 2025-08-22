package ninzaCRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Step-1 create a separate class for each page
public class LoginPage {
	
	//Step 2- Identify the webElements
	@FindBy(id="username")
	private WebElement usernameTF;
	
	@FindBy(id="inputPassword")
	private WebElement passwordTF;
	
	@FindBy(linkText = "Sign In")
	private WebElement signInBtn;

//	Step 3-Create constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

//	Rule 4- Create getter
	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}


	

	
}

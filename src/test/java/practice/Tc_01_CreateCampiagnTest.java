package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ninzaCRM.ObjectRepository.CampaignPage;
import ninzaCRM.ObjectRepository.CreateCampaignsPage;
import ninzaCRM.genericUtilities.BaseClass;

@Listeners(ninzaCRM.genericUtilities.ListenersImplementation.class)
public class Tc_01_CreateCampiagnTest extends BaseClass {
	
	@Test(groups = "SmokeSuite")
	
	public void createContact() throws EncryptedDocumentException, IOException{
		
	//Reading Data
	String CAMPNAME=fUtil.readDataFromExcel("Tc_Data", 10, 2);
	String CAMPTARGET=fUtil.readDataFromExcel("Tc_data", 10,3 );
	
	CampaignPage cp=new CampaignPage(driver);
	cp.clickCreateBtn();
	
	CreateCampaignsPage ccp= new CreateCampaignsPage(driver);
	ccp.createCampaign(CAMPNAME, CAMPTARGET);
	
	}
}

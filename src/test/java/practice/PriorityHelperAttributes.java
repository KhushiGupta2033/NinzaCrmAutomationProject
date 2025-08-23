package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ninzaCRM.genericUtilities.FileUtility;

public class PriorityHelperAttributes {
	
//	@Test(priority=0)
//	public void create() {
//		System.out.println("Create");
//	}
//	
//	@Test(invocationCount =2)
//	public void modify() {
//		System.out.println("Modify");
//	}
//	
//	@Test(enabled = false)
//	public void delete() {
//		System.out.println("Delete");
//	}
//	
//	//dependsOnMethod
//	
//	@Test
//	public void createCustomer() {
////		Assert.fail();
//		System.out.println("Create Cust");
//	}
//	
//	@Test(dependsOnMethods ="createCustomer" )
//	public void modifyCustomer() {
//		System.out.println("Modify Cust");
//	}
//	
//	@Test(dependsOnMethods ={"createCustomer","modifyCustomer"})
//	public void deleteCustomer() {
//		System.out.println("Delete Cust");
//	}
	
	@Test(dataProvider = "customerInfo")
	public void createMultipleData(String name,int id) {
		System.out.println("Name= "+name+ " "+"Id= "+id);
	}

	@DataProvider(name="customerInfo")
	public Object[][] getData() throws EncryptedDocumentException, IOException{
		
//		Object[][] data=new Object[4][2];
//		
//		data[0][0]="Batman";
//		data[0][1]=1;
//		
//		data[1][0]="Aquaman";
//		data[1][1]=2;
//		
//		data[2][0]="Ironman";
//		data[2][1]=3;
//		
//		data[3][0]="Hulk";
//		data[3][1]=4;
//		return data;
		
		FileUtility fUtil=new FileUtility();
		return fUtil.readMultipleData("DataProvider", 5, 1);
	}
}

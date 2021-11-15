package testCaseExecution;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import leafTap_ReusableMethods.LeafTapCommonMethods;
import pages.LeafTap_LoginPage;

public class TC003LeafTap_CreateContact extends LeafTapCommonMethods {
	@BeforeTest
	public void setFileName() {
		// TODO Auto-generated method stub
		excelFileName = "CreateContacts";

	}
	
	
	@Test(dataProvider="readExcel") //readExcel is the method name of retreiving excel data. As we did not provide any name
	//to dataprovider, we can provide the method name directly
	public void verifyCreateContact(String fName, String lName, String dept, String desc, String email) throws InterruptedException {
		// TODO Auto-generated method stub
		LeafTap_LoginPage lp = new LeafTap_LoginPage(driver);
		lp.enterUserName("Demosalesmanager")
		.enterPassword("crmsfa")
		.clickLoginButton()
		.verifyCRMSFALINK()
		.clickCRMSFAtoCreateContact()
		.clickContactsTab()
		.clickCreateContactLink()
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterDepartment(dept)
		.enterDescription(desc)
		.enterEmail(email)
		.clickCreateContactButton();
		

	}

}

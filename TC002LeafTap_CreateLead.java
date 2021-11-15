package testCaseExecution;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import leafTap_ReusableMethods.LeafTapCommonMethods;
import pages.LeafTap_LoginPage;

public class TC002LeafTap_CreateLead extends LeafTapCommonMethods {
	@BeforeTest
	public void setFileName() {
		// TODO Auto-generated method stub
		excelFileName = "CreateLead";

	}
	
	@Test(dataProvider = "readExcel") //readExcel is the method name used for DataProvider
	//We can give like the above only when DataProvider(indices = 0) used in the DataProvider declaration
	//@Test(dataProvider = "createLead")
	public void verifyCreateLead(String compName) throws InterruptedException {
		// TODO Auto-generated method stub
		LeafTap_LoginPage lp = new LeafTap_LoginPage(driver);//Passing driver as an argument for constructor
		lp.enterUserName("Demosalesmanager")
		.enterPassword("crmsfa")
		.clickLoginButton()
		.verifyCRMSFALINK()
		.clickCRMSFALink()
		.clickLeadsTab()
		.clickleadsLink()
		.enterCompName(compName);
	

	}

}

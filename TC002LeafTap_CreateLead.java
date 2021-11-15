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
	public void verifyCreateLead(String compName, String fName, String lName, String source, String mktCamp,
			String fNameLocal, String lNameLocal, String title, String dept, String Industry,
			String ownership, String desc, String impNote, String empCount, String countryCode,
			String areaCode, String phNo, String email, String country, String state, String city,
			String postalCode) throws InterruptedException {
		// TODO Auto-generated method stub
		LeafTap_LoginPage lp = new LeafTap_LoginPage(driver);//Passing driver as an argument for constructor
		lp.enterUserName("Demosalesmanager")
		.enterPassword("crmsfa")
		.clickLoginButton()
		.verifyCRMSFALINK()
		.clickCRMSFALink()
		.clickLeadsTab()
		.clickleadsLink()
		.enterCompName(compName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.selectSource(source)
		.selectMarketingCampaign(mktCamp)
		.enterFirstNameLocal(fNameLocal)
		.enterLastNameLocal(lNameLocal)
		.enterTitle(title)
		.enterDepartment(dept)
		.selectIndustry(Industry)
		.selectOwnership(ownership)
		.enterDescription(desc)
		.enterImportantNote(impNote)
		.enterNumberofEmp(empCount)
		.enterCountryCode(countryCode)
		.enterAreaCode(areaCode)
		.enterPhoneNumber(phNo)
		.enterEmail(email)
		.selectCountry(country)
		.selectState(state)
		.enterCity(city)
		.enterPostalCode(postalCode)
		.clickCreateLeadButton();
		
	}

}

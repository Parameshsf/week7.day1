package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import leafTap_ReusableMethods.LeafTapCommonMethods;

public class LeafTap_CreateLeadPage extends LeafTapCommonMethods {

	// Constructor with ChromeDriver as an argument to perform parallel execution
	public LeafTap_CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;

	}

	public LeafTap_CreateLeadPage clickLeadsTab() throws InterruptedException {

		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(3000);
		return this;

	}

	public LeafTap_CreateLeadPage clickleadsLink() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		return this;

	}

	public LeafTap_CreateLeadPage enterCompName(String compName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
		return this;

	}

	public LeafTap_CreateLeadPage enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;

	}

	public LeafTap_CreateLeadPage enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;

	}

	public LeafTap_CreateLeadPage selectSource(String source) {

		Select sourceDD = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		sourceDD.selectByVisibleText(source);
		return this;

	}

	public LeafTap_CreateLeadPage selectMarketingCampaign(String mktCamp) {
		// TODO Auto-generated method stub
		Select marktCampaign = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		marktCampaign.selectByVisibleText(mktCamp);
		return this;

	}

	public LeafTap_CreateLeadPage enterFirstNameLocal(String fNameLocal) {

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(fNameLocal);

		return this;

	}

	public LeafTap_CreateLeadPage enterLastNameLocal(String lNameLocal) {

		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys(lNameLocal);

		return this;

	}

	public LeafTap_CreateLeadPage enterTitle(String title) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(title);
		return this;
	}

	public LeafTap_CreateLeadPage enterDepartment(String dept) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dept);
		return this;
	}

	public LeafTap_CreateLeadPage selectIndustry(String industry) {
		Select ind = new Select(driver.findElement(By.id("createLeadForm_industryEnumId")));
		ind.selectByVisibleText(industry);

		return this;

	}

	public LeafTap_CreateLeadPage selectOwnership(String ownership) {
		Select ownr = new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		ownr.selectByVisibleText(ownership);

		return this;

	}

	public LeafTap_CreateLeadPage enterDescription(String desc) {
		driver.findElement(By.id("createLeadForm_description")).sendKeys(desc);

		return this;

	}

	public LeafTap_CreateLeadPage enterImportantNote(String impNote) {
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys(impNote);

		return this;

	}

	public LeafTap_CreateLeadPage enterNumberofEmp(String empCount) {
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys(empCount);
		// TODO Auto-generated method stub
		return this;

	}

	public LeafTap_CreateLeadPage enterCountryCode(String countryCode) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys(countryCode);
		return this;

	}

	public LeafTap_CreateLeadPage enterAreaCode(String areaCode) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys(areaCode);
		return this;
	}

	public LeafTap_CreateLeadPage enterPhoneNumber(String phNo) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		return this;
	}

	public LeafTap_CreateLeadPage enterEmail(String email) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
		return this;

	}

	public LeafTap_CreateLeadPage selectCountry(String country) {
		Select nation = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		nation.selectByVisibleText(country);
		return this;

	}

	public LeafTap_CreateLeadPage selectState(String state) throws InterruptedException {
		Thread.sleep(5000);
		Select st = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		st.selectByVisibleText(state);
		return this;

	}

	public LeafTap_CreateLeadPage enterCity(String city) {

		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys(city);
		return this;

	}

	public LeafTap_CreateLeadPage enterPostalCode(String pinCode) {

		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys(pinCode);
		return this;

	}
	
	public LeafTap_CreateLeadPage clickCreateLeadButton() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		return this;

	}

}

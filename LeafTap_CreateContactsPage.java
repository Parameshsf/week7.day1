package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import leafTap_ReusableMethods.LeafTapCommonMethods;

public class LeafTap_CreateContactsPage extends LeafTapCommonMethods {
	
	// Constructor with ChromeDriver as an argument to perform parallel execution
		public LeafTap_CreateContactsPage(ChromeDriver driver) {
			this.driver = driver;

		}
		
		public LeafTap_CreateContactsPage clickContactsTab() throws InterruptedException {
			driver.findElement(By.linkText("Contacts")).click();
			Thread.sleep(3000);
			// TODO Auto-generated method stub
			return this;

		}
		
		public LeafTap_CreateContactsPage clickCreateContactLink() {
			// TODO Auto-generated method stub
			driver.findElement(By.linkText("Create Contact")).click();
			return this;
		}
		
		public LeafTap_CreateContactsPage enterFirstName(String fName) {
			driver.findElement(By.id("firstNameField")).sendKeys(fName);
			return this;
			// TODO Auto-generated method stub

		}
		
		public LeafTap_CreateContactsPage enterLastName(String lName) {
			driver.findElement(By.id("lastNameField")).sendKeys(lName);
			return this;
			// TODO Auto-generated method stub

		}
		
		public LeafTap_CreateContactsPage enterDepartment(String dept) {
			driver.findElement(By.id("createContactForm_departmentName")).sendKeys(dept);
			// TODO Auto-generated method stub
			return this;

		}
		
		public LeafTap_CreateContactsPage enterDescription(String desc) {
			driver.findElement(By.id("createContactForm_description")).sendKeys(desc);
			// TODO Auto-generated method stub
			return this;

		}
		
		public LeafTap_CreateContactsPage enterEmail(String email) {
			// TODO Auto-generated method stub
			driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys(email);
			return this;
		}
		
		public LeafTap_CreateContactsPage clickCreateContactButton() {
			// TODO Auto-generated method stub
			driver.findElement(By.name("submitButton")).click();
			return this;
		}
		
		
		
		
		
		
		

}

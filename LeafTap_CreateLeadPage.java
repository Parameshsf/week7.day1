package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import leafTap_ReusableMethods.LeafTapCommonMethods;

public class LeafTap_CreateLeadPage extends LeafTapCommonMethods {
	
	//Constructor with ChromeDriver as an argument to perform parallel execution
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

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import leafTap_ReusableMethods.LeafTapCommonMethods;

public class LeafTap_HomePage extends LeafTapCommonMethods {
	
	//Constructor with ChromeDriver as an argument to perform parallel execution
	public LeafTap_HomePage(ChromeDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	public LeafTap_HomePage verifyCRMSFALINK() {
		// TODO Auto-generated method stub
		boolean enabled = driver.findElement(By.linkText("CRM/SFA")).isEnabled();
		Assert.assertTrue(enabled);
		return this;

	}
	
	public LeafTap_CreateLeadPage clickCRMSFALink() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("CRMSFA link clicked");
		return new LeafTap_CreateLeadPage(driver);

	}

}

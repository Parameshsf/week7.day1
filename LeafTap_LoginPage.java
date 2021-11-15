package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import leafTap_ReusableMethods.LeafTapCommonMethods;

public class LeafTap_LoginPage extends LeafTapCommonMethods {
	
	//Constructor with ChromeDriver as an argument to perform parallel execution
	public LeafTap_LoginPage(ChromeDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
		
	public LeafTap_LoginPage enterUserName(String uName) {
		// TODO Auto-generated method stub
		System.out.println("User Name: "+uName);
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;

	}
	
	public LeafTap_LoginPage enterPassword(String pwd) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;

	}
	
	public LeafTap_LoginPage clickLogin() {
		// TODO Auto-generated method stub
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}
	
	public LeafTap_HomePage clickLoginButton() {
		// TODO Auto-generated method stub
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LeafTap_HomePage(driver);
		

	}

}

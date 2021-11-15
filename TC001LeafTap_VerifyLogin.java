package testCaseExecution;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import leafTap_ReusableMethods.LeafTapCommonMethods;
import pages.LeafTap_LoginPage;

public class TC001LeafTap_VerifyLogin extends LeafTapCommonMethods {
	
	@Parameters({"userName","password"})
	@Test
	public void verifyLeafTapLogin(String userName, String password) {
		// TODO Auto-generated method stub
		LeafTap_LoginPage lp = new LeafTap_LoginPage(driver);//Passing driver as an argument for constructor
		lp.enterUserName(userName)
		.enterPassword(password)
		.clickLoginButton();
		
	}
	
	

}

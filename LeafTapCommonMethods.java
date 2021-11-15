package leafTap_ReusableMethods;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadDataFromExcel;

public class LeafTapCommonMethods {

	
	public ChromeDriver driver;
	public String excelFileName;

	@BeforeMethod
	public void preCondition() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();// to maximize the window opened
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// Make the browser wait for 20 seconds to
																			// load all web elements

	}

	@AfterMethod
	public void postCondition() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		driver.close();

	}

	// Read data from excel

	
	//@DataProvider(indices = 0) //this is the read ONLY the first row of data from the excel sheet
	//@DataProvider(name = "createLead")
	@DataProvider //This is the default declaration and this will read all the data
	public String[][] readExcel() throws IOException { // TODO Auto-generated method stub String[][] data =
		
		return ReadDataFromExcel.readDataFromExcel(excelFileName);
		

	}

}

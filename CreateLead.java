package Week5.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends LoginAndClose {
	
	@DataProvider(name = "Data")
	public String[][] getData() {
		String[][] data = new String[2][3];
		
		data[0][0] = "WhiteHouse";
		data[0][1] = "Donald";
		data[0][2] = "Trump";
		
		data[1][0] = "WhiteHouse";
		data[1][1] = "Joe";
		data[1][2] = "Biden";
		
	return 	data;
	}
	
		
	
	@Test(dataProvider = "Data", invocationCount = 2)
	public void createLead(String cName, String fName, String lName) {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
		
}
}







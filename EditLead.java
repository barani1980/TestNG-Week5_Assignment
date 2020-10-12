package Week5.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends LoginAndClose {
	
	@DataProvider(name = "Data2")
	public String[][] elData() {
		
		String[][] el = new String[1][2];
		el[0][0] = "9";
		el[0][1] = "TCS";
		return el;
	}
	
	
	@Test(dataProvider = "Data2")
	public void editLead(String ph, String comp) throws InterruptedException {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(ph);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys(comp);
		driver.findElementByName("submitButton").click();
		
	}
}







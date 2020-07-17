package SeleniumAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.loginPage;
import resources.base;

public class loginPageTest extends base{
	
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void setup() throws IOException {

		driver = intializeBrowser();
		driver.get(prop.getProperty("url"));
        log.info("Invoked the Browser");
	}


	@Test
	public void selectOrganization() throws InterruptedException{
		
		loginPage login = new loginPage(driver);
		login.CILogin();
		log.info("Select the CSU and have clicked Next");
	}

	@AfterTest
	public void Teardown() {

		driver.quit();
		driver=null;
       log.info("Closed the Browser");
	}

}

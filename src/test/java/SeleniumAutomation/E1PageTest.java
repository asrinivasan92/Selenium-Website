package SeleniumAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.E1Page;
import pageObject.loginPage;
import resources.base;

public class E1PageTest extends base {
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void setup() throws IOException {
		
		driver = intializeBrowser();
		driver.get(prop.getProperty("url"));
		log.info("Invoked the Browser");
	}


	@Test
	public void E1YesPath() throws InterruptedException {
		loginPage login = new loginPage(driver);
		login.CILogin();
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement(By.id("ciiframe")));
		E1Page E1= new E1Page(driver); 
		E1.Yes();
		E1.Nextbutton();
		E1.DegreeLevel();
		E1.Nextbutton();
		log.info("E1 page clicked");
	}

	@AfterTest
	public void Teardown() {

		driver.quit();
		driver=null;
		log.info("Closed the Browser");
	}

}

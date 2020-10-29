package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import resources.base;

public class loginPage extends base {

	public WebDriver driver;

	//POM Elements
	@FindBy(xpath="//div[@class='well surveyStart']/div/select")
	WebElement login;
	@FindBy(id="btn-get_started")
	WebElement startbutton;


	//Initializing POM
	public loginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Methods
	public void CILogin() throws InterruptedException {

		Select dropdown = new Select(login);
		dropdown.selectByValue("3631f28");
		Thread.sleep(5000);
		startbutton.click();

	}
}

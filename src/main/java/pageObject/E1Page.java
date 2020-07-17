package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.base;

public class E1Page extends base {

	public WebDriver driver;

	//Elements 
	@FindBy(xpath="//*[@id=\"path-selector\"]/div/div/ol/li[1]")
	WebElement YesPath;
	@FindBy(id="buttonNext")
	WebElement Next;
	@FindBy(xpath="//*[@id=\"educationQuestion\"]/div/div/div/ol/li[3]")
	WebElement Degree;

	//Initialize POM
	public E1Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


	public void Yes() {

		YesPath.click();

	}

    public void Nextbutton() {

		Next.click();

	}
	public void DegreeLevel() {

		Degree.click();

	}

}

package testing.demo.tamut.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComputerScience {
	WebDriver driver;
	
	@FindBy (linkText = "Computer Science - Texas A&M Texarkana")
	private WebElement compSciLink;
	
	public void clickFirstLink() {	
		compSciLink.click();
		}
	
	@FindBy (linkText = "Accreditation")
	private WebElement AccreditationLink;
	
	@FindBy (linkText = "Faculty")
	private WebElement FacultyLink;
	
	@FindBy (linkText = "Apply")
	private WebElement ApplyHereLink;
	
	@FindBy (linkText = "Visit Us")
	private WebElement VisitUsLink;
	
	@FindBy(linkText = "Visit Us")
	private WebElement visitUsItem;
	
	@FindBy(xpath = "//a[@title = 'About TAMUT']")
	private WebElement aboutMenu;
	
	
	public ComputerScience(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAccreditationLink() {
		return AccreditationLink;
	}
	
	public WebElement getFacultyLink() {
		return FacultyLink;
	}
	
	public WebElement getApplyHereLink() {
		return ApplyHereLink;
	}
	public WebElement getVisitUsLink() {
		return VisitUsLink;
	}
	public void hoverOverAbout() {
		Actions actions = new Actions(driver);
		actions.moveToElement(aboutMenu).perform();
	}
	public void clickVisitUs() {
		visitUsItem.click();
	}
	
}

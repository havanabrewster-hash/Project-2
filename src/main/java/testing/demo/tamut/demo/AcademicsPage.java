package testing.demo.tamut.demo;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcademicsPage {
	WebDriver driver;
	
	@FindBy (xpath = "//a[@href='computer-science/index.html' and text()='Learn More']")
	private WebElement compSciLink;
	
	
	@FindBy (linkText = "Undergraduate Programs")
	private WebElement UnderGradLink;
	
	@FindBy (linkText = "Graduate Programs")
	private WebElement GradLink;
	
	@FindBy (linkText = "Doctorate Program")
	private WebElement DoctorateLink;
	
	@FindBy (linkText = "Online Programs")
	private WebElement OnlineProgramLink;

	
	public AcademicsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUnderGradLink() {
		return UnderGradLink;
	}
	
	public WebElement getGradLink() {
		return GradLink;
	}
	
	public WebElement getDoctorateLink() {
		return DoctorateLink;
	}
	public WebElement getOnlineProgramLink() {
		return OnlineProgramLink;
	}
	
	public void clickCompSci() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement elementToClick = wait.until(ExpectedConditions.elementToBeClickable(compSciLink));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", compSciLink);
        elementToClick.click();
	}
}

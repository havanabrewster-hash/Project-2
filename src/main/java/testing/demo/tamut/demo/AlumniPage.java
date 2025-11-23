package testing.demo.tamut.demo;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlumniPage {
	WebDriver driver;
	
	@FindBy (linkText = "Women for A&M-Texarkana")
	private WebElement womenLink;
	
	
	@FindBy (linkText = "Order Alumni Brick")
	private WebElement orderBrickLink;
	
	@FindBy (linkText = "Join the Alumni Association")
	private WebElement joinAlumLink;
	
	@FindBy (linkText = "Update Alumni Information")
	private WebElement updateAlumLink;
	
	public AlumniPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getOrderBrickLink() {
		return orderBrickLink;
	}
	
	public WebElement getJoinAlumLink() {
		return joinAlumLink;
	}
	
	public WebElement getUpdateAlumLink() {
		return updateAlumLink;
	}
	public WebElement getWomenLink() {
		return womenLink;
	}
	
	public void clickWomenLink() {
	    womenLink.click();
	}
}

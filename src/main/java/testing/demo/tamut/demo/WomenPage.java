package testing.demo.tamut.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {
	WebDriver driver;
	
	@FindBy (linkText = "Women for A&M-Texarkana")
	private WebElement WomensLink;

	public void clickFirstLink() {	
		WomensLink.click();
		}

	@FindBy (linkText = "Make a Scholarship Donation")
	private WebElement scholarshipLink;
	
	@FindBy (linkText = "Join Women for A&M-Texarkana")
	private WebElement joinWomenLink;
	
	@FindBy (linkText = "Join Women for A&M-Texarkana")
	private WebElement womenforAMLink;
	
	public WomenPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getScholarshipLink() {
		return scholarshipLink;
	}
	
	public WebElement getJoinWomenLink() {
		return joinWomenLink;
	}
	
	public WebElement getWomenforAMLink() {
		return womenforAMLink;
	}
}

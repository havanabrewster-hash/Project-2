package testing.demo.tamut.demo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	private WebDriver driver;
	private final String URL = "https://tamut.edu";
	
	@FindBy(id = "searchBox")
	private WebElement searchBox;
	
	@FindBy(xpath = "//a[@title = 'About TAMUT']")
	private WebElement aboutMenu;
	
	@FindBy(linkText = "Visit Us")
	private WebElement visitUsItem;
	
	@FindBy(linkText = "Academics")
	private WebElement academicsItem;
	
	@FindBy(linkText = "Alumni & Friends")
	private WebElement alumniItem;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void open() {
		driver.get(URL);
	}
	public void sendKeys2SearchBox(String searchInput) {
		searchBox.sendKeys(searchInput + Keys.ENTER);
	}
	public void hoverOverAbout() {
		Actions actions = new Actions(driver);
		actions.moveToElement(aboutMenu).perform();
	}
	public void clickVisitUs() {
		visitUsItem.click();
	}
	public void quit() {
		driver.quit();
	}
	public void clickAcademics() {
		academicsItem.click();
	}
	public void clickAlumni() {
		alumniItem.click();
	}
}

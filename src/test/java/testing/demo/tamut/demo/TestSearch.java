package testing.demo.tamut.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSearch {
	WebDriver driver;
	private MainPage mainPage;
	@BeforeClass
	public void setupClass() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	}

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		mainPage = new MainPage(driver);
		mainPage.open();
	}

	@Test
	public void testSearchCS() {
		mainPage.sendKeys2SearchBox("ComputerScience");
		
		WebElement csHyberLink = driver.findElement(By.xpath("//a[contains(@href, 'computer-science')]"));

		assertTrue(csHyberLink.isDisplayed());
	}
	@AfterClass
	public void tearDownClass() {
		driver.quit();
	}
}

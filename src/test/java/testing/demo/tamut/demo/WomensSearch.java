package testing.demo.tamut.demo;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomensSearch {
	WebDriver driver;
	private MainPage mainPage;
	@BeforeClass
	public void setupClass() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		mainPage = new MainPage(driver);
		mainPage.open();
	}

	@Test (priority =1)
	public void testSearchWomen() {
		mainPage.sendKeys2SearchBox("Women");
		WebElement csHyberLink = driver.findElement(By.linkText("Women for A&M-Texarkana"));
		assertTrue(csHyberLink.isDisplayed());
		WomenPage womenPage = new WomenPage(driver);
		womenPage.clickFirstLink();
	}
	
	@Test (priority =2 )
	public void testJoinWomenLink() {
		WomenPage womenPage = new WomenPage(driver);
		assertTrue(womenPage.getJoinWomenLink().isDisplayed());
	}
	
	@Test (priority =3)
	public void testWomenforAMLink() {
		WomenPage womenPage = new WomenPage(driver);
		assertTrue(womenPage.getWomenforAMLink().isDisplayed());
	}
	
	@AfterClass
	public void tearDownClass() {
		driver.quit();
		System.out.println("Test Case 4 completed.");
	}
}

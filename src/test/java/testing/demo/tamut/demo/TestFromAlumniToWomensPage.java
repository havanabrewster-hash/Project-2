package testing.demo.tamut.demo;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFromAlumniToWomensPage {
	WebDriver driver;
	private MainPage mainPage;

	@BeforeClass
	public void setupClass() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		mainPage = new MainPage(driver);
		mainPage.open();
		mainPage.clickAlumni();
		AlumniPage alumniPage = new AlumniPage(driver);
	}
	
	@Test (priority = 1)
	public void testOrderBrickLink() {
		AlumniPage alumniPage = new AlumniPage(driver);
		assertTrue(alumniPage.getOrderBrickLink().isDisplayed());
	}
	
	@Test (priority = 2)
	public void testJoinAlumniLink() {
		AlumniPage alumniPage = new AlumniPage(driver);
		assertTrue(alumniPage.getJoinAlumLink().isDisplayed());
	}
	
	@Test (priority = 3)
	public void testUpdateAlumniLink() {
		AlumniPage alumniPage = new AlumniPage(driver);
		assertTrue(alumniPage.getUpdateAlumLink().isDisplayed());
	}
	
	@Test (priority =4)
	public void testSearchWomen() {
		WebElement csHyberLink = driver.findElement(By.linkText("Women for A&M-Texarkana"));
		assertTrue(csHyberLink.isDisplayed());
		AlumniPage alumniPage = new AlumniPage(driver);
		alumniPage.clickWomenLink();
	}
	
	@Test (priority = 5)
	public void testJoinWomenLink() {
		WomenPage womenPage = new WomenPage(driver);
		assertTrue(womenPage.getJoinWomenLink().isDisplayed());
	}
	
	@Test (priority =6)
	public void testWomenforAMLink() {
		WomenPage womenPage = new WomenPage(driver);
		assertTrue(womenPage.getWomenforAMLink().isDisplayed());
	}
	
	@Test (priority = 7)
	public void testVisitUsTitle() {
		WomenPage womenPage = new WomenPage(driver);
		String actualTitle= driver.getTitle();
		String expectedSubString = "Women for A&M-Texarkana";
		assertTrue(actualTitle.contains(expectedSubString));
	}
	
	@AfterClass
	public void tearDownClass() {
		driver.quit();
		System.out.println("Test Case 1 completed.");
	}
}

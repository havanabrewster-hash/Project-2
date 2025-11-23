package testing.demo.tamut.demo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test; 

public class TestVisitUsPage {
	WebDriver driver;
	private MainPage mainPage;

	@BeforeClass
	public void setupClass() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		mainPage = new MainPage(driver);
		mainPage.open();
		mainPage.hoverOverAbout();
		mainPage.clickVisitUs();
	}
	
	@Test
	public void testVisitUsUpcomingEVents() {
		VisitUsPage visitUsPage = new VisitUsPage(driver);
		assertTrue(visitUsPage.getUpcomingEventsLink().isDisplayed());
	}
	
	@Test
	public void testVisitUsScheduleATour() {
		VisitUsPage visitUsPage = new VisitUsPage(driver);
		assertTrue(visitUsPage.getcampusTourLink().isDisplayed());
	}

	@Test
	public void testVisitUsVirtualTour() {
		VisitUsPage visitUsPage = new VisitUsPage(driver);
		assertTrue(visitUsPage.getvirtualTourLink().isDisplayed());
	}

	@Test
	public void testVisitUsTitle() {
		VisitUsPage visitUsPage = new VisitUsPage(driver);
		String actualTitle= driver.getTitle();
		String expectedTitle = "Texas A&M Texarkana | Visit Us!";
		assertTrue(actualTitle.equals(expectedTitle));
	}
	
	@AfterClass
	public void tearDownClass() {
		driver.quit();
		System.out.println("Test Case 1 completed.");
	}
	
}

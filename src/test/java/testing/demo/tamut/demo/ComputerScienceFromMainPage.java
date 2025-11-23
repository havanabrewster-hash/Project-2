package testing.demo.tamut.demo;

import static org.testng.Assert.assertTrue;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ComputerScienceFromMainPage {
	WebDriver driver;
	private MainPage mainPage;

	@BeforeClass
	public void setupClass() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		mainPage = new MainPage(driver);
		mainPage.open();
		mainPage.clickAcademics();
	}
	
	@Test (priority = 1)
	public void testUnderGradProgram() {
		AcademicsPage academicsPage = new AcademicsPage(driver);
		assertTrue(academicsPage.getUnderGradLink().isDisplayed());
	}
	
	@Test (priority = 2)
	public void testGradProgram() {
		AcademicsPage academicsPage = new AcademicsPage(driver);
		assertTrue(academicsPage.getGradLink().isDisplayed());
	}
	
	@Test(priority = 3)
	public void testDoctorateProgram() {
		AcademicsPage academicsPage = new AcademicsPage(driver);
		assertTrue(academicsPage.getDoctorateLink().isDisplayed());
	}
	
	@Test (priority = 4)
	public void testOnlineProgram() {
		AcademicsPage academicsPage = new AcademicsPage(driver);
		assertTrue(academicsPage.getOnlineProgramLink().isDisplayed());
		
	}
	
	
	@Test (priority = 5)
	public void testAccreditation() {
		AcademicsPage academicsPage = new AcademicsPage(driver);
		academicsPage.clickCompSci();
		ComputerScience computerScience = new ComputerScience(driver);
		assertTrue(computerScience.getAccreditationLink().isDisplayed());
	}
	
	@Test (priority = 6)
	public void testFaculty() {
		ComputerScience computerScience = new ComputerScience(driver);
		assertTrue(computerScience.getFacultyLink().isDisplayed());
	}
	
	@Test (priority = 7)
	public void testApplyHere() {
		ComputerScience computerScience = new ComputerScience(driver);
		assertTrue(computerScience.getApplyHereLink().isDisplayed());
	}
	
	@Test (priority = 8)
	public void testVisitUs() {
		ComputerScience computerScience = new ComputerScience(driver);
		assertTrue(computerScience.getVisitUsLink().isDisplayed());
		computerScience.hoverOverAbout();
		computerScience.clickVisitUs();
	}
	
	@Test (priority = 9)
	public void testVisitUsUpcomingEVents() {
		VisitUsPage visitUsPage = new VisitUsPage(driver);
		assertTrue(visitUsPage.getUpcomingEventsLink().isDisplayed());
	}
	
	@Test (priority = 10)
	public void testVisitUsScheduleATour() {
		VisitUsPage visitUsPage = new VisitUsPage(driver);
		assertTrue(visitUsPage.getcampusTourLink().isDisplayed());
	}

	@Test (priority = 11)
	public void testVisitUsVirtualTour() {
		VisitUsPage visitUsPage = new VisitUsPage(driver);
		assertTrue(visitUsPage.getvirtualTourLink().isDisplayed());
	}

	@Test (priority = 12)
	public void testVisitUsTitle() {
		String actualTitle= driver.getTitle();
		String expectedTitle = "Texas A&M Texarkana | Visit Us!";
		assertTrue(actualTitle.equals(expectedTitle));
	}
	
	@AfterClass
	public void tearDownClass() {
		driver.quit();
		System.out.println("Test Case 3 completed.");
	}
}

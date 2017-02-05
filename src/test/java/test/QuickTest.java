

package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class QuickTest {
	
WebDriver driver;


@BeforeTest
public void set() {
	driver =new FirefoxDriver();
	driver.get("http://www.demoaut.com");
}
@Test (priority =0)
public void testLunch(){
	launch goLaunch = PageFactory.initElements(driver, launch.class);
	 String GetTitle = goLaunch.getTitle();
	 Assert.assertTrue(GetTitle.contains("Welcome: "));
}
@Test(priority =1)
public void testPage1() {
	
	goRegister registerForm =PageFactory.initElements(driver, goRegister.class);
	registerForm.AllRegisterApp("Shahadat", "Hossain", "3478632195", "abc123@bd.com", "1 Ave a", "Apt 3", "Brooklyn","New York","11218","UNITED STATES","abc123", "Password1", "Password1");

	String VerifyRegisterForm = registerForm.VerifyConfirmRegister();
	Assert.assertTrue(VerifyRegisterForm.contains("Thank you for registering."));
}
@Test (priority= 3)
public void testSignin ()	 {
	 	 
	
	 SignOn goSignOn= PageFactory.initElements(driver, SignOn.class);
	 goSignOn.SignIn_AllMethods("mercury", "mercury");
	
	 String VerifyLoggedInPage = goSignOn.LoginVerify();
	 Assert.assertTrue(VerifyLoggedInPage.contains("SIGN-OFF"));
}

@Test (priority =4)
public void testBookFlight () {
	BookAticket goBookAticket =PageFactory.initElements(driver, BookAticket.class);
	goBookAticket.setAllFlightFinder();
	goBookAticket.setAllSelectFlight();
	goBookAticket.setAllBookAflight("Shahadat", "Hossain", "123456789123456", "Shahadat", "H", "Hossain");
	
	String VerifyBookConfirmationx = goBookAticket.getVersion();
	Assert.assertTrue(VerifyBookConfirmationx.contains("(v."));
	String verifyFlightConfirmation = goBookAticket.getFlightConfirmation();
	Assert.assertTrue(verifyFlightConfirmation.contains("Your itinerary"));
}
@Test (priority=5)
public void testSupport () {
	Support goSupport =PageFactory.initElements(driver, Support.class);
	goSupport.ClickSupport();
	String verifyVersion = goSupport.getVersion();
	System.out.println("Current web applicatin version is :" + verifyVersion);
	Assert.assertTrue(verifyVersion.contains("(v."));

}
@Test (priority=6)
public void testContact () {
	Contact goContact =PageFactory.initElements(driver, Contact.class);
	goContact.ClickContact();
	String verifyVersion = goContact.getVersion();
	System.out.println("Current web applicatin version is :" + verifyVersion);
	Assert.assertTrue(verifyVersion.contains("(v."));

}

@Test (priority=2)
public void testHome () {
	Home goHome =PageFactory.initElements(driver, Home.class);
	goHome.ClickHome();
	String verifyVersion = goHome.getVersion();
	System.out.println("Current web applicatin version is :" + verifyVersion);
	Assert.assertTrue(verifyVersion.contains("(v."));

}
@Test (priority=7)
public void testHotels () {
	Hotels goHotels =PageFactory.initElements(driver, Hotels.class);
	goHotels.ClickHotels();
	String verifyVersion = goHotels.getVersion();
	System.out.println("Current web applicatin version is :" + verifyVersion);
	Assert.assertTrue(verifyVersion.contains("(v."));

}
@Test (priority=8)
public void testCarRentals () {
	CarRentals goCarRentals =PageFactory.initElements(driver, CarRentals.class);
	goCarRentals.ClickCarRentals();
	String verifyVersion = goCarRentals.getVersion();
	System.out.println("Current web applicatin version is :" + verifyVersion);
	Assert.assertTrue(verifyVersion.contains("(v."));
}
@Test (priority=9)
public void testCruises () {
	Cruises goCruises =PageFactory.initElements(driver, Cruises.class);
	goCruises.ClickCruises();
	goCruises.clickCruisesReservation();
	
//	String verifyCruises = goCruises.getCruisesReservation();
//	Assert.assertTrue(verifyCruises.contains("Cruise Itinerary"));
	goCruises.clickItinerary();
	goCruises.clickCancelTicket();

	String verifyItinararyPage = goCruises.getVersion();
	Assert.assertTrue(verifyItinararyPage.contains("(v."));
	
	
}
@Test (priority=10)
public void testDestinations () {
	Destinations goDestinations =PageFactory.initElements(driver, Destinations.class);
	goDestinations.ClickDestinations();
	String verifyVersion = goDestinations.getVersion();
	System.out.println("I am before last Case 10 YAY!");
	System.out.println("Current web applicatin version is :" + verifyVersion);
	Assert.assertTrue(verifyVersion.contains("(v."));

}
@Test (priority=11)
public void testVacations () {
	Vacations goVacations =PageFactory.initElements(driver, Vacations.class);
	goVacations.ClickVacations();
	String verifyVersion = goVacations.getVersion();
	System.out.println("I am last Case YAY!");
	System.out.println("Current web applicatin version is :" + verifyVersion);
	Assert.assertTrue(verifyVersion.contains("(v."));

}



}



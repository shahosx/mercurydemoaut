package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Cruises {
WebDriver driver;

//constructor 
public Cruises(WebDriver driver) { 
	this.driver = driver;
	PageFactory.initElements(driver, this); 
}

@FindBy (how=How.XPATH, using= "//a[text()='Cruises']")
WebElement Cruises;
@FindBy(how=How.XPATH, using= "//*[@alt='Reservations Open']")
WebElement CruisesReservation;
@FindBy(how=How.XPATH, using= "//span[contains(text(),'Cruise Itinerary')]")
WebElement CruisesReservationVerify;

@FindBy(how=How.XPATH, using= "//a[@href='mercuryitinerary.php']")
WebElement Itinerary;

@FindBy(how=How.XPATH, using= "//area[@href='mercurywelcome.php']")
WebElement CancelTicket;

@FindBy (how=How.XPATH, using= "//*[contains(text(),'(v.')]")
WebElement version;





public void ClickCruises (){
	Cruises.click();
}
public void clickCruisesReservation () {
	CruisesReservation.click();
}
public void clickItinerary () {
	Itinerary.click();
}

public void clickCancelTicket () {
	CancelTicket.click();
}

public void AllCruises() {
	this.ClickCruises();
	this.clickCruisesReservation();
	this.clickItinerary();
	this.clickCancelTicket();
}

public String getVersion() {
	 return version.getText();
}

public String getCruisesReservation () {
	return CruisesReservationVerify.getText();
}

}

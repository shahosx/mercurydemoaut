package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckFlight {

WebDriver driver;

//constructor 
public CheckFlight(WebDriver driver) { 
	this.driver = driver;
	PageFactory.initElements(driver, this); 
}


	@FindBy(how=How.XPATH, using= "//a[contains(text(),'ITINERARY')]")
	WebElement ITINERARY;
	@FindBy(how=How.XPATH, using= "//area[@href='mercurywelcome.php']")
	WebElement CancelReservation;
	
	public void clickItinerary () {
		ITINERARY.click();
	}

	public void clickCancelReservations () {
		CancelReservation.click();
	}

	
	
}

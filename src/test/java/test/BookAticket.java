package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookAticket {
WebDriver driver;

//constructor 
public BookAticket(WebDriver driver) { 
	this.driver = driver;
	PageFactory.initElements(driver, this); 
}

@FindBy(how=How.XPATH, using= "//input[@value='roundtrip']")
WebElement Type;
@FindBy(how=How.XPATH, using= "//select[@name='passCount']/option[2]")
WebElement Passengers;
@FindBy(how=How.XPATH, using= "//select[@name='fromPort']//option/following::*[contains(text(),'New York')]")
WebElement DepartingFrom;
@FindBy(how=How.XPATH, using= "//select[@name='fromMonth']/option[11]")
WebElement LeavingMonth;
@FindBy(how=How.XPATH, using= "//select[@name='fromDay']/option[1]")
WebElement LeavingDay;
@FindBy(how=How.XPATH, using= "//select[@name='toPort']/option//following::*[@value='London']")
WebElement ArrivingIn;
@FindBy(how=How.XPATH, using= "//select[@name='toMonth']/option[11]")
WebElement ArrivingMonth;
@FindBy(how=How.XPATH, using= "//select[@name='toDay']/option[1]")
WebElement ArrivingDay;
@FindBy(how=How.XPATH, using= "//*[contains(text(),'Economy class')]")
WebElement ServiceClass;
@FindBy(how=How.XPATH, using= "//select[@name='airline']/option//following::*[text()='Blue Skies Airlines']")
WebElement Airplane;
@FindBy(how=How.XPATH, using= "//input[@name='findFlights']")
WebElement	FindFlights;

//Methods Flight Finder
public void setType() {
	Type.click();
}
public void setPassengers() {
	Passengers.click();
}
public void setDepartingFrom() {
	DepartingFrom.click();
}
public void setLeavingMonth() {
	LeavingMonth.click();
}
public void setLeavingDay() {
	LeavingDay.click();
}
public void setArrivingIn() {
	ArrivingIn.click();
}
public void setServiceClass() {
	ServiceClass.click();
}
public void setAirplane() {
	Airplane.click();
}
public void setFindFlights() {
	FindFlights.click();
}

public void setAllFlightFinder () {
	this.setType();
	this.setPassengers();
	this.setDepartingFrom();
	this.setLeavingMonth();
	this.setLeavingDay();
	this.setArrivingIn();
	this.setServiceClass();
	this.setAirplane();
	this.setFindFlights();
}



//####### Choose Flight################

@FindBy(how=How.XPATH, using= "//input[@name='outFlight']//following::*[contains(text(),'Blue Skies Airlines 360')]")
WebElement DepartFlight;

@FindBy(how=How.XPATH, using="//input[@name='inFlight']//following::*[contains(text(),'Blue Skies Airlines 630')]")
WebElement ReturnFlight;

@FindBy (how=How.XPATH,using="//input[@name='reserveFlights']")
WebElement ReserveFlight;

public void setDepartFlight() {
	DepartFlight.click();
}
public void setReturnFLight() {
	ReturnFlight.click();
}
public void setReserveFlight() {
	ReserveFlight.click();
}

public void setAllSelectFlight() {
	this.setDepartFlight();
	this.setReturnFLight();
	this.setReserveFlight();
}
// ######## Book A Flight###########

@FindBy(how=How.XPATH, using= "//input[@name='passFirst0']")
WebElement	PassFirst;
@FindBy(how=How.XPATH, using= "//input[@name='passLast0']")
WebElement	PassLast;
@FindBy(how=How.XPATH, using= "//select[@name='pass.0.meal']/option[9]")
WebElement	Meal;
//
@FindBy(how=How.XPATH, using= "//select[@name='creditCard']/option[1]")
WebElement	CardType;
@FindBy(how=How.XPATH, using= "//input[@name='creditnumber']")
WebElement	CardNumber;
@FindBy(how=How.XPATH, using= "//select[@name='cc_exp_dt_mn']/option[2]")
WebElement	ExpMonth;
@FindBy(how=How.XPATH, using= "//select[@name='cc_exp_dt_yr']/option[2]")
WebElement	ExpYear;
@FindBy(how=How.XPATH, using= "//input[@name='cc_frst_name']")
WebElement	CardFname;
@FindBy(how=How.XPATH, using= "//input[@name='cc_mid_name']")
WebElement	CardMname;
@FindBy(how=How.XPATH, using= "//input[@name='cc_last_name']")
WebElement	CardLname;
@FindBy(how=How.XPATH, using= "//font[contains(text(),'Same as Billing Address')]")
WebElement	SameAsBillingAddress;
@FindBy(how=How.XPATH, using= "//input[@name='buyFlights']")
WebElement	BuyFlights;
//#######Confirm Page########
@FindBy(how=How.XPATH, using= " //*[@size='+1']")//"//*[contains(text(),'Flight Confirmation')]")
WebElement	FlightConfirmation;
@FindBy(how=How.XPATH, using= "//*[contains(text(),'SIGN-OFF')]")
WebElement	SignOff;

public void setPassFirst(String strPassFirst) {
	PassFirst.sendKeys(strPassFirst);
}
public void setPassLast(String strPassLast) {
	PassLast.sendKeys(strPassLast);
}
public void setMeal() {
	Meal.click();
}
public void setCardType() {
	CardType.click();
}
public void setCardNumber(String strCardNumber) {
	CardNumber.sendKeys(strCardNumber);
}
public void setExpMonth() {
	ExpMonth.click();
}
public void setExpYear() {
	ExpYear.click();
}
public void setCardFname(String strCardFname) {
	CardFname.sendKeys(strCardFname);
}
public void setCardMname(String strCardMname) {
	CardMname.sendKeys(strCardMname);
}
public void setCardLname(String strCardLname) {
	CardLname.sendKeys(strCardLname);
}
public void setSameAsBillingAddress() {
	SameAsBillingAddress.click();
}
public void setBuyFlights() {
	BuyFlights.click();
}

// verfication
@FindBy (how=How.XPATH, using= "//*[contains(text(),'(v.')]")
WebElement version;

public String getVersion() {
 return version.getText();
 
}



//
public String getFlightConfirmation() {
	return FlightConfirmation.getText();
}


public void setSignOff() {
	SignOff.click();
}

public void setAllBookAflight(String strPassFirst, String strPassLast, String strCardNumber,
		String strCardFname, String strCardMname, String strCardLname) {
this.setPassFirst(strPassFirst);
this.setPassLast(strPassLast);
this.setMeal();
this.setCardType();
this.setCardNumber(strCardNumber);
this.setExpMonth();
this.setExpYear();
this.setCardFname(strCardFname);
this.setCardMname(strCardMname);
this.setCardLname(strCardLname);
this.setSameAsBillingAddress();
this.setBuyFlights();

 }
}



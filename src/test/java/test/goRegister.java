package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class goRegister {
WebDriver driver; 
	
	// Constructor

	//Locator
@FindBy (xpath="//a[contains(text(),'REGISTER')]")
WebElement RegisterForm;
@FindBy (xpath="//input[@name='firstName']")
WebElement fName;
@FindBy (xpath="//input[@name='lastName']")
WebElement Lname;
@FindBy (xpath="//input[@name='phone']")
WebElement Phone;
@FindBy (xpath="//input[@id='userName']")
WebElement UserName;

@FindBy (xpath="//input[@name='address1']")
WebElement Address1;

@FindBy (xpath="//input[@name='address2']")
WebElement Address2;
@FindBy (xpath="//input[@name='city']")
WebElement City;

@FindBy (xpath="//input[@name='state']")
WebElement State;
@FindBy (xpath="//input[@name='postalCode']")
WebElement postalCode;
@FindBy (xpath="//select[@name='country']/option//following::*[contains(text(),'UNITED STATES')]")
WebElement Country;

@FindBy (xpath="//input[@id='email']")
WebElement EmailId;
@FindBy (xpath="//input[@name='password']")
WebElement PasswordId;
@FindBy (xpath="//input[@name='confirmPassword']")
WebElement PasswordIdConfirm;

@FindBy (xpath="//input[@name='register']")
WebElement RegisterSubmitBtn;	

@FindBy (xpath="//font[contains(text(),'Thank you')]")
WebElement verifyConfirmRegistered;

public goRegister (WebDriver driver) {
	this.driver = driver; 
}	

public void newRegister () {
	this.RegisterForm.click();
}
public void setfName ( String strfname) {
	this.fName.sendKeys(strfname);
}
public void setLname ( String strlName) {
	Lname.sendKeys(strlName);
}
public void setPhone ( String strPhone) {
	Phone.sendKeys(strPhone);
}
public void setUserName ( String strEmail) {
	UserName.sendKeys(strEmail);
}
public void setAddress1 ( String strAddress1) {
	Address1.sendKeys(strAddress1);
}
public void setAddress2 ( String strAddress2) {
	Address2.sendKeys(strAddress2);
}
public void setCity ( String strCity) {
	City.sendKeys(strCity);
}
public void setState ( String strState) {
	State.sendKeys(strState);
}
public void setPostalCode ( String strPostalCode) {
	postalCode.sendKeys(strPostalCode);
}
public void setCountry ( String strCountry) {
	Country.sendKeys(strCountry);
}
public void setEmailId ( String strEmailId) {
	EmailId.sendKeys(strEmailId);
}
public void setPassword ( String strPasswordId) {
	PasswordId.sendKeys(strPasswordId);
}
public void setPasswordIdConfirm ( String strPasswordIdConfirm) {
	PasswordIdConfirm.sendKeys(strPasswordIdConfirm);
}
public void setRegisterSubmit () {
	RegisterSubmitBtn.click();
}
//
@FindBy (how=How.XPATH, using= "//*[contains(text(),'(v.')]")
WebElement version;

public String getVersion() {
 return version.getText();
 
}
//
public String VerifyConfirmRegister () {
	return verifyConfirmRegistered.getText();
}

public void AllRegisterApp(String strfname,String strlName, String strPhone,String strUserName, String strAddress1,String strAddress2, String strCity, String strState,String strPostalCode,String strCountry, String strEmailId,String strPasswordId,String strPasswordIdConfirm) {	
	this.newRegister();
	this.setfName(strfname);
	this.setLname(strlName);
	this.setPhone(strPhone);
	this.setUserName(strUserName);
	this.setAddress1(strAddress1);
	this.setAddress2(strAddress2);
	this.setCity(strCity);
	this.setState(strState);
	this.setPostalCode(strPostalCode);
	this.setCountry(strCountry);
	this.setEmailId(strEmailId);
	this.setPassword(strPasswordId);
	this.setPasswordIdConfirm(strPasswordIdConfirm);
	this.setRegisterSubmit();
	
}

}

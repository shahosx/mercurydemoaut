package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOn {
	WebDriver driver; 

	//constructor 
	public SignOn (WebDriver driver) {
		
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	//Locator

	@FindBy  (xpath= "//input[@name='userName']")
	WebElement userName;

	@FindBy  (xpath= "//input[@name='password']")
	WebElement Password;

	@FindBy  (xpath= "//input[@name='login']")
	WebElement SignIn;

	@FindBy (xpath = " //a[contains(text(),'SIGN-OFF')]")
	WebElement VerifyLoggedIn;


	//methods

	public void setUserName(String strUserName) {
		this.userName.sendKeys(strUserName);
	}
	public void setPassword(String strPassword) {
		this.Password.sendKeys(strPassword);
	}
	public void ClickLogInBtn() {
		this.SignIn.click();
	}
	public String LoginVerify() {
		return this.VerifyLoggedIn.getText();

	}
	 public void SignIn_AllMethods (String strUserName, String strPassword) {
		 this.setUserName(strUserName);
		 this.setPassword(strPassword);
		 this.ClickLogInBtn();
		 
	 }
		
	}

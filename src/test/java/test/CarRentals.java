package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CarRentals {
	WebDriver driver;
	
	//constructor 
	public CarRentals(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}

	@FindBy (how=How.XPATH, using= "//a[text()='Car Rentals']")
	WebElement CarRentals;
	@FindBy (how=How.XPATH, using= "//*[contains(text(),'(v.')]")
	WebElement version;
	
	public void ClickCarRentals (){
		CarRentals.click();
	}
	public String getVersion() {
	 return version.getText();
	 
	}
}

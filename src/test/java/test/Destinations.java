package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Destinations {
	WebDriver driver;

	//constructor 
	public Destinations(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy (how=How.XPATH, using= "//a[text()='Destinations']")
	WebElement Destinations;
	@FindBy (how=How.XPATH, using= "//*[contains(text(),'(v.')]")
	WebElement version;
	
	public void ClickDestinations (){
		Destinations.click();
	}
	public String getVersion() {
	 return version.getText();
	 
	}
}

package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Vacations {
	WebDriver driver;
	
	//constructor 
	public Vacations(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy (how=How.XPATH, using= "//a[text()='Vacations']")
	WebElement Vacations;
	@FindBy (how=How.XPATH, using= "//*[contains(text(),'(v.')]")
	WebElement version;
	
	public void ClickVacations (){
		Vacations.click();
	}
	public String getVersion() {
	 return version.getText();
	 
	}
}

package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Support {
	WebDriver driver;
	
	//constructor 
	public Support(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy (how=How.XPATH, using= "//a[text()='SUPPORT']")
	WebElement Support;
	@FindBy (how=How.XPATH, using= "//*[contains(text(),'(v.')]")
	WebElement version;
	
	public void ClickSupport (){
		Support.click();
	}
	public String getVersion() {
	 return version.getText();
	 
	}
}

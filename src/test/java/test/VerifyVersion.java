package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VerifyVersion {
WebDriver driver;

@FindBy (how=How.XPATH, using= "//*[contains(text(),'(v.')]")
WebElement version;

public String setVersion() {
 return version.getText();
 
}
	
}

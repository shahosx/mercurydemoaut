package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class launch {

WebDriver driver; 

//constructor 
public launch(WebDriver driver) { 
	this.driver = driver;
	PageFactory.initElements(driver, this); 
}


public String getTitle() {
	return this.driver.getTitle();
	 
}
}

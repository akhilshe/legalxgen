package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utils.UtilsTools;

public class HomePageObjects extends UtilsTools{
	
	 
	
	@FindBy(xpath = "//*[@id=\"Username\"]")
	WebElement emailInputBoxElement;
	@FindBy(id = "Password")
	WebElement passwordBoxElement;
	@FindBy(xpath = "//*[@id=\"btnLogOn\"]")
	WebElement LoginButton;
	
	
	public HomePageObjects() {
		
		PageFactory.initElements(driver, this);
	}
	
	public Dashboard Performactions() {
		emailInputBoxElement.sendKeys("akhil@legalxgen.com");
		passwordBoxElement.sendKeys("master");
		LoginButton.click();
		return new Dashboard();
		
	}	
	
	

}

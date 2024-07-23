package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.UtilsTools;


public class Dashboard extends UtilsTools{
	
	
	
	public Dashboard() {
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//*[@id=\"manageLeads\"]")
	WebElement leadButtonSidElement;
	@FindBy(id = "manageMatters")
	WebElement MattterButtonSidElement;
	@FindBy(id = "manageTimeSheet")
	WebElement timesheetButtonSidElement;
	@FindBy(id = "accountTask")
	WebElement accountstButtonSidElement;
//	@FindBy(id = "//i[@class='fa fa-money']")
//	WebElement invoicetButtonSidElement;
//	@FindBy(id = "//a[normalize-space()='Expenses']")
//	WebElement ExpensetButtonSidElement;
	
	public	ManageMatter ClickMatter()
	{
		MattterButtonSidElement.click();
		return new ManageMatter();
		
	}
	public	Leadpage ClickLeads()
	{		
		leadButtonSidElement.click();
		return new Leadpage();
	}
	public	ManageTimesheet ClickTimesheet()
	{
		timesheetButtonSidElement.click();
		return new ManageTimesheet();
	}
	public	void ClickAccounts()
	{
		accountstButtonSidElement.click();
	}
	public	void ClickInvoice()
	{
		leadButtonSidElement.click();
	}
	public	void ClickExpense()
	{
		leadButtonSidElement.click();
	}
	

}

package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.UtilsTools;

public class ManageTimesheet extends UtilsTools{
	
	public ManageTimesheet() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "//*[@id=\"lxContentRow\"]/div[2]/section/div[1]/div[2]/div/button[3]")
	WebElement ViewTimesheet;
	
	@FindBy(id = "btnDownloadInvoices")
	WebElement ListView;
	
	@FindBy(id = "//*[@class=\"btn btn-default btn-sm\"][1]")
	WebElement ExportToExcel;
	
	@FindBy(id = "btnNewTimeEntry")
	WebElement newTimeEntryBtn;
	
	@FindBy(id = "btnSubmitTimesheet")
	WebElement submitTimesheetBtn;
	
	@FindBy(xpath = "//*[@id=\"timesheetList\"]/div[1]/div/div/div/button[4]")
	WebElement selfassignmentBtn;
	
	@FindBy(id ="btnExpenseWindow")
	WebElement AddExpense;
	
	@FindBy(id = "btnBulkEdit")
	WebElement bulkEdit;
	
	@FindBy(id = "//*[@class=\"btn btn-default btn-sm\"][2]")
	WebElement NewMatter;
	
	
	public NewTimeEntry ClicOnNewTimeEntry() throws Exception{
		newTimeEntryBtn.click();
		Thread.sleep(3000);
		return new NewTimeEntry(); 
		
		
	}


	
	
	

}

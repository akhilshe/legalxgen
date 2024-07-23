package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utils.UtilsTools;

public class NewTimeEntry extends UtilsTools{
	
	public NewTimeEntry() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "select2-MatterId-container")
	WebElement searchByMatter;
	@FindBy(xpath = "//*[@id=\"lxBodyMain\"]/span/span/span[1]/input")
	WebElement EnterMatter;
	@FindBy(id = "TimeTrackingActivityId")
	WebElement Activity;
	@FindBy(xpath = "//*[@id=\"IsBillable\"][1]")
	WebElement BillableRadioYes;// need to change in future
	@FindBy(xpath = "//*[@id=\"IsBillable\"][2]")
	WebElement BillableRadioNo; // need to change in future 
	@FindBy(id = "BillableHour")
	WebElement BillableHour;
//	@FindBy(id = "FromTime")
//	WebElement FromTime;
//	@FindBy(id = "ToTime")
//	WebElement ToTime;
	@FindBy(id = "TrackedTime")
	WebElement TotalHours;	
	@FindBy(id = "Description")
	WebElement Description;
	@FindBy(id = "btnPopupSave")
	WebElement SaveTimeEntry;
	@FindBy(id = "btn_81e29d60-3027-0684-0a37-aec5858e3827")
	WebElement SaveNnewTimeEntry;
	
	public void EnterDetails() throws Exception{
		UtilsTools.Select2Dropdowndropdown(searchByMatter, EnterMatter, "akhil"); 
		Thread.sleep(3000);
		Select Activityoption = new Select(Activity);
		Activityoption.selectByIndex(1);
		TotalHours.clear();
		TotalHours.sendKeys("01:00");
		BillableHour.clear();
		BillableHour.sendKeys("00:15");
//		FromTime.sendKeys("11:00");
//		ToTime.sendKeys("12:00");
		Description.sendKeys("I am testing automation framework");
		SaveTimeEntry.click();
				
	}	
}

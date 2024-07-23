package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utils.UtilsTools;

public class CreateMatter extends UtilsTools{
	
	public CreateMatter() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(id = "BUId")
	WebElement businessUnitsearchbox;
	@FindBy(xpath = "//*[@id=\"select2-ClientId-container\"]")
	WebElement ContactButtonsearchboxOrPropsname;
	@FindBy(xpath = "//*[@id=\"lxBodyMain\"]/span/span/span[1]/input")
	WebElement prospectnameinput;
	@FindBy(id  = "PracticeAreaId")
	WebElement practicearea;
	@FindBy(id = "MatterTitle")
	WebElement MatterTitle;
	@FindBy(id = "Status")
	WebElement MatterStatus;
	@FindBy(id = "BillingTypeId")
	WebElement BillingType;
	@FindBy(id = "btnSaveMatter")
	WebElement SaveMatterBtn;
	@FindBy(id = "MatterCode")
	WebElement MatterCode;
	
	
	public void EnterBu() {
		Select selectunit = new Select(businessUnitsearchbox);
		selectunit.selectByIndex(1);		
	}
	public CreatedMatterPage EnterDetails() throws Exception
	{
		
		Thread.sleep(3000);
		UtilsTools.Selectfromdropdown(businessUnitsearchbox,1);
		UtilsTools.Selectfromdropdown(practicearea,1);
//		Select selectarea = new Select(practicearea);
//		selectarea.selectByIndex(1);
		UtilsTools.Selectfromdropdown(MatterStatus,1);
		UtilsTools.Selectfromdropdown(BillingType,1);
		UtilsTools.Select2Dropdowndropdown(ContactButtonsearchboxOrPropsname, prospectnameinput, "akhil");										
		MatterTitle.sendKeys("I am Automation Tester");			
		String test = BillingType.getAttribute("value");

		Thread.sleep(3000);
		
		Thread.sleep(3000);
		MatterNumber = MatterCode.getAttribute("value");
		System.out.println(MatterNumber);
		System.out.println(MatterNumber);
		System.out.println(MatterNumber);
		System.out.println(MatterNumber);
		System.out.println(MatterNumber);
		System.out.println(MatterNumber);
		System.out.println(MatterNumber);
		System.out.println(MatterNumber);
		System.out.println(MatterNumber);
		System.out.println(MatterNumber);
		System.out.println(MatterNumber);
		SaveMatterBtn.click();
		return new CreatedMatterPage();		
	}	
	
	public CreatedMatterPage EditDetails() throws Exception
	{
				
		
//		UtilsTools.Selectfromdropdown(businessUnitsearchbox,1);
//		UtilsTools.Selectfromdropdown(practicearea,2);
////		Select selectarea = new Select(practicearea);
////		selectarea.selectByIndex(1);
//		UtilsTools.Selectfromdropdown(MatterStatus,2);
//		UtilsTools.Selectfromdropdown(BillingType,2);
//		String test = BillingType.getAttribute("value");
//
//		UtilsTools.Select2Dropdowndropdown(ContactButtonsearchboxOrPropsname, prospectnameinput, "akhil");										
		
		Thread.sleep(3000);
		MatterTitle.clear();
		MatterTitle.sendKeys("I am Automation Tester and i am the edited one");		
		MatterNumber = MatterCode.getAttribute("value");	
		Thread.sleep(3000);
		SaveMatterBtn.click();
		return new CreatedMatterPage();		
	}	
	
	

}

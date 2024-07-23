package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utils.UtilsTools;

public class CreateLeadPage extends UtilsTools{
	
public CreateLeadPage() {	
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id = "BuId")
	WebElement businessUnitsearchbox;
	@FindBy(xpath  = "//span[@id='select2-ClientId-container']")
	WebElement ContactButtonsearchboxOrPropsname;
	@FindBy(xpath = "//*[@id=\"lxBodyMain\"]/span/span/span[1]/input")
	WebElement prospectnameinput;
	@FindBy(id="select2-OwnerId-container")
	WebElement ownerButtonsearchboxOrowner;
	@FindBy(xpath = "//*[@id=\"lxBodyMain\"]/span/span/span[1]/input")
	WebElement ownerNameInput;
	@FindBy(xpath  = "//input[@role='textbox']")
	WebElement SearchContactsearchbox;
	@FindBy(id  = "PracticeAreaId")
	WebElement practicearea;
	@FindBy(id = "Description")
	WebElement Description;
	@FindBy(id = "StatusId")
	WebElement Status;
	@FindBy(id = "CurrencyId")
	WebElement Currency;
	@FindBy(id = "btnSaveLead")
	WebElement saveLeadButton;
	@FindBy(id = "LeadSourceId1")
	WebElement Leadsource;
	@FindBy(id = "BillingTypeId")
	WebElement BillingTypeId;
	@FindBy(xpath = "//*[@id=\"editable-sample_new\"]")
	WebElement backbuttonElement;
	@FindBy(id="editable-sample_new")
	WebElement matterNumberBoxElement;
	
	

	
	
	
//	public void EnterBu() {
//		Select selectunit = new Select(businessUnitsearchbox);
//		selectunit.selectByIndex(1);		
//	}
//	public void SelectPA() {
//		Select selectPA = new Select(practicearea);
//		selectPA.selectByIndex(1);		
//	}
//	public void EnterStatus() {
//		Select selectStatus = new Select(Status);
//		selectStatus.selectByIndex(1);		
//	}
//	public void EnterCurrency() {
//		Select selectunit = new Select(Currency);
//		selectunit.selectByIndex(1);		
//	}
//	public void EnterLeadsource() {
//		Select selectLeadsource = new Select(Leadsource);
//		selectLeadsource.selectByIndex(1);		
//	}
//	public void BillingTypeId() {
//		Select selectBillingTypeId = new Select(BillingTypeId);
//		selectBillingTypeId.selectByIndex(1);		
//	}
//	public void EnterDescription() {
//		Description.sendKeys("I am Automation Testing");
//	}
//	public void EnterProspectName() throws Exception{
//		ContactButtonsearchboxOrPropsname.click();
//		Thread.sleep(3000);
//		prospectnameinput.sendKeys("akhi");
//		Thread.sleep(3000);
//		prospectnameinput.sendKeys("l"+ Keys.ENTER);		
//	}
//	public void EnterOwnerName() throws Exception{
//		ownerButtonsearchboxOrowner.click();
//		Thread.sleep(3000);
//		ownerNameInput.sendKeys("akhi");
//		Thread.sleep(3000);
//		ownerNameInput.sendKeys("l"+ Keys.ENTER);		
//	}
//	public void CreateLeadBtn() {
//		saveLeadButton.click();
//		
//	}
	
	public void EnterDetails() throws Exception{
		Select selectunit = new Select(businessUnitsearchbox);
		selectunit.selectByValue("Banglore");
		UtilsTools.Select2Dropdowndropdown(ContactButtonsearchboxOrPropsname, prospectnameinput, "akhil");
//		ContactButtonsearchboxOrPropsname.click();
//		Thread.sleep(3000);
//		prospectnameinput.sendKeys("akhi");
//		Thread.sleep(3000);
//		prospectnameinput.sendKeys("l"+ Keys.ENTER);
		Select selectarea = new Select(practicearea);
		selectarea.selectByValue("Litigation");
		Select selectstatus = new Select(Status);
		selectstatus.selectByValue("NEW");
		Select selectCurrency = new Select(Currency);
		selectCurrency.selectByValue("INR");
		UtilsTools.Select2Dropdowndropdown(ownerButtonsearchboxOrowner, ownerNameInput, "akhil");
//		ownerButtonsearchboxOrowner.click();
//		Thread.sleep(3000);
//		ownerNameInput.sendKeys("akhi");
//		Thread.sleep(3000);
//		ownerNameInput.sendKeys("l"+ Keys.ENTER);
		
		Select Leadsourceoption = new Select(Leadsource);
		
		Leadsourceoption.selectByValue("Test");
		Description.sendKeys("I am Automation Testing");										
		saveLeadButton.click();
		
	}		
}

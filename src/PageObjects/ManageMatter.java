package PageObjects;

import java.util.List;

import org.jsoup.select.Evaluator.Id;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.TableException;
import Utils.UtilsTools;
import Utils.TableException;
import net.bytebuddy.implementation.bytecode.Throw;

public class ManageMatter extends UtilsTools{
	
	@FindBy(id = "btnNewMatter")
	WebElement NewMatterBtn;
	@FindBy(id = "btnDlete")
	WebElement DeleteMatters;
	@FindBy(id = "btnMerge")
	WebElement mergeMatters;
	@FindBy(id="btnMatterBulkAssignment")
	WebElement MatterBulkAssignment;
	@FindBy(id = "btnAssignRates")
	WebElement AssignRatesBtn;
	@FindBy(id = "btnBulkUpdateAction")
	WebElement BulkUpdateAction;

	
	//filters
	
	@FindBy(id = "select2-ddlClient-container")
	WebElement searchByClientnamElement;
	@FindBy(id = "ddlBUID")
	WebElement searchByLocationElement;	
	@FindBy(id = "select2-ddlMatter-container")
	WebElement searchByMatterElement;
	@FindBy(xpath = "//*[@id=\"lxBodyMain\"]/span/span/span[1]/input")
	WebElement searchByMatterElementInput;
	@FindBy(id="select2-ddlUserId-container")
	WebElement searchByUserElement;
	@FindBy(id="ddlDateFilter")
	WebElement searchByDayElement;
	@FindBy(id="divMoreFilters")
	WebElement morefiltersElement;
	@FindBy(id="ddlStatusId")
	WebElement searchByStatusElement;
	@FindBy(id="ddlFilterPriority")
	WebElement priorityFilterElement;
	@FindBy(id="ddlPracticeAreaId")
	WebElement PracticeAreaElement;
	@FindBy(id="ddlBillingTypeId")
	WebElement BillingTypeElement;
	@FindBy(id="ddlbilledFilterId")
	WebElement BillingStatusElement;
	@FindBy(id="ddlSectorId")
	WebElement SectorTypeElement;
	@FindBy(id="ddlCurrencyId")
	WebElement currencyTypElement;
	@FindBy(xpath = "//*[@id=\"matterTable\"]/tbody/tr[1]/td[2]/a[1]")
	WebElement Matterlink;
	
	public ManageMatter() {
		
		PageFactory.initElements(driver, this);		
		
	}


	public CreateMatter ClickOnCreate() {
		NewMatterBtn.click();
		return new CreateMatter();
	}
	
	public CreatedMatterPage verifyMatterNumber() throws Exception 
	{		
		UtilsTools.Selectfromdropdown(searchByDayElement,1);		
		Thread.sleep(3000);	
		UtilsTools.Select2Dropdowndropdown(searchByMatterElement, searchByMatterElementInput, MatterNumber);		
		Thread.sleep(3000);
        Matterlink.click();
        Thread.sleep(3000);
        return new CreatedMatterPage();
        
	}	
//	
}	



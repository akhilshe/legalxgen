package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.UtilsTools;

public class Leadpage extends UtilsTools{
	
	@FindBy(id = "btnNewLead")
	WebElement createLeadBtn;
	@FindBy(id = "btnDleteLeads")
	WebElement deleteLeadBtn;
	@FindBy(id = "btnExportToExcel")
	WebElement exportToExcelElement;
	@FindBy(id = "btnBulkUpdate")
	WebElement bulkUpdateElement;

	//filters
	
	@FindBy(id="ddlBussinessUnit")
	WebElement bussinessUnitFilterElement;
	@FindBy(id="ddlStatusId")
	WebElement StatusFilterElement;
	@FindBy(id="ddlDateFilter")
	WebElement DateFilterElement;
	@FindBy(id = "ddlPracticeAreaId")
	WebElement practiceAreaElement;
	@FindBy(id = "ddlScore")
	WebElement ScoreElement;
	
	
	
	
	
	public Leadpage() {
		PageFactory.initElements(driver, this);

	}



	
	public CreateLeadPage ClickOnCreateLead() {
		createLeadBtn.click();
		return  new CreateLeadPage();
		
	}


}

package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.UtilsTools;

public class CreatedMatterPage extends UtilsTools{
	
	@FindBy(id="btnEditOrSave")
	WebElement EditButton;
	@FindBy(xpath = "//*[@id=\"lxBodyMain\"]/div[5]/div/div[4]/div[2]/button")
	WebElement okButtonElement;
	@FindBy(id = "btnBackToMatters")
	WebElement BackButton;
	@FindBy(id = "docsLi")
	WebElement Documents;
	@FindBy(id = "timesheetLi")
	WebElement Timesheet;
	@FindBy(id = "activitiesLi")
	WebElement Task;
	@FindBy(id = "expensesLi")
	WebElement Expenses;
	@FindBy(id = "invoicesLi")
	WebElement Invoices;
	@FindBy(id="external-counselLi")
	WebElement External_counselLi;
	@FindBy(id = "proceedingsLi")
	WebElement Proceedings;
	@FindBy(id = "commentsLi")
	WebElement Comments;
	@FindBy(id = "activity-logLi")
	WebElement Log;
	
	public ManageMatter ClickOK_n_back() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		okButtonElement.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		BackButton.click();
		return new ManageMatter();		
	}
	
	public CreateMatter EditMatter() {
		EditButton.click();
		return new CreateMatter();		
	}
	public ManageMatter ClickOnback() {
		BackButton.click();
		return new ManageMatter();
	}
	
	public CreatedMatterPage() {
		PageFactory.initElements(driver, this);
	}
	
}

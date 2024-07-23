package Tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.Dashboard;
import PageObjects.HomePageObjects;
import PageObjects.ManageTimesheet;
import PageObjects.NewTimeEntry;
import Utils.MyRetry;
import Utils.UtilsTools;
@Listeners(IE.class)
public class CreateTimesheetTests extends UtilsTools{
	HomePageObjects  homePageObjects;
	Dashboard	dashboard;
	ManageTimesheet manageTimesheet; 
	NewTimeEntry newTimeEntry;
	@BeforeTest
	public void GoTOTimesheet() throws Exception
	{
		dashboard= 	UtilsTools.init();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);		
		manageTimesheet =dashboard.ClickTimesheet();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		Thread.sleep(3000);
		newTimeEntry =manageTimesheet.ClicOnNewTimeEntry();		
		Thread.sleep(3000);
		
							
	} 	
	@Test(priority = 3,retryAnalyzer = MyRetry.class)
	public void CreateTimesheet() throws Exception
	{
		newTimeEntry.EnterDetails();
		Thread.sleep(3000);
		Assert.assertEquals(true, false);
	}

}

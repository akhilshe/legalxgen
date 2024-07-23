package Tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.CreateLeadPage;
import PageObjects.Dashboard;
import PageObjects.HomePageObjects;
import PageObjects.Leadpage;
import Utils.MyRetry;
import Utils.UtilsTools;
@Listeners(IE.class)
public class CreateLeadTests extends UtilsTools{
	
	HomePageObjects  homePageObjects;
	Dashboard	dashboard;
	Leadpage leadpage;
	CreateLeadPage createLeadPage;
	@BeforeMethod
	public void GoTOLead() throws Exception
	{
		dashboard= dashboard= UtilsTools.init();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		leadpage =dashboard.ClickLeads();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		Thread.sleep(3000);
		createLeadPage =leadpage.ClickOnCreateLead();
		
	}
	@Test(priority = 1,retryAnalyzer = MyRetry.class)
	public void CreateLead() throws Exception
	{
		createLeadPage.EnterDetails();
		Thread.sleep(3000);		
		Assert.assertEquals(true, false);
		 
	}

	
//	@AfterMethod
//	public void closeall()
//	{
//		driver.close();
//	}

}

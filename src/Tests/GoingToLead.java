package Tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.CreateLeadPage;
import PageObjects.Dashboard;
import PageObjects.HomePageObjects;
import PageObjects.Leadpage;
import Utils.MyRetry;
import Utils.UtilsTools;

public class GoingToLead extends UtilsTools{
	
	HomePageObjects  homePageObjects;
	Dashboard	dashboard;
	 Leadpage leadpage;
	@BeforeMethod
	public void GoTOLead()
	{
				  
		dashboard= UtilsTools.init();		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
            // Wait for 5 seconds
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		leadpage =dashboard.ClickLeads();
	}
	@Test(retryAnalyzer = MyRetry.class)
	public void Click_on_lead()
	{
		 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
            // Wait for 5 seconds
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		leadpage.ClickOnCreateLead();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
            // Wait for 5 seconds
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		Assert.fail();
	}

	@AfterMethod
	public void closeall()
	{
		driver.close();
	}
}

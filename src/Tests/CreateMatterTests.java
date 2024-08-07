package Tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.CreateMatter;
import PageObjects.CreatedMatterPage;
import PageObjects.Dashboard;
import PageObjects.HomePageObjects;
import PageObjects.ManageMatter;
import Utils.MyRetry;
import Utils.TableException;
import Utils.UtilsTools;

public class CreateMatterTests extends UtilsTools{
	
	HomePageObjects  homePageObjects;
	Dashboard	dashboard;
	ManageMatter manageMatter; 
	CreateMatter creatematter;
	CreatedMatterPage createdMatterPage;
	@BeforeTest
	public void GoTOMatter() throws Exception
	{
		dashboard= UtilsTools.init();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);		
		manageMatter =dashboard.ClickMatter();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		Thread.sleep(3000);
		creatematter = manageMatter.ClickOnCreate();
		Thread.sleep(3000);
				
	} 	
	
	

}

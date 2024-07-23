package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.CreateLeadPage;
import PageObjects.Dashboard;
import PageObjects.HomePageObjects;
import Utils.MyRetry;
import Utils.UtilsTools;

public class HomePageTest  {
	
	WebDriver driver; 
	Dashboard dashboard;
	CreateLeadPage crrateleadpage;
	
	@BeforeMethod
	void LaunchURL()
	{
		UtilsTools.init();		
	}
	@Test(retryAnalyzer = MyRetry.class)
	void EntercredsInLoginpage()
	{
		HomePageObjects objects = new HomePageObjects();		
		dashboard = objects.Performactions();
		
		
	}
	
	
	
	
}

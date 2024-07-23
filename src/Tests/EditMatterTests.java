package Tests;

import org.testng.annotations.Test;

import PageObjects.CreateMatter;
import PageObjects.CreatedMatterPage;
import PageObjects.Dashboard;
import PageObjects.ManageMatter;
import Utils.MyRetry;
import Utils.UtilsTools;

public class EditMatterTests extends UtilsTools{
	Dashboard dashboard;
	ManageMatter manageMatter;
	CreatedMatterPage createdMatterPage;
	CreateMatter createMatter;
	
	@Test(dependsOnMethods = {"Tests.CreateMatterTests.CreateMatter"})
	public void GoTOMatter() throws Exception
	{
		dashboard =UtilsTools.init();
		Thread.sleep(3000);
		manageMatter = dashboard.ClickMatter();
		createdMatterPage= manageMatter.verifyMatterNumber();
		createMatter	=createdMatterPage.EditMatter();
		createdMatterPage =  createMatter.EditDetails();
		createdMatterPage.ClickOnback();
		createdMatterPage= manageMatter.verifyMatterNumber();
	
	}
	
	

}

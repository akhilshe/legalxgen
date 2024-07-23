package Utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventListener;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import PageObjects.Dashboard;
import PageObjects.HomePageObjects;
import Tests.WebEventListener;

public class UtilsTools {
	
		public static String MatterNumber;
		public static int QuoteAmount = 6000;
		public static String  PracticeArea= "coroprate";
		public static String businessUnit = "Banglore";
		public static  String Status ="New";
		public static  String Currency = "INR";
		public static  String leadSource = "Test";
		public static WebDriver driver;
		public static EventFiringWebDriver eventfiringwebdriver;
		public static WebEventListener eventListener;
		public static HomePageObjects homePageObjects;
		public static Dashboard init() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SEL1\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			EventFiringWebDriver eventfiringwebdriver = new EventFiringWebDriver(driver);
			eventListener = new WebEventListener(); 
			eventfiringwebdriver.register(eventListener);
			driver=eventfiringwebdriver;
			driver.manage().window().maximize();
			driver.get("https://lx2.legalxgen.com/");
			homePageObjects = new HomePageObjects();
			
			return homePageObjects.Performactions();
			
		}
		public static void Failed(ITestResult result)  {
			String string = result.getMethod().getMethodName();
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			int seq = 0;
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

			try {
				 File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		            String destPath = "C:\\Users\\User\\eclipse-workspace\\SELva\\Screenshots\\screenshot"+timestamp+"_"+string+".png";
		            FileUtils.copyFile(srcFile, new File(destPath));
		            seq++;
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Failed to take screenshot.........");
			}
            
           
			
		}
		public static void Selectfromdropdown(WebElement element,int number)
		{
			Select select = new Select(element);
			select.selectByIndex(number);
		}
		
		public static void Select2Dropdowndropdown(WebElement element1, WebElement element2,String value)
		{
			element1.click();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
	
			}
			element2.sendKeys(value);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			}
			element2.sendKeys(Keys.ENTER);
			
		}
		
		
		

}

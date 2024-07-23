package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import Utils.UtilsTools;

public class WebEventListener extends UtilsTools implements WebDriverEventListener{
	
    @Override
    public void beforeAlertAccept(WebDriver driver) {
        System.out.println("Before alert accept.");
    }

    @Override
    public void afterAlertAccept(WebDriver driver) {
        System.out.println("After alert accept.");
    }

    @Override
    public void afterAlertDismiss(WebDriver driver) {
        System.out.println("After alert dismiss.");
    }

    @Override
    public void beforeAlertDismiss(WebDriver driver) {
        System.out.println("Before alert dismiss.");
    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        System.out.println("Before navigating to: " + url);
    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        System.out.println("After navigating to: " + url);
    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {
        System.out.println("Before navigating back.");
    }

    @Override
    public void afterNavigateBack(WebDriver driver) {
        System.out.println("After navigating back.");
    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {
        System.out.println("Before navigating forward.");
    }

    @Override
    public void afterNavigateForward(WebDriver driver) {
        System.out.println("After navigating forward.");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver driver) {
        System.out.println("Before navigating refresh.");
    }

    @Override
    public void afterNavigateRefresh(WebDriver driver) {
        System.out.println("After navigating refresh.");
    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Before finding element: " + by.toString());
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("After finding element: " + by.toString());
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        System.out.println("Before clicking on element: " + element.toString());
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        System.out.println("After clicking on element: " + element.toString());
    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        System.out.println("Before changing value of element: " + element.toString());
    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        System.out.println("After changing value of element: " + element.toString());
    }

    @Override
    public void beforeScript(String script, WebDriver driver) {
        System.out.println("Before executing script: " + script);
    }

    @Override
    public void afterScript(String script, WebDriver driver) {
        System.out.println("After executing script: " + script);
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
    	
        System.out.println("Exception occurred: " + throwable.getMessage());
    }

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}

}

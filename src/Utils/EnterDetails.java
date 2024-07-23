package Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EnterDetails {
	
	public static void Selectfromdropdown(WebElement element,String string)
	{
		Select select = new Select(element);
		select.selectByValue(string);
	}

}

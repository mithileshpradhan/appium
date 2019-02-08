package FlipkartNative.Screens;

import org.openqa.selenium.WebElement;

import FlipkartNative.Xpaths.ScreenXpaths;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreen extends ScreenBase {
	
	public HomeScreen(AndroidDriver driver) {
		
		super(driver);
		
	}
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']")
	public WebElement drawerBtn;
	
	@AndroidFindBy(xpath="///android.widget.TextView[@text='My Account']")
	public WebElement myAccount;
	
	
	public HomeScreen clickDrawer() {
		
		drawerBtn.click();
		return this;
	}
	
	public HomeScreen clickMyAccount(String text) {
		MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".resourceId(\""+ScreenXpaths.LIST_ID+"\")).scrollIntoView("
                + "new UiSelector().text(\""+text+"\"));");  
		
		elementToClick.click();
		
		return this;
	}

}

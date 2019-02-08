package FlipkartNative.Screens;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NoResultsFoundScreen extends ScreenBase {

	public NoResultsFoundScreen(AndroidDriver driver) {
		super(driver);
		
	}
	
	@AndroidFindBy(className="android.widget.TextView")
	public List<WebElement> noResults;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']")
	public WebElement backBtn;
	
	public NoResultsFoundScreen getErrorText(String text) {
		
		Assert.assertEquals(noResults.get(0).getText(),text);
		return this;
		
	}
	
	public NoResultsFoundScreen pressBackBtn() {
		
		backBtn.click();
		return this;
	}
	
	
	

}

package FlipkartNative.Screens;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.touch.offset.PointOption;

public class SearchScreen extends ScreenBase{

	public SearchScreen(AndroidDriver driver) {
		super(driver);
		
	}
	
	@AndroidFindBy(id="com.flipkart.android:id/search_autoCompleteTextView")
	public WebElement searchTextField;
	
	@AndroidFindBy(id="com.flipkart.android:id/root_titles")
	public List<WebElement> itemList;
	
	@AndroidFindBy(id="com.flipkart.android:id/back_icon")
	public WebElement backBtn;
	
	
	public SearchScreen enterSearchTerm(String text) {
		
		searchTextField.sendKeys(text);
		
		/*Dimension d = driver.manage().window().getSize();
		int height = d.height;
		int width = d.width;
		int xCoor = (width * 91) / 100;
		int yCoor = (height * 96) / 100;
		
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(new PointOption().withCoordinates(xCoor, yCoor)).perform();
		//driver.tap(1, xCoor, yCoor, 10);  */
	
		
		return this;
	}
	

	public SearchScreen pressShoes() {
		
	
		//driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		itemList.get(0).click();
		return this;
	}
	
	public SearchScreen pressBackBtn() {
		
		backBtn.click();
		return this;
	}

}

package FlipkartNative.Screens;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

public class ProductScreen extends ScreenBase {

	public ProductScreen(AndroidDriver driver) {
		super(driver);
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='0']")
	public WebElement addToCartBtn;
	
	
	public ProductScreen clickAddToCart() {
		
		addToCartBtn.click();
		return this;
	}

}

package FlipkartNative.Screens;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

public class ProductShoesScreen extends ScreenBase {

	public ProductShoesScreen(AndroidDriver driver) {
		super(driver);
		
	}
	
    @AndroidFindBy(xpath="//android.widget.TextView[@text='High Ankle Sneakers For Men']")
	public WebElement Shoes;
	
	
	public ProductShoesScreen clickOnShoe() {
		
		Shoes.click();
		return this;
	}

}

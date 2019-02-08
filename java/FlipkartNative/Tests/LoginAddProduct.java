package FlipkartNative.Tests;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import FlipkartNative.BaseClass.BaseClass;
import FlipkartNative.Screens.HomeScreen;
import FlipkartNative.Screens.LoginScreen;
import FlipkartNative.Screens.MyAccountScreen;
import FlipkartNative.Screens.ProductScreen;
import FlipkartNative.Screens.ProductShoesScreen;
import FlipkartNative.Screens.SearchScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class LoginAddProduct extends BaseClass{
	
	
	@Test
	public void BeginTest() throws IOException {
		
		FileReader f = new FileReader("src\\test\\resources\\Utils\\data.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginScreen loginScreen = new LoginScreen(driver);
		HomeScreen homeScreen = new HomeScreen(driver);
		MyAccountScreen myaccountScreen = new MyAccountScreen(driver);
		SearchScreen searchScreen = new SearchScreen(driver);
		ProductShoesScreen shoe = new ProductShoesScreen(driver);
		ProductScreen productScreen = new ProductScreen(driver);
		
		loginScreen.closeScreen();
		homeScreen.clickDrawer();
		homeScreen.clickMyAccount(prop.getProperty("myAccountText"));
		loginScreen.enterMobileNo(prop.getProperty("mobileNo"));
		loginScreen.enterPassword(prop.getProperty("password"));
		loginScreen.clickSignIn();
		
		
		Assert.assertEquals(myaccountScreen.getTitle(), prop.getProperty("myAccountText"));
		
		myaccountScreen.clickSearchIcon();
		
		searchScreen.enterSearchTerm(prop.getProperty("validSearchTerm"));
		
		searchScreen.pressShoes();
		
		shoe.clickOnShoe();
		
		productScreen.clickAddToCart();
		
		
		
	   
		
	}

}

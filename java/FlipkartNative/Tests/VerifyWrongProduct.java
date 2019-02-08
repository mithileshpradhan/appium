package FlipkartNative.Tests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import FlipkartNative.BaseClass.BaseClass;
import FlipkartNative.Screens.HomeScreen;
import FlipkartNative.Screens.LoginScreen;
import FlipkartNative.Screens.MyAccountScreen;
import FlipkartNative.Screens.NoResultsFoundScreen;
import FlipkartNative.Screens.ProductScreen;
import FlipkartNative.Screens.ProductShoesScreen;
import FlipkartNative.Screens.SearchScreen;

public class VerifyWrongProduct extends BaseClass {
   
	@Test
	public void BeginTest() throws IOException {
		
		FileReader f = new FileReader("src\\test\\resources\\Utils\\data.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		LoginScreen loginScreen = new LoginScreen(driver);
		HomeScreen homeScreen = new HomeScreen(driver);
		MyAccountScreen myaccountScreen = new MyAccountScreen(driver);
		SearchScreen searchScreen = new SearchScreen(driver);
		ProductShoesScreen shoe = new ProductShoesScreen(driver);
		ProductScreen productScreen = new ProductScreen(driver);
		NoResultsFoundScreen noResults = new NoResultsFoundScreen(driver);
		
		loginScreen.closeScreen();
		homeScreen.clickDrawer();
		homeScreen.clickMyAccount(prop.getProperty("myAccountText"));
		loginScreen.enterMobileNo(prop.getProperty("mobileNo"));
		loginScreen.enterPassword(prop.getProperty("password"));
		loginScreen.clickSignIn();
		
		
		Assert.assertEquals(myaccountScreen.getTitle(), prop.getProperty("myAccountText"));
		
		myaccountScreen.clickSearchIcon();
		
		searchScreen.enterSearchTerm(prop.getProperty("invalidSearchTerm"));
	
		
		noResults.getErrorText("Sorry, no results found!");
		
		noResults.pressBackBtn();
		
		searchScreen.pressBackBtn();
		
		homeScreen.clickDrawer();
		
		homeScreen.clickMyAccount(prop.getProperty("myAccountText"));
		
		myaccountScreen.pressLogout(prop.getProperty("indexLogout"));
		
		
		
	
		
		
		
	   
		
	}
}


package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Recoverpwd;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class pwdrecover {

	private WebDriver driver;
	private String baseUrl;
	private Recoverpwd recoverpwd;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		recoverpwd = new Recoverpwd(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		//Click on Lost my Password Link//
		recoverpwd.pwdrecover();
		Thread.sleep(3000);
		//Enter User name
		recoverpwd.username("Saranya_sel");
		Thread.sleep(3000);
		//Click on submit button to send mail registered to user name//
		recoverpwd.submitclick();
		//Checking on the GMAIL tab//
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
	     Assert.assertEquals(ActualTitle, "GMAIL");
	     
		
		
	}
}

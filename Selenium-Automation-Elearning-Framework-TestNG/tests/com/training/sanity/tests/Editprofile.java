package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.EditPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Editprofile {

	private WebDriver driver;
	private String baseUrl;
	private EditPOM editPOM;
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
		editPOM = new EditPOM(driver); 
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
		//Logging in as Student//
		editPOM.sendUserName("SaranLearner");
		editPOM.sendPassword("Learner135");
		Thread.sleep(3000);
		editPOM.clickLoginBtn(); 
		 Thread.sleep(3000);
		 
		 editPOM.eclick();
		 Thread.sleep(3000);
		 //Enter old password for change//
		 editPOM.pwdold("Learner135");
		 Thread.sleep(5000);
		 //Enter new password //
		 editPOM.pwdnew("Hanshi135");
		Thread.sleep(5000);
		//Reenter new password//Reset Password
		 
		editPOM.pwdconfirm("Hanshi135");
		 screenShot.captureScreenShot("StudentPasswordReset");
		 Thread.sleep(5000);
		 
		 editPOM.savechange();
		 screenShot.captureScreenShot("Reset Saved");
		 
	}
}
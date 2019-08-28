
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recoverpwd {
	private WebDriver driver; 
	
	public Recoverpwd(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[contains(text(),' I lost my password ')]")
    private WebElement Lostpwd; 
	
	@FindBy(id="lost_password_user")
    private WebElement user; 
	
	@FindBy(id="lost_password_submit")
    private WebElement submit;
	
		
	public void pwdrecover() {
		
		this.Lostpwd.click();
		
	}
	
   public void username(String UN) {
		
	this.user.clear();
		this.user.sendKeys(UN);
		
		
	}

   public void submitclick() {
		
		this.submit.click();
		
	}
   
   
	
}
	
	
	
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(name="submitAuth")
    private WebElement loginBtn; 
	
	//After Login Click on Course Catalog
	
	@FindBy(xpath="//*[contains(text(),'Course catalog')]")
    private WebElement coursecatalog; 
	
	@FindBy(name="search_term")
    private WebElement courseName; 
	
	@FindBy(xpath="//*[@class='btn btn-default']")
    private WebElement couseNamesearch; 
	
	
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickCatalog() {
		this.coursecatalog.click(); 
	}
	
	public void sendCoursename(String courseName) {
		this.courseName.clear();
		this.courseName.sendKeys(courseName);
		
		
	}
	
		public void searchCourse() {
		
		this.couseNamesearch.click();
		
	}
	
	
	
	
}
    
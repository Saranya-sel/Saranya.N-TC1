package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPOM {
	private WebDriver driver; 
	      
	public EditPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(name="submitAuth")
    private WebElement loginBtn; 
	
	@FindBy(xpath="//*[contains(text(),'Edit profile')]")
    private WebElement clickEdt; 
	
	@FindBy(name="password0")
	private WebElement oldpwd;
	
	@FindBy(name="password1")
	private WebElement newpwd;
	
	@FindBy(name="password2")
	private WebElement pwd;
	
	@FindBy(name="apply_change")
	private WebElement submit;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
		this.userName.getAttribute("Value");
		
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	
    public void eclick() {
		
		this.clickEdt.click();
	}
    
 public void pwdold(String oldpwd) {
		this.oldpwd.clear();
		this.oldpwd.sendKeys(oldpwd);
	}
   
 public void pwdnew(String newpwd) {
		this.newpwd.clear();
		this.newpwd.sendKeys(newpwd);
	}
 
 public void pwdconfirm(String pwd) {
		this.pwd.clear();
		this.pwd.sendKeys(pwd);
	}
 
 
 public void savechange() {
		this.submit.click();
		
	}

 
   
	
}


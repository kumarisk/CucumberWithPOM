package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.TestBase;

public class LoginPage extends TestBase{
	
	
	//Page factory
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="loginbutton")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[@title='Go to Facebook home']")
	WebElement logo;

//Intilizing the page objects	
	
	public LoginPage () {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions:
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public boolean Image() {
			return logo.isDisplayed();
	
		}
		
		public void Login() {
			loginbtn.click();
			username.sendKeys(prop.getProperty("üsername"));
			password.sendKeys(prop.getProperty("password"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click();", loginbtn);
			
			//return new HomePage();
		}
	
	
		}

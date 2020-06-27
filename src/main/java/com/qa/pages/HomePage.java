package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[@aria-label=\"Sudheer\"]//parent::div[@class='bp9cbjyn j83agx80 datstx6m taijpn5t oi9244e8 d74ut37n']")
	WebElement loggedinuser;
	
	public HomePage () {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateusername() {
		return loggedinuser.isDisplayed();
		
	
	}

}

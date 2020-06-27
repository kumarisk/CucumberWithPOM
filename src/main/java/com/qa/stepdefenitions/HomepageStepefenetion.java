package com.qa.stepdefenitions;

import org.openqa.selenium.By;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomepageStepefenetion extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	
	@When("^user is on login page$")
	public void user_is_on_login_page()  {
		TestBase.initialization();
	   
	}

	@Then("^validate title$")
	public void validate_title()  {
		LoginPage loginpage = new LoginPage();
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals("Facebook – log in or sign up", title);
	   
	}

	@Then("^user enters useremail and password$")
	public void user_enters_useremail_and_password() {
		driver.findElement(By.name("email")).sendKeys("9493775295");
		driver.findElement(By.id("pass")).sendKeys("8686421850");
		driver.findElement(By.id("loginbutton")).click();
	   
	}


	@Then("^user verify logged in user$")
	public void user_verify_logged_in_user() {
		boolean flag = homepage.validateusername();
		Assert.assertTrue(flag);
	   
	}



}

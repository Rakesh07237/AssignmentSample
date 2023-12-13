package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.RegisterUser;
import com.qa.testBase.TestBase;

public class RegisterUserTest extends TestBase {
	
	@Test
	public void Registration() {
		RegisterUser user= new RegisterUser();
		user.clickOnsignIn();
		user.clickOnCreateBtn();
		user.enterFirstName("");
		user.enterMobNum(" ");
		user.enterEmailId(" ");
		user.enterPass("");
		user.clickOnVerifyBtn();
		user.enterOtp("");
		user.clickOncreateAccBtn();
	}
	

}

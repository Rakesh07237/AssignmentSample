package com.qa.testLayer;



import org.testng.annotations.Test;

import com.qa.pageLayer.AddToCart;
import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;



public class LoginPageTest extends TestBase {
	@Test
	public void verifyLoginFunctionality()
	{
		LoginPage login = new LoginPage();
		login.enterMobNum("9970779728");
		login.clickOnContinue();
		login.enterPassword("Rakesh@07237");
		login.clickOnLogin();
		login.enterOtp("2552");
		login.clickOnLogin();
		
	}
	
	@Test(dependsOnMethods="verifyLoginFunctionality")
	public void verifyAddToCartfunctionality() {
		AddToCart add=new AddToCart();
		add.searcBox("iphone");
		add.clickOnSearchbtn();
		add.clickselectPhone();
		add.clickOnAddToCartbtn();
	}
	
	
	}
	





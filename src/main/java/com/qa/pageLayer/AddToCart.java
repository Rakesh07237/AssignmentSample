package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class AddToCart extends TestBase {
	

	public  AddToCart  () {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	private WebElement search_box;
		
	@FindBy(xpath="//*[@id='nav-search-submit-text']")
	private WebElement search_btn;
	
	@FindBy(linkText="Apple iPhone 15 (128 GB) - Black")
	private WebElement select_phone;
		
	@FindBy(xpath="//*[@id='add-to-cart-button']")
	private WebElement add_to_cart ;
	
	
	
	
	
	
	
	public void searcBox(String name)
	{
		search_box.sendKeys(name);
	
	}
	public void clickOnSearchbtn() {
		search_btn.click();
		
	}
	
	public void clickselectPhone() {
		select_phone.click();
	}
	
	public void clickOnAddToCartbtn() {
		 add_to_cart.click();
		
	}

}

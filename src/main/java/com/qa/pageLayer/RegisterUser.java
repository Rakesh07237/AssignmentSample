package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class RegisterUser extends TestBase {
	
	public  RegisterUser() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='nav-link-accountList-nav-line-1']")
	private WebElement signIn;
		
	@FindBy(xpath="//*[@id='createAccountSubmit']")
	private WebElement btn_cretae_account;
	
	@FindBy(xpath="//*[@name='customerName']")
	private WebElement first_name;
		
	@FindBy(xpath="//*[@id='ap_phone_number']")
	private WebElement mob_number ;
	
	@FindBy(xpath="//*[@name='secondaryLoginClaim']")
	private WebElement txt_email_id;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement txt_password ;
	
	@FindBy(xpath="//*[@id='continue']")
	private WebElement btn_verify_number;
	
	@FindBy(xpath="//*[@name='code']")
	private WebElement enter_otp;
	
	@FindBy(xpath="//*[@name='pvSubmit']")
	private WebElement btn_create_account_fianl;
	
	
	
	public void clickOnsignIn()
	{
		 signIn.click();
	}
	public void clickOnCreateBtn() {
		 btn_cretae_account.click();
	}
	
	public void enterFirstName(String name) {
		first_name.sendKeys(name);
	}
	
	public void enterMobNum(String num) {
		 mob_number.sendKeys(num);
	}
	
	public void enterEmailId(String email) {
		txt_email_id.sendKeys(email);
	}
	
	public void enterPass(String pass) {
		txt_password.sendKeys(pass);
	}
	
	public void clickOnVerifyBtn() {
		 btn_verify_number.click();
	}
	
	public void enterOtp(String otp) {
		enter_otp.sendKeys();
	}
	
	public void  clickOncreateAccBtn() {
		btn_create_account_fianl.click();
	}
}

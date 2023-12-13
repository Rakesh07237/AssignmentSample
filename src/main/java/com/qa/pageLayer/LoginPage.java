package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;





public class LoginPage extends TestBase {
	
	public  LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id='nav-link-accountList-nav-line-1']")
	private WebElement signIn;
		
	@FindBy(xpath="//*[@name='email']")
	private WebElement mobile_number;
	
	@FindBy(xpath="//*[@id='continue']")
	private WebElement btn_Continue;
	
	
		
	@FindBy(xpath="//*[@name='password']")
	private WebElement txt_password ;
	
	
	
	@FindBy(xpath="//*[@id='signInSubmit']")
	private WebElement btn_signIn ;
	
	@FindBy(xpath="//*[@ id='input-box-otp']")
	private WebElement enter_otp;
	
	@FindBy(xpath="//*[@id='cvf-submit-otp-button-announce']")
	private WebElement submit_otp;
	
	
	public void clickOnsignIn()
	{
		 signIn.click();
	
	}
	
	
	public void enterMobNum(String num)
	{
		mobile_number.sendKeys(num);
	
	}
	public void clickOnContinue() {
		 btn_Continue.click();
		
	}
	
	public void enterPassword(String pass) {
		txt_password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		btn_signIn.click();
		
	}
	
	public void enterOtp( String otp) {
		 submit_otp.sendKeys(otp);
	}
	public void submitOtp() {
		submit_otp.click();
	}
	/*public String getTitle()
	{
		String title = driver.getTitle();
		return title;
	}*/
		

}

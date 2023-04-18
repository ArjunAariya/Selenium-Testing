package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPojo extends BaseClass {
	public GmailLoginPojo()  {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Email or phone']")
	private WebElement emailOrPhone;
	
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement emailPwd;

	
	

	public WebElement getEmailOrPhone() {
		return emailOrPhone;
	}

	

	public WebElement getEmailPwd() {
		return emailPwd;
	}

	
	
}

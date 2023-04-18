package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass {

	public AmazonPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "nav-link-accountList")
	private WebElement naviSign;
	
	@FindBy(name = "email")
	private WebElement emailOrMob;
	
	@FindBy(id = "ap_password")
	private WebElement amazonPwd;
	
	@FindBy(id = "signInSubmit")
	private WebElement signbtn;

	public WebElement getSignbtn() {
		return signbtn;
	}

	public WebElement getNaviSign() {
		return naviSign;
	}

	public WebElement getEmailOrMob() {
		return emailOrMob;
	}

	public WebElement getAmazonPwd() {
		return amazonPwd;
	}
}

package org.pojo;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

	public LoginPage(){
		
	}
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement clickLoginButton;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement enterUsername;

	
	public WebElement getClickLoginButton() {
		return clickLoginButton;
	}


	public WebElement getEnterUsername() {
		return enterUsername;
	}


	


	


	


	

	
	
}

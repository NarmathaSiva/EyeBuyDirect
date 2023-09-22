package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SighIn extends BaseClass {
	
	public SighIn() {
PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//button[@aria-label='Close']")
	private WebElement popUp;
	
	@FindBy(xpath="//a[@title='Sign In']")
	private WebElement signIn;
	
	@FindBy(xpath="(//input[@type='email'])[3]")
	private WebElement eMail;
	
	@FindBy(xpath="(//input[@type='password'])[3]")
	private WebElement pw;
	
	@FindBy(xpath="(//button[text()='Sign in'])[2]")
	private WebElement sighIn1;

	public WebElement getPopUp() {
		return popUp;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement geteMail() {
		return eMail;
	}

	public WebElement getPw() {
		return pw;
	}

	public WebElement getSighIn1() {
		return sighIn1;
	}

}

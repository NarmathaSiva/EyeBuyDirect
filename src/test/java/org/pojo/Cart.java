package org.pojo;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart extends BaseClass {
	
	public Cart() {
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//button[@aria-label='Close']")
	private WebElement popUp;
	
	@FindBy(xpath="//a[@title='Sign In']")
	private WebElement sighIn;

	@FindBy(xpath="(//input[@type='email'])[3]")
	private WebElement eMail;
	
	@FindBy(xpath="(//input[@type='password'])[3]")
	private WebElement pw;
	
	@FindBy(xpath="(//button[text()='Sign in'])[2]")
	private WebElement sighInButton;
	
	@FindBy(xpath="//a[@title='Cart']")
	private WebElement cart;
	
	@FindBy(xpath="//img[@class='frame-image lazyloaded']")
	private List<WebElement> items;

	public WebElement getPopUp() {
		return popUp;
	}

	public WebElement getSighIn() {
		return sighIn;
	}

	public WebElement geteMail() {
		return eMail;
	}

	public WebElement getPw() {
		return pw;
	}

	public WebElement getSighInButton() {
		return sighInButton;
	}

	public WebElement getCart() {
		return cart;
	}

	public List<WebElement> getItems() {
		return items;
	}
	
}

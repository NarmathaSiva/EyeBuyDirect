package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment extends BaseClass{

	public Payment() {
PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//button[text()='Proceed to checkout']")
	private WebElement proceed;
	
	@FindBy(xpath="//select[@name='address']")
	private WebElement address;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement radioButton;
	
	@FindBy(xpath="//button[text()='Continue to payment']")
	private WebElement payment;
	
	@FindBy(xpath="//input[@placeholder='Full name']")
	private WebElement name;
	
	@FindBy(xpath="//iframe[@id='braintree-hosted-field-number']")
	private WebElement frames;
	
	@FindBy(xpath="//input[@id='credit-card-number']")
	private WebElement cardNo;
	
	@FindBy(xpath="//iframe[@id='braintree-hosted-field-expirationDate']")
	private WebElement frames1;
	
	@FindBy(xpath="//input[@id='expiration']")
	private WebElement expDate;
	
	@FindBy(xpath="//iframe[@id='braintree-hosted-field-cvv']")
	private WebElement frames2;
	
	@FindBy(xpath="//input[@id='cvv']")
	private WebElement cVC;
	
	@FindBy(xpath="(//button[text()='Confirm and pay'])[1]")
	private WebElement confirm1;

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getFrames() {
		return frames;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getFrames1() {
		return frames1;
	}

	public WebElement getExpDate() {
		return expDate;
	}

	public WebElement getFrames2() {
		return frames2;
	}

	public WebElement getcVC() {
		return cVC;
	}

	public WebElement getConfirm1() {
		return confirm1;
	}
	
}

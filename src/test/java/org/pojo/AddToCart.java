package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart extends BaseClass{

	public AddToCart() {
PageFactory.initElements(driver, this);	
}

	@FindBy(linkText="Good Vibrations")
	private WebElement firstProduct;
	
	@FindBy(xpath="//img[@alt='Gold']")
	private WebElement pickColor;
	
	@FindBy(xpath="(//a[@data-word='Select Lenses'])[1]")
	private WebElement selectLens;
	
	@FindBy(xpath="//div[@id='sunglasses']")
	private WebElement basic;
	
	@FindBy(xpath="(//em[text()='Mint'])[4]")
	private WebElement selectLensColor;
	
	@FindBy(xpath="(//button[contains(text(),'Confirm')])[2]")
	private WebElement confirm;
	
	@FindBy(xpath="//button[text()='Confirm & add to cart']")
	private WebElement addTocart;
	
	@FindBy(xpath="//a[@title='Favorites']")
	private WebElement wishList;

	public WebElement getFirstProduct() {
		return firstProduct;
	}

	public WebElement getPickColor() {
		return pickColor;
	}

	public WebElement getSelectLens() {
		return selectLens;
	}

	public WebElement getBasic() {
		return basic;
	}

	public WebElement getSelectLensColor() {
		return selectLensColor;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getAddTocart() {
		return addTocart;
	}
	
}

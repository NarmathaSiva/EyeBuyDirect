package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct extends BaseClass{

	public SearchProduct() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='search'])[1]")
    private WebElement searchBox;
	
	@FindBy(xpath="(//a[text()='Good Vibrations'])[3]")
	private WebElement product;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getProduct() {
		return product;
	}
	
	
}

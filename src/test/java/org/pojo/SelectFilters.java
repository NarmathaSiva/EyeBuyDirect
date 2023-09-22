package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFilters extends BaseClass{
	
	public SelectFilters() {
PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//span[text()='Shop sunglasses']")
	private WebElement sunGlass;
	
	@FindBy(xpath="//span[text()='Shop eyeglasses']")
	private WebElement eyeGlass;
	
	@FindBy(xpath="(//div[@class='switch'])[1]")
	private WebElement clickGender;
	
	@FindBy(xpath="//span[text()='Men']")
	private WebElement selectGender;
	
	@FindBy(xpath="(//div[@class='switch'])[2]")
	private WebElement clickBrand;
	
	@FindBy(xpath="//span[text()='Eyebuydirect']")
	private WebElement selectBrand;
	
	@FindBy(xpath="(//div[@class='switch'])[3]")
	private WebElement clickSize;
	
	@FindBy(xpath="//span[text()='Large']")
	private WebElement selectSize;
	
	@FindBy(xpath="(//div[@class='switch'])[4]")
	private WebElement clickShape;
	
	@FindBy(xpath="(//span[text()='Aviator'])[1]")
	private WebElement selectShape;
	
	@FindBy(xpath="(//div[@class='switch'])[5]")
	private WebElement clickColor;
	
	@FindBy(xpath="(//span[text()='Silver'])[1]")
	private WebElement selectColor;
	
	@FindBy(xpath="(//div[@class='switch'])[6]")
	private WebElement clickMaterial;
	
	@FindBy(xpath="//span[text()='Metal']")
	private WebElement selectMaterial;
	
	@FindBy(xpath="(//div[@class='switch'])[7]")
	private WebElement clickRim;
	
	@FindBy(xpath="//span[text()='Full-Rim']")
	private WebElement selectRim;
	
	@FindBy(xpath="(//div[@class='switch'])[8]")
	private WebElement clickPrice;
	
	@FindBy(xpath="(//span[@class='irs-slider from last'])[6]")
	private WebElement totalWidthLeft;
	
	@FindBy(xpath="(//span[@class='irs-slider to'])[6]")
	private WebElement totalWidthRight;
	
	@FindBy(xpath="(//div[@class='switch'])[9]")
	private WebElement clickFit;
	
	@FindBy(xpath="//span[text()='Adjustable Nose Pads']")
	private WebElement selectFit;
	
	@FindBy(xpath="(//div[@class='switch'])[10]")
	private WebElement clickExtra;
	
	@FindBy(xpath="//span[text()='Lightweight']")
	private WebElement selectExtra;
	
	@FindBy(xpath="(//div[@class='switch'])[11]")
	private WebElement clickPrescription;
	
	@FindBy(xpath="//span[text()='Progressive']")
	private WebElement selectPrescription;
	
	@FindBy(xpath="//button[text()='No Thanks']")
	private WebElement popUp;
	
	@FindBy(linkText="Good Vibrations")
	private WebElement product;

	public WebElement getSunGlass() {
		return sunGlass;
	}

	public WebElement getClickGender() {
		return clickGender;
	}

	public WebElement getSelectGender() {
		return selectGender;
	}

	public WebElement getClickBrand() {
		return clickBrand;
	}

	public WebElement getSelectBrand() {
		return selectBrand;
	}

	public WebElement getClickSize() {
		return clickSize;
	}

	public WebElement getSelectSize() {
		return selectSize;
	}

	public WebElement getClickShape() {
		return clickShape;
	}

	public WebElement getSelectShape() {
		return selectShape;
	}

	public WebElement getClickColor() {
		return clickColor;
	}

	public WebElement getSelectColor() {
		return selectColor;
	}

	public WebElement getClickMaterial() {
		return clickMaterial;
	}

	public WebElement getSelectMaterial() {
		return selectMaterial;
	}

	public WebElement getClickRim() {
		return clickRim;
	}

	public WebElement getSelectRim() {
		return selectRim;
	}

	public WebElement getClickPrice() {
		return clickPrice;
	}

	public WebElement getTotalWidthLeft() {
		return totalWidthLeft;
	}

	public WebElement getTotalWidthRight() {
		return totalWidthRight;
	}

	public WebElement getClickFit() {
		return clickFit;
	}

	public WebElement getSelectFit() {
		return selectFit;
	}

	public WebElement getClickExtra() {
		return clickExtra;
	}

	public WebElement getSelectExtra() {
		return selectExtra;
	}

	public WebElement getClickPrescription() {
		return clickPrescription;
	}

	public WebElement getSelectPrescription() {
		return selectPrescription;
	}

	public WebElement getPopUp() {
		return popUp;
	}
		
	public WebElement getProduct() {
		return product;
	}
	
	public WebElement getEyeGlass() {
		return eyeGlass;
	}
}

	
package org.stepdefinition;

import java.awt.event.KeyEvent;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.pojo.SelectFilters;
import org.pojo.SighIn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SunglassesStep extends BaseClass{

	@Given("User has to enter the {string} and {string} and click signin to access sun glasses page")
	public void user_has_to_enter_the_and_and_click_signin_to_access_sun_glasses_page(String Username, String Password) throws InterruptedException {
		Thread.sleep(5000);	

		SighIn s = new SighIn();
		
		WebElement eMail = s.geteMail();
		passValues(eMail, Username);

		WebElement pw = s.getPw();
		passValues(pw, Password);

		Thread.sleep(2000);
		
		WebElement sighIn1 = s.getSighIn1();
		clickElement(sighIn1);
	}

	@When("User has to select all filters in SunGlasses page")
	public void user_has_to_select_all_filters_in_SunGlasses_page() throws InterruptedException {
		Thread.sleep(5000);

		SelectFilters sf = new SelectFilters();

		WebElement sunGlass = sf.getSunGlass();
		toDownThePage(9);
		Thread.sleep(3000);
		clickElement(sunGlass);

		Thread.sleep(2000);
		
		WebElement clickGender = sf.getClickGender();
		scrollTheMouse(clickGender);
		clickElement(clickGender);

		WebElement selectGender = sf.getSelectGender();
		scrollTheMouse(selectGender);
		clickElement(selectGender);

		Thread.sleep(2000);

		WebElement clickBrand = sf.getClickBrand();
		scrollTheMouse(clickBrand);
		clickElement(clickBrand);

		WebElement selectBrand = sf.getSelectBrand();
		scrollTheMouse(selectBrand);
		clickElement(selectBrand);

		Thread.sleep(2000);

		WebElement clickSize = sf.getClickSize();
		scrollTheMouse(clickSize);
		clickElement(clickSize);

		WebElement selectSize = sf.getSelectSize();
		scrollTheMouse(selectSize);
		clickElement(selectSize);

		Thread.sleep(3000);
		
		WebElement clickShape = sf.getClickShape();
		scrollTheMouse(clickShape);
		clickElement(clickShape);

		WebElement selectShape = sf.getSelectShape();
		scrollTheMouse(selectShape);
		clickElement(selectShape);

		/*	WebElement clickColor = sf.getClickColor();
		scrollTheMouse(clickColor);
		clickElement(clickColor);

		WebElement selectColor = sf.getSelectColor();
		scrollTheMouse(selectColor);
		clickElement(selectColor);

		WebElement clickMaterial = sf.getClickMaterial();
		scrollTheMouse(clickMaterial);
		clickElement(clickMaterial);

		WebElement selectMaterial = sf.getSelectMaterial();
		scrollTheMouse(selectMaterial);
		clickElement(selectMaterial);

		WebElement clickRim = sf.getClickRim();
		scrollTheMouse(clickRim);
		clickElement(clickRim);

		WebElement selectRim = sf.getSelectRim();
		scrollTheMouse(selectRim);
		clickElement(selectRim);

		WebElement clickPrice = sf.getClickPrice();
		scrollTheMouse(clickPrice);
		clickElement(clickPrice);

		WebElement totalWidthLeft = sf.getTotalWidthLeft();
		Point point = totalWidthLeft.getLocation();
		int x = point.getX();
		System.out.println(x);
		int y = point.getY();
		System.out.println(y);

		WebElement totalWidthRight = sf.getTotalWidthRight();
		Point point1 = totalWidthRight.getLocation();
		int x1 = point1.getX();
		System.out.println(x1);
		int y1 = point1.getY();
		System.out.println(y1);				
		scrollTheMouse(totalWidthRight);		
		a.dragAndDropBy(totalWidthRight,-100,0).perform();

		WebElement clickFit = sf.getClickFit();
		scrollTheMouse(clickFit);
        clickElement(clickFit);

		WebElement selectFit = sf.getSelectFit();
		scrollTheMouse(selectFit);
		clickElement(selectFit);

		WebElement clickExtra = sf.getClickExtra();
		scrollTheMouse(clickExtra);
		clickElement(clickExtra);

		WebElement selectExtra = sf.getSelectExtra();
		scrollTheMouse(selectExtra);
		clickElement(selectExtra);

		WebElement clickPrescription = sf.getClickPrescription();
		scrollTheMouse(clickPrescription);
		clickElement(clickPrescription);

		WebElement selectPrescription = sf.getSelectPrescription();
		scrollTheMouse(selectPrescription);
		clickElement(selectPrescription);*/

	}

	@Then("User has to validate the number of items displayed after selecting filters in SunGlasses page")
	public void user_has_to_validate_the_number_of_items_displayed_after_selecting_filters_in_SunGlasses_page() throws InterruptedException {
		Thread.sleep(3000);

	    WebElement products = driver.findElement(By.xpath("//div[@id='pagination']//following-sibling::strong"));        
	 
        String productCount = products.getText();
	    System.out.println("No.of.Products : "+productCount);

	}
}

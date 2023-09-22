package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.SelectFilters;
import org.pojo.SighIn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EyeglassesStep extends BaseClass{

	@Given("User has to enter the {string} and {string} and click signin to access eye glasses page")
	public void user_has_to_enter_the_and_and_click_signin_to_access_eye_glasses_page(String Username, String Password) throws InterruptedException {
		Thread.sleep(5000);	

		SighIn s = new SighIn();

		WebElement eMail = s.geteMail();
		passValues(eMail, Username);

		Thread.sleep(2000);	

		WebElement pw = s.getPw();
		passValues(pw, Password);

		WebElement sighIn1 = s.getSighIn1();
		clickElement(sighIn1);
	}

	@When("User has to select all filters in EyeGlasses page")
	public void user_has_to_select_all_filters_in_EyeGlasses_page() throws InterruptedException {
		Thread.sleep(4000);

		SelectFilters sf = new SelectFilters();

		WebElement eyeGlass = sf.getEyeGlass();
		toDownThePage(9);
		Thread.sleep(3000);
		clickElement(eyeGlass);

		WebElement clickGender = sf.getClickGender();
		scrollTheMouse(clickGender);
		clickElement(clickGender);

		WebElement selectGender = sf.getSelectGender();
		scrollTheMouse(selectGender);
		clickElement(selectGender);

		Thread.sleep(3000);

		WebElement clickBrand = sf.getClickBrand();
		scrollTheMouse(clickBrand);
		clickElement(clickBrand);

		WebElement selectBrand = sf.getSelectBrand();
		scrollTheMouse(selectBrand);
		clickElement(selectBrand);

		Thread.sleep(3000);

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
	}

	@Then("User has to validate the number of items displayed after selecting filters in EyeGlasses page")
	public void user_has_to_validate_the_number_of_items_displayed_after_selecting_filters_in_EyeGlasses_page() throws InterruptedException {
		Thread.sleep(3000);

		WebElement products = driver.findElement(By.xpath("//div[@id='pagination']//following-sibling::strong"));        


		String productCount = products.getText();
		System.out.println("No.of.Products : "+productCount);
	}
}

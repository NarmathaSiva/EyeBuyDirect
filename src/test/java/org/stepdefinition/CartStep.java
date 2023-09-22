package org.stepdefinition;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.pojo.Cart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStep extends BaseClass{

	@Given("User has to enter the {string} and {string} and click signin")
	public void user_has_to_enter_the_and_and_click_signin(String Username, String Password) throws InterruptedException {
		Thread.sleep(3000);

		Cart c = new Cart();

		WebElement eMail = c.geteMail();
		passValues(eMail,Username);

		WebElement pw = c.getPw();
		passValues(pw,Password);

		WebElement sighInButton = c.getSighInButton();
		clickElement(sighInButton);
	}

	@When("User has to go to the Add to Cart Page")
	public void user_has_to_go_to_the_Add_to_Cart_Page() throws InterruptedException {
		Thread.sleep(3000);

		Cart c = new Cart();

		WebElement cart = c.getCart();
		clickElement(cart);

		Thread.sleep(3000);
	}

	@Then("User has to validate the number of items in cart")
	public void user_has_to_validate_the_number_of_items_in_cart() throws InterruptedException {
	 	Thread.sleep(2000);

		Cart c = new Cart();

		List<WebElement> items = c.getItems();
		System.out.println("No of Items in Cart :"+(items.size()));

		toDownThePage(7);

		Thread.sleep(3000);

		for (int i = 0; i < items.size(); i++) {
			WebElement item = items.get(i);

			if(item.isDisplayed()) {
				System.out.println("Products are Present in Cart");
			}
			else {
				System.out.println("Cart is Empty");
			}
		}
	}
}

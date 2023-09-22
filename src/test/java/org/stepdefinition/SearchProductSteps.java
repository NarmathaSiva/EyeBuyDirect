package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.pojo.AddToCart;
import org.pojo.Payment;
import org.pojo.SearchProduct;
import org.pojo.SighIn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductSteps extends BaseClass{
	
	@Given("User has to SighIn the application with {string} and {string}")
	public void user_has_to_SighIn_the_application_with_and(String Username, String Password) throws InterruptedException {
		Thread.sleep(3000);	

		SighIn s = new SighIn();

		WebElement eMail = s.geteMail();
		passValues(eMail, Username);

		WebElement pw = s.getPw();
		passValues(pw, Password);

		Thread.sleep(2000);
		
		WebElement sighIn1 = s.getSighIn1();
		clickElement(sighIn1);

	}

	@When("User has to search the product")
	public void user_has_to_search_the_product() throws InterruptedException, AWTException {
		Thread.sleep(5000);

		SearchProduct sp = new SearchProduct();

		WebElement searchBox = sp.getSearchBox();
		passValues(searchBox, "Good Viabrations");

		Thread.sleep(3000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("User has to select the product in the below and add to cart")
	public void user_has_to_select_the_product_in_the_below_and_to_cart() throws InterruptedException {
		Thread.sleep(3000);

		SearchProduct sp = new SearchProduct();

		WebElement product = sp.getProduct();
		clickElement(product);

		Thread.sleep(3000);

		AddToCart ac = new AddToCart();

		WebElement pickColor = ac.getPickColor();
		clickElement(pickColor);

		toDownThePage(5);
		
        Thread.sleep(3000);

		WebElement selectLens = ac.getSelectLens();
        clickElement(selectLens);

		Thread.sleep(3000);

		WebElement basic = ac.getBasic();
		clickElement(basic);

		Thread.sleep(3000);

		WebElement selectLensColor = ac.getSelectLensColor();
		clickElement(selectLensColor);

		toDownThePage(3);
		
        Thread.sleep(3000);

		WebElement confirm = ac.getConfirm();
		clickElement(confirm);

		Thread.sleep(3000);

		WebElement addTocart = ac.getAddTocart();
		clickElement(addTocart);
	}

	@Then("User has to pay and buy the product and close the browser")
	public void user_has_to_pay_and_buy_the_product_and_close_the_browser() throws InterruptedException {
		Thread.sleep(3000);

		Payment p = new Payment();

		WebElement proceed = p.getProceed();
		clickElement(proceed);

		WebElement address = p.getAddress();
		Select s = new Select(address);
		s.selectByIndex(1);

		WebElement radioButton = p.getRadioButton();
		clickElement(radioButton);

		WebElement payment = p.getPayment();
		clickElement(payment);

		toDownThePage(9);

        Thread.sleep(6000);

		WebElement name = p.getName();		
		passValues(name, "Sasi");
		
        Thread.sleep(3000);

		WebElement cardFrame = p.getFrames();
		switchToFrame(cardFrame);
		
        Thread.sleep(6000);
		
		WebElement cardNo = p.getCardNo();
		passValues(cardNo, "4586256487451256");

		toMainFrame();
		
		WebElement dateFrame = p.getFrames1();
		switchToFrame(dateFrame);
		
        Thread.sleep(3000);

		WebElement expDate = p.getExpDate();
		passValues(expDate, "0624");
		
		toMainFrame();

        WebElement cvvFrame = p.getFrames2();
        switchToFrame(cvvFrame);
        
        Thread.sleep(3000);        

		WebElement cVC = p.getcVC();
		passValues(cVC, "455");

		toMainFrame();
		Thread.sleep(6000);
		
		WebElement confirm1 = p.getConfirm1();
		clickElement(confirm1);

		Thread.sleep(5000);
	}
}

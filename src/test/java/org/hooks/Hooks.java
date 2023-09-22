package org.hooks;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.Cart;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{

	@Before(order=0)
	public void launchBrowser() {
		launchChromeBrowser();
		launchURL("https://www.eyebuydirect.com/");
		maxiWindow();
		impWait(20000);
	}

	@Before(order=1)
	public void sighIn() throws InterruptedException {
		Thread.sleep(3000);

		Cart c = new Cart();

		WebElement popUp = c.getPopUp();
		clickElement(popUp);

		Thread.sleep(3000);

		WebElement sighIn = c.getSighIn();
		clickElement(sighIn);

	}

	@After
	public void closeBrowser1() {
		closeBrowser();
	}
}

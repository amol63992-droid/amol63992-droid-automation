package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FlipkartProduct {
	@Given("search an {string} in search module at homepage.")
	public void search_an_in_search_module_at_homepage(String Search) throws Exception {
		Thread.sleep(2000);
	    Driver.w.findElement(By.name("q")).sendKeys(Search,Keys.ENTER);
	}
	@When("Click on a first product")
	public void click_on_a_first_product() throws Exception {
		Thread.sleep(2000);
		Driver.w.findElement(By.className("k7wcnx")).click();

	}

}

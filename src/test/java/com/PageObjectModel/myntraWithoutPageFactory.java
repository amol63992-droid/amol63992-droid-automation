package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class myntraWithoutPageFactory {
	private WebDriver w;
	public myntraWithoutPageFactory(WebDriver wd) {
		w=wd;
	}
	 private By search=By.cssSelector("input[placeholder=\"Search for products, brands and more\"]");
	 
	 private By firstproductclick=By.cssSelector("h4[class=\"product-product\"]");
	 
	 private By addTocart=By.cssSelector("div.pdp-add-to-bag.pdp-button.pdp-flex.pdp-center");
	 //set of actions
	 public void  Search(String search) {
		 w.findElement(this.search).sendKeys(search,Keys.ENTER);
	 }
	 public void firstproductclick() {
		 w.findElement(this.firstproductclick).click();
	 }

	 public void addToCart() {
		 w.findElement(this.addTocart).click();
	 }
	

}

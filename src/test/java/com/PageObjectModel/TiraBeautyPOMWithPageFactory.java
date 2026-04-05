package com.PageObjectModel;
import java.util.List;
import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TiraBeautyPOMWithPageFactory {
	WebDriver w;
	public TiraBeautyPOMWithPageFactory(WebDriver w) {
		this.w = w;
		PageFactory.initElements(w, this);	
	}
	@FindBy(css = "input[id=\"search\"]")
	private WebElement search;
	
	
	@FindBy(css = "h3[class=\"productName--Ys8wX\"]")
	private List<WebElement> products;
	@FindBy(xpath = "//*[@class=\"bagBtnMain--WvS4H\"]/button")
	private WebElement addTocart;
	public void SpecificProduct(String productname) {
		for (WebElement product : products) {
			
			if (product.getText().contains(productname)) {
				product.click();
				break;
			}
		}
	}
	public void search(String search) {
		this.search.sendKeys(search,Keys.ENTER);
	}
    public void addTocart() {
    	addTocart.click();
    }

}

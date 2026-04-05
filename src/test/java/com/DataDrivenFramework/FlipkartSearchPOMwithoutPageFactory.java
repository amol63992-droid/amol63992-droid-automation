package com.DataDrivenFramework;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSearchPOMwithoutPageFactory {
	private WebDriver w;//global variable
//without--> locator from set of action	
	public FlipkartSearchPOMwithoutPageFactory(WebDriver wd) {//constructor
		w=wd;
	}
//element
	//search-->locator-->var-->search
	private By search=By.name("q");
	private By searchIcon=By.cssSelector("button[type=\"submit\"]");
	private By product=By.className("k7wcnx");
	private By prevOrnext=By.cssSelector("a[class=\"jgg0SZ\"]");
	private By AddToCart=By.cssSelector("button[class=\"dSM5Ub ugg2XR IUmgrZ\"]");
//set of actions
	public void Search(String search) {
		w.findElement(this.search).sendKeys(search);
	}
	public void SearchByEnter(String search) {
		w.findElement(this.search).sendKeys(search,Keys.ENTER);
	}
	public void SearchByIcon(String search) {
		w.findElement(this.search).sendKeys(search);
		w.findElement(searchIcon).click();
		
	}
	public void selectfirstproductonly() {
		w.findElement(product).click();
	}
	public void selectspecificproduct(String productname) throws Exception {
		while (true) {
			Thread.sleep(2000);
			List<WebElement> products =w.findElements(product);
			for (WebElement product : products) {
				if (product.getText().toString().contains(productname)) {
					product.click();
					return;
				}
			}
			List<WebElement>pn=w.findElements(prevOrnext);
			for (WebElement n : pn) {
				if (n.getText().toString().equalsIgnoreCase("next")) {
					Actions act =new Actions(w);
					act.moveToElement(n).click().perform();
				}	
			}	
		}
	}
      private String main;
      public void SwitchToEmbededwindow() {
    	  String mainwindow=w.getWindowHandle();
    	  main=mainwindow;
    	  Set<String>childwindow=w.getWindowHandles();
    	  for (String c: childwindow) {
    		  if (!c.equals(mainwindow)) {
    			  w.switchTo().window(c);
			}	
		}
      }
      public void switchTomainwindow() {
    	  w.switchTo().window(main);
      }
      public void AddToCart() {
    	  w.findElement(AddToCart).click();
      }
}

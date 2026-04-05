package com.PageObjectModel;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntraSearch {

	public static void main(String[] args) throws Exception {
		WebDriver w= new ChromeDriver();
		w.get("https://www.myntra.com/");
		myntraWithoutPageFactory repo= new myntraWithoutPageFactory(w);
		repo.Search("watches");
		repo.firstproductclick();
		String main= w.getWindowHandle();
		Set<String>mainAndChild=w.getWindowHandles();
		for (String MAC : mainAndChild) {
			if (!MAC.equals(main)) {
				w.switchTo().window(MAC);	
			}	
		}
		Thread.sleep(2000);
		repo.addToCart();

	}

}

package com.DataDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAddtocartMobile {

	public static void main(String[] args) throws Exception {
		WebDriver w= new ChromeDriver();
		w.get("https://www.flipkart.com/");
		w.manage().window().maximize();
		FlipkartSearchPOMwithoutPageFactory repo1=new FlipkartSearchPOMwithoutPageFactory(w);
		repo1.SearchByIcon("mobile");
		Thread.sleep(2000);
		repo1.selectfirstproductonly();
		repo1.SwitchToEmbededwindow();
		Thread.sleep(2000);
		repo1.AddToCart();
		Thread.sleep(2000);
		w.quit();
		

	}

}

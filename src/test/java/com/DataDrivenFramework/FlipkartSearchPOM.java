package com.DataDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearchPOM {

	public static void main(String[] args) throws Exception {
		WebDriver w=new ChromeDriver();
		w.get("https://www.flipkart.com/");
		w.manage().window().maximize();
		
		FlipkartSearchPOMwithoutPageFactory repo= new FlipkartSearchPOMwithoutPageFactory(w);
		repo.SearchByEnter("AC");
		//repo.selectfirstproductonly();
		repo.selectspecificproduct("Lloyd 2024 Model 1.5 Ton 5 Star Split Inverter with Wi-fi AC");
		repo.SwitchToEmbededwindow();
		Thread.sleep(2000);
		repo.AddToCart();
		Thread.sleep(2000);
		w.quit();
		

	}

}

package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FoodMandu {

	public static void main(String[] args) throws Exception {

		WebDriver w= new ChromeDriver();
		w.get("https://foodmandu.com/");
		FoodmanduPOMWithPageFactory repo= new FoodmanduPOMWithPageFactory(w);
		repo.login();
		repo.sendEmail("xyz@gmail.com");
		Thread.sleep(2000);
		repo.clearEmail();
		repo.sendPassword("1234567890");
		Thread.sleep(2000);
		repo.clearPassword();
		//repo.loginbtn();
	
	}

}

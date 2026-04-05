package com.TestNGFramework;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo {
	@Test(priority = 2,invocationCount = 2,enabled = true)//test condition
	public void flipkrat() {
		WebDriver w= new ChromeDriver();
		w.get("https://www.flipkart.com/");
	} 
	@Test(priority = 1)
	public void snapdeal() {
		WebDriver w= new ChromeDriver();
		w.get("https://www.snapdeal.com/");
	}

}
 
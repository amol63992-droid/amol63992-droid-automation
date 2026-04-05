package com.PageObjectModel;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TiraBeauty {

	public static void main(String[] args) throws Exception {
		WebDriver w= new ChromeDriver();
		w.get("https://www.tirabeauty.com/");
		w.manage().window().maximize();
		TiraBeautyPOMWithPageFactory repo =new TiraBeautyPOMWithPageFactory(w);
		Thread.sleep(2000);
		repo.search("mens perfume");
		Thread.sleep(2000);
		repo.SpecificProduct("AJMAL Kuro Eau De Perfume (90ml)");
		String main=w.getWindowHandle();
		Set<String>mainAndchild=w.getWindowHandles();
		for (String mac : mainAndchild) {
			if (!mac.equals(main)) {
				w.switchTo().window(mac);
			}
		}
		Thread.sleep(3000);
		repo.addTocart();

	}

}

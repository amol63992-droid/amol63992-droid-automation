package com.TestNGFramework;

import org.testng.annotations.DataProvider;

public class DataForTesting {
	@DataProvider(name="ebay my wishlist")
	public String[] search() {//row
		
		String[] arr= {"mobile","sunglasses","shoes","TV","projector"};
		return arr;
	}
	
	
	@DataProvider(name="ebay amol wishlist")
	public String[][]data(){
		String[][]arr=new String[4][2];
		
		arr[0][0]="mobile";
		arr[0][1]="Mobile for sale | eBay";
		
		arr[1][0]="tires";
		arr[1][1]="Tires for sale | eBay";
		
		arr[2][0]="mens tshirts";
		arr[2][1]="Mens Tshirts for sale | eBay";
		
		arr[3][0]="pokemon cards";
		arr[3][1]="Pokemon Cards for sale | eBay";
		
		return arr;
		
	}
	
	
}

package com.DataDrivenFramework;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FlipkartSearch {
	public static void main(String[] args) throws Exception{
		WebDriver w= new ChromeDriver();
		w.get("https://www.flipkart.com/");
		FileInputStream fis =new FileInputStream("C:\\Users\\HP\\Downloads\\Flipkartsearch.xlsx");
		
		XSSFWorkbook work =new XSSFWorkbook(fis);
		XSSFSheet sheet =work.getSheet("sheet1");
		
		for (int i = 1; i <=sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell testdata =row.getCell(2);
			String searchs[]=testdata.toString().split(",");
			
			for (String search : searchs) {
				w.findElement(By.name("q")).sendKeys(search,Keys.ENTER);
				Thread.sleep(3000);
				w.findElement(By.name("q")).sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
				Thread.sleep(3000);
			}	
		}
		w.quit();
	}
}

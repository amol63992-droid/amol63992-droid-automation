package com.DataDrivenFramework;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginFoodmandu {
	public static void main(String[] args) throws Exception {
		FileInputStream fis= new FileInputStream("./src/test/resources/Foodmandu.xlsx");
		XSSFWorkbook work =new XSSFWorkbook(fis);
		XSSFSheet sheet=work.getSheet("Sheet1");
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			XSSFRow row =sheet.getRow(i);
			XSSFCell email=row.getCell(0);
			XSSFCell password =row.getCell(1);
			//(interface) (log4jclass)
			Logger log= LogManager.getFormatterLogger();
			WebDriver w= null;
			try {
				w=new ChromeDriver();
				log.info("chrome browser has been launch");
			} catch (Exception e) {
				log.error("chrome browser session has not been created"+e);
			}
			try {
				w.get("https://foodmandu.com/");
				log.info("chrome browser has been redirect to food mandu site");
			} catch (Exception e) {
				log.error("chrome browser has not able to navigate to food mandu site"+e.getLocalizedMessage());
			}
			
			w.findElement(By.cssSelector("button[class=\"btn btn--hollow hidden-sm-down\"]")).click();
			log.info("User click on login button homepage");
			Thread.sleep(2000);
			w.findElement(By.name("Email")).sendKeys(email.toString());
			log.info("user enter"+email.toString()+"in address field");
			Thread.sleep(2000);
			w.findElement(By.name("Password")).sendKeys(password.toString());
			log.info("user enter"+password.toString()+"in password field");
			Thread.sleep(2000);
			w.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			log.info("user click on login button in login module");
			Thread.sleep(2000);
			XSSFCell expectedTitle =row.getCell(3);
			try {
				String actualtitle=w.findElement(By.cssSelector("li[title=\"My Profile\"]")).getAttribute("title");
				if (actualtitle.equals(expectedTitle.toString())) {
					System.out.println("Test pass");
					
				} else {
                    System.out.println("Test Fail");
				}
				
			} catch (Exception e) {
				if (e.toString().contains(expectedTitle.toString())) {
					System.out.println("Test Pass");
					
				} else {
					System.out.println("Test Fail");

				}
			}
			w.quit();	
			log.info("user close chrome browser");
		}

	}

}

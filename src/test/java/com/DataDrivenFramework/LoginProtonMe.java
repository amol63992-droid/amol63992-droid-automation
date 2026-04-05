package com.DataDrivenFramework;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginProtonMe {
	public static void main(String[] args) throws Exception {
		FileInputStream fis =new FileInputStream("./src/test/resources/protonme.xlsx");
		XSSFWorkbook work =new XSSFWorkbook(fis);
		XSSFSheet sheet =work.getSheet("Sheet1");
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell email =row.getCell(0);
			XSSFCell password =row.getCell(1);
			WebDriver w= new ChromeDriver();
			w.get("https://proton.me/");
			Thread.sleep(2000);
			w.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
			Thread.sleep(2000);
			w.findElement(By.id("username")).sendKeys(email.toString());
			Thread.sleep(2000);
			w.findElement(By.id("password")).sendKeys(password.toString());
			Thread.sleep(2000);
			w.findElement(By.cssSelector("button[type=\"submit\"]")).click();
			Thread.sleep(10000);
            XSSFCell expectedTitle=row.getCell(3);
            try {
            	String actualtitle=w.findElement(By.cssSelector("button[title=\"Switch or add account\"]")).getAttribute("title");
            	System.out.println(actualtitle);
            	if (actualtitle.equals(expectedTitle.toString())) {
            		
            		System.out.println("Test pass");		
				} else {
					System.out.println("Test fail");
				}
			} catch (Exception e) {
				if (e.toString().contains(expectedTitle.toString())) {
					System.out.println("Test pass");					
				} else {
					System.out.println("Test fail");
				}
			}
            w.quit();           
		}
	}
}

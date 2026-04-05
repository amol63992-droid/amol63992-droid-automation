package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoodmanduPOMWithPageFactory {
	public FoodmanduPOMWithPageFactory(WebDriver w) {
		PageFactory.initElements(w, this);
	}
//webelement
//object variable or class variable
	@FindBy(css = "button[ng-click=\"OpenLoginForm()\"]")
	private WebElement login;
	@FindBy(css ="input[name=\"Email\"]")
	private WebElement email;
	@FindBy(css = "input[name=\"Password\"]")
	private WebElement password;
	@FindBy(css = "button[id=\"btnGoogle\"]")
	private WebElement googlelogin;
//datatype variable=value;
//@anotaion[find element(findby)](value)this is syntax of element
//datatype variable;
	@FindBy(css = "button[type=\"submit\"]")
	private WebElement loginbtn;//private list<WebElement>loginbtn for multiple element
//set of action
	public void login() {
		login.click();
	}
	public void sendEmail(String email) {
		this.email.sendKeys(email);
	}
     public void clearEmail() {
    	 email.clear();
     }
     public void sendPassword(String password) {
    	 this.password.sendKeys(password);
     }
     public void clearPassword() {
    	 password.clear();
     }
     public void loginbtn() {
    	 loginbtn.click();
     }
}

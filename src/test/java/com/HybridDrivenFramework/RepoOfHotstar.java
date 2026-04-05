package com.HybridDrivenFramework;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RepoOfHotstar {
	public RepoOfHotstar(WebDriver w) {
		PageFactory.initElements(w, this);
	}
   @FindBy(xpath = "//*[@class=\"_3O2khXNePOp8a3Gd1EocHu absolute h-full flex items-center ELEVATION_5\"]/nav/div[2]/a/button")
   private WebElement searchicon;
   @FindBy(id="searchBar")
   private WebElement searchTextbox;
   @FindBy(xpath = "//*[@data-testid=\"input-clear-option\"]/i")
   private WebElement crossIconsearchtextbox;
   @FindBy(xpath = "//*[@class=\"_3O2khXNePOp8a3Gd1EocHu absolute h-full flex items-center ELEVATION_5\"]/nav/div[8]/a/button")
   private WebElement myspaceIcon;
   @FindBy(xpath = "//*[@data-testid=\"action\"]/button")
   private WebElement loginbtn;
   @FindBy(css = "input[title=\"Mobile number\"]")
   private WebElement mobilenumberfield;
   @FindBy(css = "button[data-testid=\"signup-form-submit-button\"]")
   private WebElement getOtp;
   public void searchIcon() {
	   searchicon.click();
   }
   public void searchTextBox(String search) {
	   searchTextbox.sendKeys(search);
   }
   public void SearchCrossIcon() {
	   crossIconsearchtextbox.click();
   }
   public void myspace() {
	   myspaceIcon.click();
   }
   public void loginbtn() {
	   loginbtn.sendKeys(Keys.ENTER);
   }
   public void mobileNumberfield(String mobilenumber) {
       this.mobilenumberfield.sendKeys(mobilenumber);
   }
   public void getotp() {
	   getOtp.click();
   }
}

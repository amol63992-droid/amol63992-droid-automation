package KeywordDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepoOfDisha {
	public RepoOfDisha(WebDriver w) {
		PageFactory.initElements(w,this);
	}
//Suvarna
	@FindBy(id="userName")
 private WebElement username;
	@FindBy(id="password")
 private WebElement password;	
	@FindBy(css = "input[type=\"checkbox\"]")
 private WebElement  KeepMeSignInCheckBox;
	@FindBy(id="SignIn")
 private WebElement signin;

	
	

}

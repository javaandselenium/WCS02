package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogin {
	
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement loginbtn;
	
	@FindBy(id="email")
	private WebElement emailaddresstb;
	
	@FindBy(id="password")
	private WebElement passwordtb;
	
	@FindBy(id="last")
	private WebElement sumbitbtn;
	
	
	public SkillraryLogin(WebDriver driver) {
	PageFactory.initElements(driver,this);	
	}
	
	public void login() {
		loginbtn.click();
	}
	
	public void emailaddress(String email) {
		emailaddresstb.sendKeys(email);
	}
	
	public void password(String pwd) {
		passwordtb.sendKeys(pwd);	
	}
	
	public void sumbitbutton() {
		sumbitbtn.click();
	}

}

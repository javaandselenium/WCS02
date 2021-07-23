package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(name="username")
	private WebElement usernametb;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void username(String us) {
		usernametb.sendKeys(us);	
	}
	
	

}

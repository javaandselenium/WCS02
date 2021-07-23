package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(14,TimeUnit.SECONDS);
		
		SkillraryLogin s=new SkillraryLogin(driver);
		s.login();
		s.getEmailaddresstb().clear();
		s.emailaddress("hdhgjhgfgfg");
		s.getPasswordtb().clear();
		s.password("fdjfghfgffg");
		s.sumbitbutton();

	}

}

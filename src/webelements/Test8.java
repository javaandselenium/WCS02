package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[text()='ಹೊಸ ಖಾತೆಯನ್ನು ರಚಿಸಿ']")).click();
	WebElement fname = driver.findElement(By.name("firstname"));
	if(fname.isDisplayed()) {
		System.out.println("Pass:firstname text box is dispalyed");
	}
	else
	{
		System.out.println("Fail:First name text box is not displayed");
	}
	
	WebElement radiobtn = driver.findElement(By.name("sex"));
	if(radiobtn.isSelected()) {
		System.out.println("Pass:element is selected");
	}
	else
	{
		System.out.println("Fail:eleemnt is not selected");
	}
	
	WebElement signupbtn = driver.findElement(By.name("websubmit"));
	if(signupbtn.isEnabled()) {
		System.out.println("Pass:element is enabled");
	}
	else
	{
		System.out.println("Fail:element is not enabled");
	}
	driver.close();
	
	}

}

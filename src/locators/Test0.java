package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("fggfstyurgyguyu");
	driver.findElement(By.name("pass")).sendKeys("vhygchygcfgyty");

	}

}

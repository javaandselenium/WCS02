package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//	WebElement ele = driver.findElement(By.name("username"));
		
		Login l=new Login(driver);
		driver.navigate().refresh();
		//ele.sendKeys("gghggh");
		l.username("gffjgfhgfhgh");
		

	}

}

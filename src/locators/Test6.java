package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
	
		driver.findElement(By.name("username")).sendKeys("gghggh");
		
driver.findElement(By.name("password")).sendKeys("ghjfghjgjh");

driver.findElement(By.xpath("//div[text()='Log In']")).click();
String t = driver.getTitle();
System.out.println(t);
System.out.println(driver.getCurrentUrl());
	if(t.equals("Instagram")) {
		System.out.println("Pass");
	}
	else
	{
		System.out.println("fail");
	}
	driver.close();
	}

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		//Step:1 open the browser
		WebDriver driver=new ChromeDriver();
		//Step:2 max the browser
		driver.manage().window().maximize();
		//Step:3 eneter the url of the application
		driver.get("https://twitter.com/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//div[@dir='auto'])[4]")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("session[username_or_email]")).sendKeys("tetrytryty");
		driver.findElement(By.name("session[password]")).sendKeys("gggfhjsgjhgjh");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		

	}

}

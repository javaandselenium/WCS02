package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");

driver.manage().timeouts().implicitlyWait(10,TimeUnit.);


driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");

driver.findElement(By.xpath("//div[text()='Login ']")).click();
String title=driver.getTitle();
System.out.println(title);

if(title.equals("actiTIME - Login")) {
	System.out.println("Pass:home page is displayed");
}
else
{
	System.out.println("Fail:home page is not dispalyed");
}

System.out.println(driver.getCurrentUrl());
Thread.sleep(4000);
driver.close();

	}

}

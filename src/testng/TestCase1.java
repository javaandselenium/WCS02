package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestCase1 {
	public WebDriver driver;
	@BeforeMethod
	public void openApp() {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("ghghggh");
		driver.findElement(By.id("pass")).sendKeys("hgfhgshgh");
		driver.findElement(By.name("login")).click();
		String t = driver.getTitle();
		
	Assert.assertEquals(t,"fgggfgfgh");
		SoftAssert s=new SoftAssert();
		s.assertEquals(t,"dfgjfgjh");
		
		
		Reporter.log(t,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		
		s.assertAll();
	}
	
	@AfterMethod
	public void closeapp() {
		driver.close();
	}

}

package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement dropdown = driver.findElement(By.id("gh-cat"));
	
	Select s=new Select(dropdown);
	s.selectByIndex(7);
	Thread.sleep(3000);
	s.selectByValue("267");
	Thread.sleep(3000);
	s.selectByVisibleText("Art");
	Thread.sleep(3000);
	
	
	driver.close();
	
	
	
	

	}

}

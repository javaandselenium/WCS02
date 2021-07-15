package waitingStatements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		WebDriverWait w=new WebDriverWait(driver,10);

		WebElement ele = driver.findElement(By.id("username"));
		
		w.until(ExpectedConditions.visibilityOf(ele)).sendKeys("gghgh");
		

		WebElement button = driver.findElement(By.xpath("//div[text()='Login ']"));
		w.until(ExpectedConditions.elementToBeClickable(button)).click();
		
		
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

}

package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Documents/June%20Batches/5_00%20PM%20Selenium/New%20folder/dropdown.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement dd = driver.findElement(By.id("MTR"));
		Select s=new Select(dd);
		s.selectByIndex(0);
		s.selectByValue("2");
		s.selectByVisibleText("chicken 65");
		
		s.deselectByIndex(0);
		s.deselectByVisibleText("chicken 65");
		s.deselectByValue("2");
		driver.close();
		

	}

}

package photo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
         //Typecasting
		TakesScreenshot ts=(TakesScreenshot)driver;
		//access the method photo will be taken and stored in RAM
		File src = ts.getScreenshotAs(OutputType.FILE);
		//Required location
		File dest=new File("./photo/amazon.png");
		//copy paste the photo rom RAM to required location
		FileUtils.copyFile(src, dest);
		
		driver.close();


	}

	
}

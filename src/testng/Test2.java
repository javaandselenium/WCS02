package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	@BeforeSuite
	public void BS() {
		Reporter.log("Before Suite",true);
	}
	
	@AfterSuite
	public void AS() {
		Reporter.log("AfterSuite",true);
	}
	
	@BeforeMethod
	public void BM() {
		Reporter.log("BeforeMethod",true);
	}
	
	@AfterMethod
	public void AM() {
		Reporter.log("AfterMetod",true);
	}
	
	@BeforeClass
	public void BC() {
		Reporter.log("Beoreclass",true);
	}
	
	@AfterClass
	public void AC() {
		Reporter.log("AfterClass",true);
	}
	
	@AfterTest
	public void AT() {
		Reporter.log("AfterTest",true);
	}
	
	@BeforeTest
	public void BT() {
		Reporter.log("BeforeTest",true);
	}
	
	
	@Test
	public void test() {
		Reporter.log("TestMethod",true);
	
	}
	
	


}

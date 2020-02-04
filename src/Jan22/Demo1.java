package Jan22;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class Demo1 {
	@Test
	public void tc1() {
		Reporter.log("executing tec1",true);
	}
	@Test
	public void tc2() {
		Reporter.log("executing tc2",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("running before method",true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("running after method",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("running before class",true);
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("running after class",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("running before test",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("running after test",true);
	}
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("running before suite");
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("running after suite",true);
	}

}

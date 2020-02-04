package jan23;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
@BeforeTest
public void setUp()
{
Reporter.log("Running steup",true);	
}
@Test(description="Verify Login",priority=0,enabled=true)
public void login()
{
	Reporter.log("Executiong login Test",true);
}
@Test(description="Verify Compose",priority=2,enabled=true)
public void compose()
{
	Reporter.log("Executiong compose Test",true);
}
@Test(description="Verify Forward",priority=1,enabled=false)
public void forward()
{
	Reporter.log("Executiong forward Test",true);
}
@AfterTest
public void tearDown()
{
	Reporter.log("Running teardown",true);
}
}

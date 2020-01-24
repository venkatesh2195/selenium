package jan23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Demo4 {
	WebDriver driver;
	@Test(invocationCount=2)
	public void registerlink() throws Throwable {
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Reg")).click();
		Reporter.log("excecuting register link",true);
		Thread.sleep(5000);
		driver.close();

	}
}
